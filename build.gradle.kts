
plugins {
    kotlin("jvm") version "1.9.10"
    application
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
implementation("io.ktor:ktor-server-core:2.2.0")
implementation("io.ktor:ktor-server-netty:2.2.0")
implementation("ch.qos.logback:logback-classic:1.4.5")
implementation("org.jetbrains.exposed:exposed-core:0.43.0")
implementation("org.jetbrains.exposed:exposed-dao:0.43.0")
implementation("org.jetbrains.exposed:exposed-jdbc:0.43.0")
implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.15.0")
implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.2")
implementation("com.google.guava:guava:32.1.2-jre")
implementation("org.apache.commons:commons-lang3:3.13.0")
implementation("io.github.microutils:kotlin-logging:3.0.5")
implementation("org.springframework.boot:spring-boot-starter-web:3.1.2")
implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.1.2")
implementation("mysql:mysql-connector-java:8.0.33")
implementation("org.postgresql:postgresql:42.6.0")
implementation("com.h2database:h2:2.2.220")
implementation("redis.clients:jedis:4.4.0")
implementation("org.apache.kafka:kafka-clients:3.5.1")
implementation("org.elasticsearch.client:elasticsearch-rest-high-level-client:7.17.10")
testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
testImplementation("org.junit.jupiter:junit-jupiter-engine:5.8.2")
testImplementation("org.mockito:mockito-core:4.8.1")
implementation("org.apache.httpcomponents:httpclient:4.5.13")
implementation("org.slf4j:slf4j-api:2.0.0-alpha1")
}

application {
    mainClass.set("com.example.package1.MainKt")
}

tasks.test {
    useJUnitPlatform()
}
