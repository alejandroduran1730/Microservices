# STUDENTS AND COURSES MANAGEMENT SPRING BOOT MICROSERVICE APPLICATION

## DESCRIPTION
This practice project consists of a web application with a microservices architecture using the API Gateway design pattern.
The API Gateway manages two microservices that register (by importing) students and courses; both microservices communicate with each other, and each has its own database (MySQL and PostgreSQL).
Configuration is centralized and managed through Config Server, and Eureka is used for service registration.

# Technologies
- Spring Boot
- Maven
- Confign Server
- Eureka
- Java
- PostgreSQL
- MySQL
- IntelliJ IDEA Community Edition

# Requirements
- JDK 21+
- Maven 3+
- MySQL 8+
- PostgreSQL 13+

# Run
To run the project, follow the steps below:
- Clone the repository `git clone https://github.com/alejandroduran1730/Microservices.git`
- Create a MySQL database called **studentDb**
- Create a PostgreSQL database called **coursesDb**
- From the IDE, run the microservices in the next order: Config Server, Eureka, Student, Course, and Gateway
- The application will be available at (http://localhost:8080)

## Notes:
- Change the datasource password for the **msvc-student.yml** and **msvc-course.yml** according to your database management systems.
- In the API Gateway: (http://localhost:8761/eureka) you will be able to view a list of the registered microservices.
