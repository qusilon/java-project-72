FROM eclipse-temurin:21-jdk

ARG GRADLE_VERSION=8.10

WORKDIR /app

COPY . .

RUN ./gradlew installDist

CMD ./build/install/app/bin/app