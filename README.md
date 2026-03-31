# Student Management & Course Registration System

## Project Overview
This is a full-stack Java Spring Boot application developed for the **Final Project**. The system manages student records, course administration, and a registration module that links students to their respective courses.

## Features
* **Interactive Dashboard:** Real-time counters for total students, courses, and registrations.
* **Student Management:** Full CRUD (Create, Read, Update, Delete) functionality for student profiles.
* **Course Administration:** Management of university courses including credits and lecturers.
* **Smart Registration:** A module allowing students to register for courses with built-in logic to **prevent duplicate registrations** (Extra Mark Feature).
* **Responsive UI:** Styled with Bootstrap 5 for a professional, user-friendly experience.

##  Technology Stack
* **Backend:** Java 17+, Spring Boot 3.x (Spring Data JPA, Spring Web)
* **Frontend:** Thymeleaf, HTML5, CSS3, Bootstrap 5
* **Database:** PostgreSQL
* **Build Tool:** Maven

## Project Structure
Following the **Layered Architecture** pattern:
- `model`: Entity classes (Student, Course, Registration) representing database tables.
- `repository`: Interfaces extending JpaRepository for database communication.
- `service`: Business logic layer (includes registration validation).
- `controller`: Web layer handling HTTP requests and UI routing.
- `resources/templates`: Thymeleaf HTML views.

## Setup & Installation
1.  **Database Configuration:**
    - Create a PostgreSQL database named `student_db`.
    - Update `src/main/resources/application.properties` with your PostgreSQL username and password.
2.  **Running the App:**
    - Open the project in your IDE (IntelliJ/VS Code) or terminal.
    - Run the command: `./mvnw spring-boot:run`
    - Access the system at: `http://localhost:8080`

## Challenges & Lessons Learned
* **Challenge:** Handling data binding between the Controller and Thymeleaf templates, specifically for many-to-one relationships in the Registration module.
* **Solution:** Implemented hidden ID fields and used `@ModelAttribute` to ensure data integrity during form submissions.
* **Lesson:** Learned the importance of clear naming conventions between Java variables (e.g., `yearOfStudy`) and HTML fields to prevent `PropertyNotFound` exceptions.

## Group Members
- [Zamzam Arafat Bilal / CS/MK/1968/09/23]
- [Ivy Jeruto Sareto/ CS/M/0722/09/23]
- [Mercy Jepkemoi Cheruiyot/ CS/MK/1283/09/23]