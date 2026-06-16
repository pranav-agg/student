# Student Record API Backend

A Spring Boot REST API that manages student data records, integrates with a MySQL database. Built to run natively in cloud environments and optimized for Google Kubernetes Engine (GKE).

## Tech Stack
* **Java:** Version 25
* **Framework:** Spring Boot 4.1.0 (with Spring Data JPA & Web MVC)
* **Database:** MySQL 8.0
* **Build Tool:** Maven

## Key Features
* **Separation of Concerns:** Environment configuration split into non-sensitive (ConfigMaps) and sensitive (Secrets) properties.
* **Cloud Ready:** Structured specifically to operate behind a GKE Ingress controller with localized fallback mapping.

---

## Local Development Setup

### Prerequisites
* OpenJDK 25 installed
* Apache Maven installed
* A local MySQL instance running on port 3306 with a schema named `student_db`

### Running Locally (IntelliJ or Terminal)
1. Ensure your local MySQL instance is active.
2. The application will boot up on port 5000


## API Endpoints
GET / - Root health check endpoint (returns a 200 OK required for GKE Ingress controllers).

GET /api/students - Fetches all student records from the database.