FROM amazoncorretto:8-alpine-jdk

MAINTAINER karinasol

COPY target/Spring-Boot-0.0.1-SNAPSHOT.jar Spring-Boot-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/Spring-Boot-0.0.1-SNAPSHOT.jar"]