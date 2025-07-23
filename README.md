# Task API Architecture (Kotlin + Spring Boot)

This is a simple example of a clean, scalable backend architecture using **Kotlin** and **Spring Boot**.  
It follows a layered structure using:

- Controller
- Service (Interface)
- DTO (Data Transfer Object)
- Domain/Model (Entity)

---

## 📁 Project Structure

```

task-api-architecture/
│
├── controller/
│   └── TaskController.kt
│
├── service/
│   └── TaskService.kt
│
├── dto/
│   └── TaskDTO.kt
│
├── model/
│   └── Task.kt

```

---

## 🔧 Technologies Used

- Kotlin
- Spring Boot (for REST API)
- Layered architecture
- Clean code principles

---

## ▶️ How to Run

> Follow these steps if you're a beginner:

1. Make sure you have **Java 17+** and **IntelliJ IDEA** installed.
2. Clone this repo:
```

git clone [https://github.com/gedionzewdu/task-api-architecture.git](https://github.com/gedionzewdu/task-api-architecture.git)

```
3. Open the project in IntelliJ IDEA
4. Make sure Gradle/Maven loads correctly
5. Run `TaskApiApplication.kt` or your main class
6. Test the API using Postman or browser

---

## ✅ API Sample

**GET `/tasks`** → Returns sample tasks  
**POST `/tasks`** → Create a new task

---

## 📌 Note

This is a minimal working example.  
It can be expanded with:

- Real database (PostgreSQL)
- Repository layer
- Spring Security
- Unit Tests
- Docker support

---

## ✍️ Author

Gedion Zewdu  
GitHub: [gedionzewdu](https://github.com/gedionzewdu)
