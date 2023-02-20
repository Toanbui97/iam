ARG MVN_VERSION=3.8.3
ARG JDK_VERSION=17

FROM maven:${MVN_VERSION}-openjdk-${JDK_VERSION}-slim

WORKDIR /app
COPY ../pom.xml .
COPY ../iam-api/pom.xml ./iam-api/
COPY ../iam-core/pom.xml ./iam-core/

COPY ../iam-api/src ./iam-api/src/
COPY ../iam-core/src ./iam-core/src/

RUN mvn clean install -U

WORKDIR /app/iam-api/target
EXPOSE 7070
ENTRYPOINT ["java", "-jar", "iam-api-0.0.1-SNAPSHOT.jar"]

