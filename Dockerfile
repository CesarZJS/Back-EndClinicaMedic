# Usar una imagen base de Java (puedes cambiar la version si es necesario)
FROM openjdk:17-jdk-slim

# Establecer el directorio de trabajo en el contenedor
WORKDIR /app

# Copiar el archivo JAR del proyecto al contenedor
COPY target/citasmedicas-0.0.1-SNAPSHOT.jar app.jar


# Comando para ejecutar la aplicacion
CMD ["java", "-jar", "app.jar"]