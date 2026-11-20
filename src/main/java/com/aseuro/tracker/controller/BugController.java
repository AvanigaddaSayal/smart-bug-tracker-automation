package com.aseuro.tracker.controller;

import com.aseuro.tracker.model.BugTicket;
import com.aseuro.tracker.repository.BugRepository;
import com.aseuro.tracker.service.AiTriageService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/bugs")
public class BugController {

    private final BugRepository repository;
    private final AiTriageService aiService;

    public BugController(BugRepository repository, AiTriageService aiService) {
        this.repository = repository;
        this.aiService = aiService;
    }

    @PostMapping
    public BugTicket createBug(@RequestBody BugTicket ticket) {
        String predictedPriority = aiService.predictPriority(ticket.getTitle(), ticket.getDescription());
        ticket.setPriority(predictedPriority);
        ticket.setStatus("OPEN");
        return repository.save(ticket);
    }

    @GetMapping
    public List<BugTicket> getAllBugs() {
        return repository.findAll();
    }
}
