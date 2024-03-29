/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("com.braveinnov.kotlin-application-conventions")
    kotlin("jvm")
    kotlin("plugin.spring") version "1.6.10"
    id("org.springframework.boot").version("3.2.0")
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    application
}

apply(plugin = "io.spring.dependency-management")

dependencyManagement {
    imports {
        mavenBom("org.springframework.boot:spring-boot-dependencies:3.2.2")
        mavenBom("org.apache.camel.springboot:camel-spring-boot-bom:4.4.0")
    }
}

dependencies {
    implementation("org.apache.commons:commons-text")
    implementation(project(":utilities"))
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.apache.camel.springboot:camel-spring-boot-starter")
    implementation("org.apache.camel.springboot:camel-servlet-starter")
    implementation("org.apache.camel.springboot:camel-jackson-starter")
}
repositories {
    mavenCentral()
}

application {
    mainClass.set("com.braveinnov.app.AppKt")
}
