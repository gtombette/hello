FROM eclipse-temurin:21.0.6_7-jdk-alpine
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]