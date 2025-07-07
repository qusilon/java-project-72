plugins {
    id("java")
    id("org.sonarqube") version "6.2.0.5505"
    checkstyle
    jacoco
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.jacocoTestReport {
    reports {
        xml.required.set(true)
    }
}

sonar {
    properties {
        property("sonar.projectKey", "qusilon_java-project-72")
        property("sonar.organization", "qusilon")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}