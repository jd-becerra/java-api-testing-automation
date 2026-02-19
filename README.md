# REST API Test Automation Framework (Java)

A **clean, modular REST API test automation framework** built with **Java, RestAssured, TestNG, and Log4j2**, designed to validate CRUD operations against a public REST API.

This project demonstrates best practices in **API testing, test design, data-driven testing, logging, and maintainable architecture**.

---

## Project Overview

This framework automates validation of **User-related API endpoints**, covering:

* GET (all users & single user)
* POST (create user)
* PUT (update user)
* DELETE (remove user)

It is currently integrated with the public API
**[https://jsonplaceholder.typicode.com/users](https://jsonplaceholder.typicode.com/users)**, but the design allows easy adaptation to any RESTful service.

---

## Tech Stack

* **Java**
* **RestAssured** – REST API testing
* **TestNG** – test execution & grouping
* **Log4j2** – structured logging
* **Hamcrest** – expressive assertions
* **Maven** – dependency management

---

## Architecture & Design

The framework follows a layered and modular design:

```
src
 ├── models        → POJOs representing API data
 ├── services      → API interaction layer (REST calls)
 ├── tests         → TestNG test cases
 ├── providers     → DataProviders for data-driven testing
 └── utils         → Shared utilities (logging, helpers)
```

### Key Design Decisions

* **Separation of concerns**:
  Tests never handle HTTP logic directly.
* **Service layer abstraction**:
  API calls are centralized and reusable.
* **Model-based validation**:
  JSON responses are deserialized into Java objects and compared by value.
* **Data-driven testing**:
  TestNG DataProviders enable scalable test coverage.
* **Consistent logging**:
  Every request and response is logged for traceability.

---

## Test Coverage

### GET Validations

* HTTP 200 response
* Correct `Content-Type` header
* Expected number of returned users
* Full object comparison for a single user

### POST Validations

* User creation returns HTTP 201

### PUT Validations

* User update returns HTTP 200

### DELETE Validations

* User deletion returns HTTP 200

Tests are grouped using **TestNG groups** for flexible execution:

* `getValidation`
* `postValidation`
* `putValidation`
* `deleteValidation`

---

## How to Run the Tests

### Prerequisites

* Java 8+
* Maven

### Run all tests

```bash
mvn test
```

### Run a specific group

```bash
mvn test -Dgroups=getValidation
```
