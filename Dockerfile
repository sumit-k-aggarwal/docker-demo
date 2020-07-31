FROM openjdk:8-jre-alpine
COPY target/Hello-World-0.0.1-SNAPSHOT.jar Hello-World-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","Hello-World-0.0.1-SNAPSHOT.jar"]