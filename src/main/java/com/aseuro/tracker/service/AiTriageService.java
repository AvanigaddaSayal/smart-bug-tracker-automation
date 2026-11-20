package com.aseuro.tracker.service;

import org.springframework.stereotype.Service;

@Service
public class AiTriageService {

    // Basic NLP keyword classifier simulating ML defect-priority prediction
    public String predictPriority(String title, String description) {
        String text = (title + " " + description).toLowerCase();
        if (text.contains("crash") || text.contains("nullpointer") || text.contains("security") || text.contains("down")) {
            return "HIGH";
        } else if (text.contains("slow") || text.contains("timeout") || text.contains("error")) {
            return "MEDIUM";
        }
        return "LOW";
    }
}
