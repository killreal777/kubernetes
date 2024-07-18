FROM openjdk:17-jdk-slim-buster
WORKDIR /app
COPY target/redirect-service-0.0.1-SNAPSHOT.jar /app/redirect-service.jar
ENTRYPOINT ["java", "-jar", "redirect-service.jar"]
EXPOSE 8040