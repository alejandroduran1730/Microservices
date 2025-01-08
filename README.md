AUTHOR: Alejandro Duran.
LINKEDIN: https://www.linkedin.com/in/alejandroperezduran/

DESCRIPTION:
This project consists of a web application with a microservices architecture using the API Gateway design pattern.
The API Gateway manages two microservices that register (by importing) students and courses; both microservices communicate with each other, and each has its own database (MySQL and PostgreSQL).
Configuration is centralized and managed through Config Server, and Eureka is used for service registration.

The order of microservices execution is as follows:
- Config Server
- Eureka
- Student
- Course
- Gateway
