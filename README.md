# Spring Boot REST API - Product Management System

This project is a RESTful Web Service built with Spring Boot, demonstrating the implementation of a layered architecture, custom exception handling, and JPA persistence with an H2 database.

## 🛠️ Tech Stack
- **Framework**: Spring Boot 3.x
- **Database**: H2 (In-Memory / Volatile)
- **Data Access**: Spring Data JPA
- **Testing**: Postman

## 🚀 API Documentation & Screenshots

### 1. Create Product (POST)
Successfully adding a new product to the database.
- **Endpoint**: `POST /products`
- **Result**: Returns the created object with a generated ID.
<img width="750" height="750" alt="Screenshot 2026-01-13 135828" src="https://github.com/user-attachments/assets/c4cbbb10-719c-4c66-ba71-9c933e160e8f" />


### 2. Retrieve All Products (GET)
Fetching the full list of products stored in the H2 database.
- **Endpoint**: `GET /products`
<img width="750" height="750" alt="Screenshot 2026-01-13 135931" src="https://github.com/user-attachments/assets/62491862-43cf-4176-abcb-93e8746eff0f" />


### 3. Update Product (PUT)
Updating an existing entry (changing ID 4 from "BMW M4" to "BMW E39").
- **Endpoint**: `PUT /products/4`
<img width="750" height="750" alt="Screenshot 2026-01-13 140137" src="https://github.com/user-attachments/assets/6af56a14-4f45-4fe0-9aca-4b0f342572a4" />


### 4. Custom Exception Handling (404 Not Found)
Demonstrating the Global Exception Advisor catching a search for a non-existent ID.
- **Endpoint**: `GET /products/999`
- **Response**: Custom JSON error message.
<img width="750" height="750" alt="Screenshot 2026-01-13 140340" src="https://github.com/user-attachments/assets/9b330314-fb47-4955-8586-c56e9421f61b" />


### 5. Delete Product (DELETE)
Removing a specific record from the system.
- **Endpoint**: `DELETE /products/4`
<img width="750" height="750" alt="Screenshot 2026-01-13 140236" src="https://github.com/user-attachments/assets/08571831-dca2-46a5-9f77-84350f225275" />


## 📊 Database Verification (H2 Console)
The following screenshot confirms that the data is successfully persisted in the relational `PRODUCT` table within the H2 engine.
- **Console URL**: `http://localhost:8080/console`
- **Query**: `SELECT * FROM PRODUCT;`
<img width="1316" height="881" alt="Screenshot 2026-01-13 134322" src="https://github.com/user-attachments/assets/887629bd-1857-4b60-8847-877817ee7d4a" />


---
Developed as part of the First REST API Spring coursework.
