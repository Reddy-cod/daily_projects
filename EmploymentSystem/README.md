# Employment System

A Java Spring Boot application for managing employees and compensation details, as described in the HR case study.

## Features

- Add, search, view, edit employees
- Add, view, edit compensation details
- Layered architecture with Spring Boot, Spring MVC, Spring Data JPA, Thymeleaf

## Getting Started

1. Build and run with Maven:
    ```
    mvn spring-boot:run
    ```
2. Access the app at [http://localhost:8080/](http://localhost:8080/)

## Project Structure

- `entity/` - JPA entities (Employee, Compensation)
- `repository/` - Spring Data JPA repositories
- `service/` - Business logic
- `controller/` - Web controllers (Spring MVC)
- `templates/` - Thymeleaf HTML templates

## Database

- Uses H2 in-memory DB by default. Access H2 console at `/h2-console`.

---

Extend the implementation per user stories!