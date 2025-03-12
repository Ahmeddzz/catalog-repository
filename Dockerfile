FROM eclipse-temurin:17
WORKDIR workspace
COPY target/*.jar catalog-service.jar
ENTRYPOINT ["java", "-jar", "catalog-service.jar"]