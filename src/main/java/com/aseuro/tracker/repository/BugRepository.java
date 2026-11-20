package com.aseuro.tracker.repository;

import com.aseuro.tracker.model.BugTicket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface BugRepository extends JpaRepository<BugTicket, Long> {

    List<BugTicket> findByStatus(String status);

    @Query(value = "SELECT * FROM bug_tickets WHERE priority = 'HIGH' ORDER BY created_at DESC", nativeQuery = true)
    List<BugTicket> findCriticalBugsNative();
}
