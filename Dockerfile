FROM eclipse-temurin:17
WORKDIR workspace
COPY target/catalog-service-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java", "-jar", "catalog-service-0.0.1-SNAPSHOT.jar"]