FROM amazoncorretto:8-alpine-jdk



COPY /target/Spring-Boot-0.0.1-SNAPSHOT.jar Spring-Boot-0.0.1-SNAPSHOT.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","/Spring-Boot-0.0.1-SNAPSHOT.jar"]