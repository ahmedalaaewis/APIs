# API Testing Framework

This project is a simple API testing framework built in Java using RestAssured. It provides a foundation for performing HTTP requests (GET, POST, PUT, DELETE) with customizable request parameters. The framework is designed to be modular and extensible, allowing users to easily write and execute API tests.

## Prerequisites

Before you begin, ensure you have the following installed:

- Java Development Kit (JDK) 8 or later
- Maven

## Getting Started

### Clone the Repository

```bash
git clone <repository-url>
cd <repository-name>
```

### Project Structure

- `src/main/java/Requests`: Contains classes for different HTTP request types (GET, POST, PUT, DELETE).
- `src/test/java`: Place your test classes in this directory.

## Usage

### Configuring the Base URL

In your test classes (e.g., `APITestNGTest`), set the `baseUrl` variable to the target API's base URL. Adjust the `endpoint` variable based on the specific endpoint you want to test.

```java
private String baseUrl = "https://api.example.com";
private String endpoint = "/api/v1/resource";
```

### Writing API Tests

1. **Create a Test Class:**
   Create a new test class in the `src/test/java` directory. You can use `APITestNGTest` as a template.

2. **Write Test Methods:**
   Write test methods within your test class to perform API testing. Utilize the methods provided by the request classes (e.g., `sendGetRequest`, `sendPostRequest`).

```java
@Test
public void testGetRequest() {
    // Your test logic here
    Response response = getRequest.sendRequest("GET");
    // Additional assertions and validations
}
```

3. **Run Tests:**
   Use Maven to run your tests:

```bash
mvn test
```
