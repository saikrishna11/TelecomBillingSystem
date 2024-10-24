# Use an official Java runtime as a parent image
FROM openjdk:21-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the jar file into the container
COPY target/plan-service*.jar plan-service.jar

# Expose the service port
EXPOSE 8083

# Run the jar file
ENTRYPOINT ["java", "-jar", "plan-service.jar"]
