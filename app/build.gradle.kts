plugins {
    java
    id("de.gliderpilot.semantic-release") version "1.4.2"
    id("org.springframework.boot") version "2.4.2"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
}

sourceSets {
    main {
        java {

        }
    }
}

configurations {
    all {
        exclude(mapOf("group" to "org.springframework.boot", "module" to "spring-boot-starter-logging"))
    }
}

group = "com.example"
version = "1.0.0"

repositories {
    mavenLocal()
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-validation")

    testImplementation("org.springframework.security:spring-security-test")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.2")
    testImplementation("org.mockito:mockito-core:3.7.7")
    testImplementation("org.mockito:mockito-junit-jupiter:3.7.7")
}

tasks.test {
    useJUnitPlatform()
}

tasks.bootRun {
    environment("spring_profiles_active", "local")
}
