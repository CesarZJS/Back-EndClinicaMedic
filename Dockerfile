# 1️⃣ Usa Maven para construir la app
FROM maven:3.8.6-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# 2️⃣ Usa OpenJDK para ejecutar la app
FROM openjdk:17
WORKDIR /app
COPY --from=build /app/target/citasmedicas-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]
