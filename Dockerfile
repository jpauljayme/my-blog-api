FROM maven:3-eclipse-temurin-21-jammy AS build
COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin:21
RUN mkdir /opt/app
COPY japp.jar /opt/app
CMD ["java", "-jar", "/opt/app/japp.jar"]