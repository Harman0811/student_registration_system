# Student Registration System

A web application where students register through an online form and the records are stored in a MySQL database. Built with Spring Boot and Thymeleaf.

## Features
- Register a student (name, email, course) through a form
- Store records in MySQL using Spring Data JPA
- View all registered students in a table

## Tech Stack
Java, Spring Boot, Spring Data JPA, MySQL, Thymeleaf, HTML, CSS

## How to Run
1. Start MySQL on port 3306 (WAMP/XAMPP default: user `root`, empty password).
2. Create the database:
   ```sql
   CREATE DATABASE student_db;
   ```
3. If your MySQL setup differs, edit `demo/src/main/resources/application.properties`.
4. Run the app:
   ```
   cd demo
   mvnw spring-boot:run
   ```
5. Open http://localhost:8083

## Screenshots
![Registration page](screenshots/register.png)
![Success page](screenshots/success.png)
![Student list](screenshots/students.png)
