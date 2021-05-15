# Imagen base para compilar la aplicación
FROM maven:3.6.3-openjdk-11-slim AS build

# Indicar la ruta del directorio de trabajo
WORKDIR /usr/src/app

# Copiar el contendio de el directorio actual al directorio de trabajo
COPY . .

# Compilar la aplicación
RUN mvn clean package

# Imagen para ejecutar la aplicación
FROM openjdk:11.0-jre-slim-buster

# Información sobre la imagen
LABEL "edu.pingpong.fastBreakTruck"="Kata Fast Break Truck" \
        version="1.0" \
        description="Kata Fast Break Truck en Java" \
        maintainer="jruiz@cifpfbmoll.eu"

# Exponer en el puerto 5000
EXPOSE 5000

# Copiar el archivo .jar de la build anterior
COPY --from=build /usr/src/app/target/fastBreakTruck-1.0-SNAPSHOT.jar ./fastBreakTruck-1.0-SNAPSHOT.jar

# Punto de entrada de la aplicación
ENTRYPOINT ["java", "-jar", "fastBreakTruck-1.0-SNAPSHOT.jar"]