# Spring Boot REST CRUD API with Hibernate

## API Requirements

Create a REST API for a Parts Directory that will implement basic CRUD features.

Project Setup Dependencies:
- Spring Web
- Spring Data JPA
- MYSQL Driver (JDBC)

The REST client should be able to:
1. Get a list of parts
2. Get a single part by id
3. Add a new part
4. Update a part
5. Delete a part

### REST API

---

| HTTP Method | API Endpoint    | CRUD Action             |
|--------------|-----------------|-------------------------|
| POST         | parts           | Create a new part       |
| GET          | parts           | Read a list of parts    |
| GET          | parts/{partsId} | Read a single part      |
| PUT          | parts           | Update an existing part |
| DELETE       | parts/{partsId} | Delete an existing part |

### Development Process

---

1. Set up the database development environment.
2. Create Spring Boot project using Spring Initializr (available on the web).
3. Get a list of all the parts in the database.
4. Get a single part by ID.
5. Add a new part.
6. Update an existing part.
7. Delete an existing part.

### Application Architecture (with Java, Spring Boot, Hibernate, and MySQL)

---

![Architecture flow chart](https://i.ibb.co/wcBZJQw/Spring-REST-Web-Services.webp)

#### *Parts REST Controller <-> Parts Service <-> Parts DAO (Hibernate) <-> Database*