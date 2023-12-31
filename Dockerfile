# Use the official OpenJDK base image
FROM openjdk:8-jre-slim
# Expose the port that the application will run on
EXPOSE 8071
# Set the working directory
WORKDIR /app
# Copy the Spring Boot application JAR file into the container
COPY target/Contract-0.0.1-SNAPSHOT.jar app.jar
# Define the command to run the application when the container starts
CMD ["java", "-jar", "app.jar"]