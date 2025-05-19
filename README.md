This is a backend application for managing products, implemented with Java Spring Boot and MySQL database.
## 1. Backend Implementation

- Language: Java 17+
- Framework: Spring Boot
- Database: MySQL (can be replaced with SQL Server or PostgreSQL)
- Dependency management: Maven

 ## 2. Product Model

Each product has the following attributes:

- `id` (Long) — auto-generated identifier
- `name` (String) — required
- `description` (String) — optional
- `price` (BigDecimal) — required, must be ≥ 0
- `quantityInStock` (Integer) — required, must be ≥ 0
- `category` (String) — optiona

## 3. Database Configuration

Configure your MySQL connection in `src/main/resources/application.properties`:
