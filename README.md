# 🎓 Training Academy Management System – Backend

Backend API for the **Training Academy Management System** built using **Spring Boot**.  
This service manages authentication, courses, trainers, and students, and exposes REST APIs used by the frontend application.

---

## 🚀 Overview

The backend provides APIs to manage training academy operations including users, courses, and trainer assignments.  
It connects with a React frontend to deliver a complete full-stack application.

---

## 🛠 Tech Stack

- ☕ Java  
- 🌱 Spring Boot  
- 📦 Spring Data JPA  
- 🗄 MySQL  
- 🔧 Maven  
- 🔗 REST APIs  

---

## ✨ Features

- 🔐 Role-based authentication (Admin / Trainer)
- 📚 Course management
- 👨‍🏫 Trainer management
- 👨‍🎓 Student management
- 🔗 Assign students to trainers
- ⚡ REST API integration with frontend

---

## 📁 Project Structure

```
src/main/java/

controller   → REST API endpoints  
service      → Business logic  
repository   → Database operations  
entity       → JPA entities  
config       → Configuration classes  

src/main/resources/

application.properties
```

---

## ⚙️ Setup Instructions

### 📥 Clone the repository

```bash
git clone https://github.com/akilan-12/training-academy-backend.git
```

### 📂 Navigate to the project folder

```bash
cd training-academy-backend
```

### 🗄 Configure database

Update `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/training_academy
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### ▶️ Run the application

```bash
mvn spring-boot:run
```

Backend server runs at:

```
http://localhost:8080
```

## 💻 Frontend Repository

🔗 https://github.com/akilan-12/training-academy-frontend

---

## 🌐 Live Application

🔗 https://training-academy-backend.onrender.com
