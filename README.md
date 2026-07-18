# Transpera

Transpera is a Java Spring Boot based Vehicle Management and Tracking System designed to simplify fleet management for businesses and vehicle owners. It provides an intuitive dashboard for managing vehicles, monitoring fleet information, and maintaining organized vehicle records through a secure web application.

---

## Features

-  User Registration & Login
-  Vehicle Management (CRUD Operations)
-  Interactive Dashboard
- OpenStreetMap Integration using Leaflet
-  User-Vehicle Relationship (One-to-Many)
-  Database Integration with JPA/Hibernate
-  Responsive User Interface
-  Vehicle Location Visualization

---

## Tech Stack

### Backend
- Java 17
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate

### Frontend
- Thymeleaf
- HTML5
- CSS3
- JavaScript

### Database
- MySQL

### Tools
- Maven
- Git
- GitHub
- IntelliJ IDEA / VS Code

### Maps
- OpenStreetMap
- Leaflet.js

---

## Project Structure

```
Transpera
│
├── controller
├── entity
├── repository
├── services
├── templates
├── static
│   ├── css
│   ├── js
│   └── images
├── application.properties
└── pom.xml
```

---

##  Installation

### Clone Repository

```bash
git clone https://github.com/yourusername/Transpera.git
```

### Open Project

Open the project in IntelliJ IDEA, Spring Tool Suite, or VS Code.

### Configure Database

Create a MySQL database:

```sql
CREATE DATABASE transpera;
```

Update your `application.properties`.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/transpera
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### Run Project

```bash
mvn spring-boot:run
```

or run

```
DemoApplication.java
```

from your IDE.

---

##  Screens

- Login Page
- Registration Page
- Dashboard
- Add Vehicle
- View Vehicles
- Edit Vehicle
- Profile Page
- Interactive Map

---

## Current Modules

- User Authentication
- Vehicle CRUD
- Dashboard
- Vehicle Listing
- Map Integration
- Session Management
- Database Management

---

## Upcoming Features

- JWT Authentication
- Spring Security
- PostgreSQL Support
- Driver Management
- Fleet Analytics
- Vehicle Maintenance Alerts
- Fuel Consumption Reports
- Geofencing
- Trip History
- REST APIs
- Mobile Application
- Marketplace for Transport Services
- Live Vehicle Tracking
- Notifications
- Docker Deployment
- Cloud Deployment

---

## Project Objective

The objective of Transpera is to build a scalable fleet management platform that helps businesses efficiently manage vehicles, monitor fleet operations, and improve transportation workflows. The long-term vision is to evolve Transpera into a complete logistics ecosystem connecting fleet owners, drivers, and customers through a digital marketplace.

---

## Learning Outcomes

Through this project, I gained practical experience in:

- Spring Boot Development
- MVC Architecture
- RESTful Application Design
- Hibernate & JPA
- Database Design
- Git & GitHub
- Frontend Integration
- Map APIs
- Backend Architecture

---

##  Contributing

Contributions, suggestions, and feedback are welcome.

1. Fork the repository
2. Create your feature branch
3. Commit your changes
4. Push to the branch
5. Open a Pull Request

---

## Contact

**Puneet Singh**
Email: punitsingh1332005@gmail.com
GitHub: https://github.com/puneetsing

---

## Support

If you found this project helpful, please consider giving it a ⭐ on GitHub.
