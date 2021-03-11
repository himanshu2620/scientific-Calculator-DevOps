FROM openjdk:8
COPY ./target/scientificCalculator-devops-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "scientificCalculator-devops-1.0-SNAPSHOT.jar", "calculator"]
