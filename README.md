# 📘 Spring Boot Quiz Application Backend 
A complete **Quiz Management REST API** built using **Spring Boot 3**, **Hibernate/JPA**, and **MySQL**.  
This project allows you to:

✔ Add Questions  
✔ Create a Quiz based on Category & Number of Questions  
✔ Fetch Quiz Questions  
✔ Submit Quiz Responses  
✔ Get final score  
✔ Uses Many-to-Many mapping between Quiz & Questions  

---

## 🚀 Features

### ✅ 1. Manage Questions
- Add new questions  
- Store multiple options  
- Store correct answer, category & difficulty  
- Fetch random questions using SQL `ORDER BY RAND()`  

### ✅ 2. Quiz Creation
- Create quiz based on:
  - Category  
  - Number of questions  
  - Quiz title  
- Random question selection  
- Save quiz in DB  

### ✅ 3. Attempt & Submit Quiz
- Fetch quiz questions without revealing answers  
- Submit quiz responses  
- Auto-calculate score  

### ✅ 4. Database
- MySQL database  
- Many-to-Many Join Table `quiz_questions`  
- Auto schema generation  

---

## 🏗️ Tech Stack

- **Java 17+**
- **Spring Boot 3**
- **Spring Data JPA / Hibernate**
- **MySQL**
- **Lombok**
- **RESTful API**

---

