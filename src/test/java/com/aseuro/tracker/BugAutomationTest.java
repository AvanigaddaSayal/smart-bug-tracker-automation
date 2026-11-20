package com.aseuro.tracker;

import com.aseuro.tracker.service.AiTriageService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugAutomationTest {

    private final AiTriageService aiService = new AiTriageService();

    @Test
    void testHighPriorityClassification() {
        String result = aiService.predictPriority("Server Crash", "NullPointerException on login");
        assertEquals("HIGH", result, "Critical crash keywords should classify as HIGH priority");
    }

    @Test
    void testLowPriorityClassification() {
        String result = aiService.predictPriority("UI Alignment", "Button slightly off-center");
        assertEquals("LOW", result, "Minor UI issues should classify as LOW priority");
    }
}
