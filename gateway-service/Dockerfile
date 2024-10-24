# Use an official Java runtime as a parent image
FROM openjdk:21-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the jar file into the container
COPY target/gateway-service*.jar gateway-service.jar

# Expose the service port
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "gateway-service.jar"]
