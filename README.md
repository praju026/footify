# ⚽ FootiFy — Football Club Management System

A **Spring Boot backend application** that manages football clubs, players, trophies, and transfers with secure authentication and role-based access.

---

## 🚀 Features

### 🔹 Core Features

* Manage **Clubs, Players, Trophies, Transfers**
* Proper **JPA Relationships** (OneToMany, ManyToOne)
* Clean **layered architecture** (Controller → Service → Repository)
* DTO-based response structure

### 🔐 Security

* **JWT Authentication**
* **Role-based Authorization (ADMIN / USER)**
* Protected endpoints for write operations

### 🧠 Backend Best Practices

* Global **Exception Handling**
* Input **Validation (@Valid)**
* Clean API design

---

## 🛠️ Tech Stack

* **Java**
* **Spring Boot**
* **Spring Data JPA (Hibernate)**
* **Spring Security + JWT**
* **MySQL**
* **Maven**

---

## 🗄️ Database Design

### Club

* id
* name
* country
* stadium
* foundedYear
* coach
* logoUrl

### Player

* id
* name
* position
* jerseyNumber
* nationality
* age
* club_id (FK)

### Trophy

* id
* name
* year
* club_id (FK)

### Transfer

* id
* player_id (FK)
* fromClub
* toClub
* transferFee
* transferDate

### Users

* id
* username
* password
* role

---

## 🔐 Authentication Flow

1. User registers using `/auth/register`
2. User logs in using `/auth/login`
3. JWT token is generated
4. Token is sent in headers:

```http
Authorization: Bearer <token>
```

5. Protected endpoints require valid token + role

---

## 📡 API Endpoints

### 🔑 Auth

* `POST /auth/register`
* `POST /auth/login`

---

### 📊 Public APIs (No Authentication Required)

* `GET /clubs`
* `GET /players`
* `GET /trophies`
* `GET /transfers`

---

### 🔒 Admin APIs (Requires ADMIN Role)

* `POST /clubs`
* `POST /players/club/{clubId}`
* `POST /trophies/club/{clubId}`
* `POST /transfers/player/{playerId}`

---

## 📌 Sample Request

### Add Player

```json
POST /players/club/1

{
  "name": "Pedri",
  "position": "Midfielder",
  "jerseyNumber": 8,
  "nationality": "Spain",
  "age": 21
}
```

---

## ⚙️ Setup Instructions

### 1. Clone Repository

```bash
git clone https://github.com/your-username/footify.git
cd footify
```

### 2. Configure Database

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/footify
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### 3. Run Application

```bash
mvn spring-boot:run
```

---

## 🧪 Testing APIs

Use:

* Postman
* Swagger (if enabled)

---

## 📈 Future Improvements

* Pagination & Sorting
* Search APIs (by club, position, nationality)
* Swagger API documentation
* Frontend integration (React / Thymeleaf)

---

## 👨‍💻 Author

**Prajwal P**

---

## ⭐ If you like this project

Give it a ⭐ on GitHub!
