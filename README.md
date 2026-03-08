Training Academy Management System – Backend

Overview

This repository contains the Spring Boot backend API for the Training Academy Management System.

The backend handles authentication, course management, trainer management, and student management. It exposes REST APIs that are consumed by the React frontend.

Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- REST APIs

Features

- Role-based authentication (Admin / Trainer)
- Course management
- Trainer management
- Student management
- Assign students to trainers
- REST API integration with frontend

Project Structure

src/main/java/

- controller → REST API endpoints
- service → Business logic
- repository → Database operations
- entity → JPA entities
- config / utils → Helper configurations

src/main/resources/

- application.properties

Setup Instructions

1. Clone the repository

git clone https://github.com/akilan-12/training-academy-backend.git

2. Navigate to the project folder

cd training-academy-backend

3. Configure database in application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/training_academy
spring.datasource.username=your_username
spring.datasource.password=your_password

4. Run the application

Using Maven:

mvn spring-boot:run

Or run the main Spring Boot application class from your IDE.

The backend server will start on:

http://localhost:8080

API Base URL

http://localhost:8080/api

Frontend Repository

https://github.com/akilan-12/training-academy-frontend

Author

Akilan
