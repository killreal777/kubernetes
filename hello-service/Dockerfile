FROM openjdk:17-jdk-slim-buster
WORKDIR /app
COPY target/hello-service-0.0.1-SNAPSHOT.jar /app/hello-service.jar
ENTRYPOINT ["java", "-jar", "hello-service.jar"]
EXPOSE 8000