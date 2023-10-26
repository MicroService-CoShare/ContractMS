FROM openjdk:8
EXPOSE 8089
WORKDIR /app

COPY target/Contract-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]