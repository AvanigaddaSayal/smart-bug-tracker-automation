package com.aseuro.tracker.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "bug_tickets")
public class BugTicket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private String description;
    private String priority; // Assigned automatically via AI/ML rule/API
    private String status;   // OPEN, IN_PROGRESS, RESOLVED
    private LocalDateTime createdAt = LocalDateTime.now();

    public BugTicket() {}

    public BugTicket(String title, String description) {
        this.title = title;
        this.description = description;
        this.status = "OPEN";
    }

    // Getters and Setters
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getPriority() { return priority; }
    public void setPriority(String priority) { this.priority = priority; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
