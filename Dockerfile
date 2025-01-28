FROM openjdk:21-jdk-slim

WORKDIR /app

COPY target/Docker-0.0.1-SNAPSHOT.jar /app/

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "Docker-0.0.1-SNAPSHOT.jar"]
