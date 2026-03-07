
#  IdeaSync Backend

A Spring Boot–based backend application for the **IdeaSync** platform, providing REST APIs to manage, store, and track user ideas.
Built with **Java**, **Spring Boot**, and integrated with modern DevOps practices including CI automation and SonarCloud code quality analysis.

---

##  Summary

The IdeaSync Backend was developed using Spring Boot to provide secure and scalable RESTful services for the frontend application.
The backend repository follows professional software engineering workflows:

* Feature branch development with Pull Requests
* Automated CI pipeline using **GitHub Actions**
* Code quality and security scanning via **SonarCloud**
* Maven-based build and dependency management
* Ready for Dockerization and cloud deployment

This ensures reliable backend performance, maintainable code, and continuous integration support.

---

## Features

* **REST API Services** for idea management
* **Create & Retrieve Ideas** through endpoints
* **Structured Spring Boot Project Architecture**
* **Maven Build Support** with wrapper (`mvnw`)
* **SonarCloud Quality Checks** on every push/PR
* **CI Pipeline Verified** with green build status

---

##  Tech Stack

* **Java 17/21** (Temurin)
* **Spring Boot** – Backend framework
* **Maven** – Build & dependency tool
* **GitHub Actions** – CI pipeline automation
* **SonarCloud** – Static code analysis & quality gates

---

##  Project Structure

```
ideasync-backend/
├── src/
│   ├── main/
│   │   ├── java/com/ideasync/...
│   │   └── resources/
│   └── test/
├── pom.xml
├── mvnw / mvnw.cmd
└── .github/workflows/backend-ci.yml
```

---

## ⚙ Getting Started

### Prerequisites

* Java 17+ installed
* Maven installed (or use Maven Wrapper)

---

## ▶ Running the Backend Locally

### 1. Clone Repository

```bash
git clone https://github.com/<your-username>/ideasync-backend.git
cd ideasync-backend
```

### 2. Build the Project

Using Maven Wrapper:

```bash
./mvnw clean package
```

Or with Maven:

```bash
mvn clean package
```

### 3. Run the Application

```bash
./mvnw spring-boot:run
```

Backend will start at:

```
http://localhost:8000
```

---

##  API Endpoints

The backend provides REST endpoints such as:

* `GET /api/ideas` – Fetch all ideas
* `POST /api/ideas` – Create a new idea
* `DELETE /api/ideas/{id}` – Delete an idea

---

## CI/CD Pipeline

This repository includes an automated workflow:

* Runs on every push and pull request
* Builds the project using Maven
* Executes SonarCloud analysis
* Ensures code quality gates are passed

Pipeline file:

```
.github/workflows/backend-ci.yml
```

---

##  SonarCloud Integration

The backend is connected to SonarCloud for:

* Code smells detection
* Bug & vulnerability scanning
* Maintainability scoring
* Continuous quality monitoring

Secret used:

* `SONAR_TOKEN` stored in GitHub Secrets

---
<img width="1366" height="768" alt="Screenshot (51)" src="https://github.com/user-attachments/assets/9034f8c8-069c-4d3c-85c9-04265b7bba52" />

##  Future Enhancements

* Docker container deployment
* Backend hosting on Render/AWS
* Database integration (MySQL/PostgreSQL)
* Authentication and user management

---

##  Final Outcome

✔ Backend REST API successfully implemented
✔ CI pipeline automated with GitHub Actions
✔ SonarCloud quality gate passed
✔ Ready for deployment and scaling

