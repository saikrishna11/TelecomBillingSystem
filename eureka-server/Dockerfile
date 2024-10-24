# Use an official Java runtime as a parent image
FROM openjdk:21-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the jar file into the container
COPY target/eureka-server-1.0-SNAPSHOT.jar eureka-service.jar

# Expose the service port
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "eureka-service.jar"]
