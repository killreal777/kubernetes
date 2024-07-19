FROM openjdk:17-jdk-slim-buster
WORKDIR /app
COPY target/tomato-service-0.0.1-SNAPSHOT.jar /app/tomato-service.jar
ENTRYPOINT ["java", "-jar", "tomato-service.jar"]
EXPOSE 8080