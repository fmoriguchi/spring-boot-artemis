FROM maven:3.9.4-eclipse-temurin-17-alpine AS builder

WORKDIR /app

ADD . /app

RUN --mount=type=cache,target=/root/.m2 mvn -f /app/pom.xml clean package

FROM eclipse-temurin:17-alpine
 
COPY --from=builder /app/target/spring-boot-artemis-*.jar /startup.jar
 
CMD ["java", "-Xmx500m", "-jar", "/startup.jar"]
