# Spring Boot User Profile Management

This is a Spring Boot application for managing user profiles. The application supports different types of user profiles, including `AgentProfile`, `ContractorProfile`, and `TravelProfile`, which are subclasses of the `UserProfile` class.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- Java 11
- Gradle
- IntelliJ IDEA 2023.2 or any other IDE that supports Spring Boot

### Installing

1. Clone the repository to your local machine.
2. Open the project in your IDE.
3. Run the `gradle bootRun` command in the terminal to start the application.

## Usage

The application exposes several endpoints for managing user profiles:

- `POST /profile`: Create a new `UserProfile`.
- `PUT /profile/{id}`: Update an existing `UserProfile`.
- `POST /profile/agent`: Create a new `AgentProfile`.
- `POST /profile/travel`: Create a new `TravelProfile`.
- `POST /profile/contractor`: Create a new `ContractorProfile`.
- `DELETE /profile/{id}`: Delete an existing `UserProfile`.
- `GET /profile/{id}`: Retrieve a specific `UserProfile`.

## Built With

- [Spring Boot](https://spring.io/projects/spring-boot) - The web framework used
- [Gradle](https://gradle.org/) - Dependency Management

## Authors

- DoKyungHan0114

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
