# Stage 1: Build the application
FROM maven:latest AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Run the application
FROM eclipse-temurin:25-jre-jammy
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

# Expose the port the app runs on
EXPOSE 5000

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
