FROM gradle:7.4.1-jdk11
EXPOSE 8080
USER root
ARG JAR_FILE=./build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]