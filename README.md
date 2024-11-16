# Telecom Billing System

## Overview

The Telecom Billing System is a microservices-based application designed to manage customer data, billing information, and plans for a telecommunications service provider. This project is built using Spring Boot for the backend and React for the frontend.

## Modules

This project consists of several microservices and a UI module:

- **Eureka Server**: Service discovery server to manage microservices.
- **Gateway Service**: API gateway that routes requests to the appropriate microservice.
- **Customer Service**: Manages customer information and CRUD operations.
- **Billing Service**: Handles billing and payment processing.
- **Plan Service**: Manages service plans and offers.
- **Common Library**: Shared utilities and configurations among microservices.
- **UI**: Frontend application built with React to interact with the backend services.

## Technologies Used

- **Backend**:
    - Java 21
    - Spring Boot 3.3.4
    - Spring Security
    - MongoDB (for database management)
    - Docker (for containerization)

- **Frontend**:
    - React (latest version)
    - Axios (for HTTP requests)

## Getting Started

### Prerequisites

- Java 21
- Maven
- Docker
- Node.js and npm (for the React UI)

### Installation

1. **Clone the repository**:

   ```bash
   git clone https://github.com/saikrishna11/TelecomBillingSystem.git
   cd telecom-billing-system

2. **Build the backend services**:

   Navigate to each microservice directory (e.g., customer-service, billing-service, etc.) and run:
   ```bash
   mvn clean install

3. **Run Docker Compose:**

   In the root directory of the project, run:
   ```bash
   docker-compose up --build

This will start all the microservices defined in the docker-compose.yml file.


## API Documentation

### Customer Service
- Base URL: /customers
  - GET /customers: Fetch all customers.
  - POST /customers: Create a new customer.
  - GET /customers/{id}: Fetch customer by ID.
  - PUT /customers/{id}: Update customer by ID.
  - DELETE /customers/{id}: Delete customer by ID.

### Billing Service
- Base URL: /bills
  - GET /bills: Fetch all bills.
  - POST /bills: Create a new bill.
  - GET /bills/{id}: Fetch bill by ID.
  - PUT /bills/{id}: Update bill by ID.
  - DELETE /bills/{id}: Delete bill by ID.

### Plan Service
- Base URL: /plans
  - GET /plans: Fetch all plans.
  - POST /plans: Create a new plan.
  - GET /plans/{id}: Fetch plan by ID.
  - PUT /plans/{id}: Update plan by ID.
  - DELETE /plans/{id}: Delete plan by ID.

## Running Tests
  To run the tests for the backend services, navigate to each microservice directory and execute:

  ``` bash
  mvn test
  ```
  
## Contributing
  Contributions are welcome! If you have suggestions for improvements or want to add features, please fork the repository and submit a pull request with your changes.