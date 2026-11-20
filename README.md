# SmartBug Tracker & Automated Defect Triage System

A backend RESTful application built with **Core Java, Spring Boot, Hibernate (JPA), and SQL**, featuring an automated defect-priority classifier and **JUnit 5** automated test suite.

## Tech Stack
* **Language:** Core Java (OOP, Collections, Streams)
* **Framework:** Spring Boot 3 (REST APIs, Dependency Injection)
* **ORM & Database:** Hibernate / Spring Data JPA, H2 / MySQL-compatible SQL (`queries.sql` included)
* **Automation & Testing:** JUnit 5 Automated Test Suite
* **AI/ML Concept:** Automated NLP keyword-based severity classification

## Key Features
1. **RESTful Defect Management:** Create, fetch, and filter software bugs via `/api/bugs`.
2. **Automated Triage Engine:** Automatically assigns `HIGH`, `MEDIUM`, or `LOW` priority based on bug description text analysis.
3. **Database Persistence:** Uses Hibernate ORM alongside custom native SQL queries (`GROUP BY`, `ORDER BY`, filtering).
4. **Automated Verification:** Includes unit test cases validating classification accuracy.

## How to Run
1. Run `BugAutomationTest.java` to execute the JUnit 5 automated test suite.
2. Run `TrackerApplication.java` to start the server on `http://localhost:8080`.
