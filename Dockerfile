# Stage 1: Build application with Maven and JDK 21
FROM maven:3.9.6-eclipse-temurin-21-alpine AS build
WORKDIR /app

# Copy pom.xml and cache dependencies
COPY pom.xml .
RUN mvn dependency:go-offline -B || true

# Copy source code and build jar
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Minimal runtime image with JRE 21
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

# Create data and uploads directories
RUN mkdir -p /app/data /app/src/main/resources/static/uploads

# Copy jar from build stage
COPY --from=build /app/target/tour-management-0.0.1-SNAPSHOT.jar app.jar

# Render exposes and injects $PORT environment variable
EXPOSE 8080
ENV PORT=8080

ENTRYPOINT ["java", "-jar", "app.jar"]
