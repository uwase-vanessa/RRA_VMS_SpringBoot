# 🔐 Vanessa RRA VM System

A modular and secure Spring Boot authentication service that features:

- 🛡️ JWT-based authentication with access and refresh tokens
- 🔁 OTP (One-Time Password) generation and verification using Redis
- 👤 Role-based authorization
- 💾 Redis integration for secure temporary OTP storage
- 💼 Clean and extensible architecture

---

## 🚀 Features

- **JWT Token Management**
  - Access and refresh token generation
  - Claims-based JWT construction and parsing
  - Expiration and signature validation

- **OTP System**
  - OTP generation for different contexts (`EMAIL_VERIFICATION`, `PASSWORD_RESET`, etc.)
  - Secure Redis storage with time-to-live (10 minutes)
  - OTP validation and deletion upon use

- **Role-Based Access**
  - `User` and `Role` model integration for authorization
  - Extract role from JWT for secure decision making

---

## 🧱 Project Structure

```bash
com.vanessa.template
│
├── auth
│   ├── Jwt.java                # Encapsulates JWT data and logic
│   ├── JwtService.java         # Generates, parses, and validates JWTs
│   ├── OtpService.java         # Handles OTP creation, storage, and verification
│   ├── OtpType.java            # Enum for OTP purpose types
│   └── exceptions
│       └── InvalidJwtException.java
│
├── user
│   ├── User.java               # User entity with id, email, phone, role
│   └── Role.java               # Enum of user roles
│
├── config
│   └── RedisConfig.java        # RedisTemplate and ValueOperations bean definitions
│
└── Application.java            # Spring Boot main entry point


```
Redis run the container 
docker exec -it redis-container redis-cli -a spring-redis-password
Warning: Using a password with '-a' or '-u' option on the command line interface may not be safe.
127.0.0.1:6379> KEYS *
