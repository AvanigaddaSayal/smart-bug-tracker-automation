-- 1. Create table schema
CREATE TABLE IF NOT EXISTS bug_tickets (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    priority VARCHAR(20),
    status VARCHAR(20) DEFAULT 'OPEN',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- 2. Count open bugs grouped by priority
SELECT priority, COUNT(*) AS total_bugs
FROM bug_tickets
WHERE status = 'OPEN'
GROUP BY priority;

-- 3. Fetch top 5 recent high-priority defects
SELECT id, title, created_at
FROM bug_tickets
WHERE priority = 'HIGH'
ORDER BY created_at DESC
LIMIT 5;
