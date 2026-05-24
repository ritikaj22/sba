FROM maven:3.9.6-eclipse-temurin-17
WORKDIR /app

COPY pom.xml .

RUN mvn dependency:go-offline

COPY src .

# Build jar
RUN mvn clean package -DskipTests

# Rename jar properly
RUN cp target/*.jar app.jar


ENTRYPOINT ["java", "-jar", "app.jar"]