
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

FROM openjdk:8



COPY target/Spring-Boot-0.0.1-SNAPSHOT.jar Spring-Boot-0.0.1-SNAPSHOT.jar


ENTRYPOINT ["java","-jar","/Spring-Boot-0.0.1-SNAPSHOT.jar"]