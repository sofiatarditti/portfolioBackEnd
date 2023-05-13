
FROM amazoncorretto:17-alpine-jdk
MAINTAINER sofiatarditti
COPY target/SpringBoot-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]

