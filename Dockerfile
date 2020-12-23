FROM openjdk:8-jdk-alpine

VOLUME /deploy/yellowstone

COPY build/libs/yellowstone-*.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]

EXPOSE 8080