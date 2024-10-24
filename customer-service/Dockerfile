# Use an official Java runtime as a parent image
FROM openjdk:21-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the jar file into the container
COPY target/customer-service*.jar customer-service.jar

# Expose the service port
EXPOSE 8081

# Run the jar file
ENTRYPOINT ["java", "-jar", "customer-service.jar"]
