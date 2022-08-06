val ktorversion: String by project
val kotlinversion: String by project
val logbackVersion: String by project
val koinversion: String by project

plugins {
    application
    kotlin("jvm") version "1.7.10"
                id("org.jetbrains.kotlin.plugin.serialization") version "1.7.10"
}

group = "com.blez"
version = "0.0.1"
application {
    mainClass.set("io.ktor.server.netty.EngineMain")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}
tasks.create("stage"){
    dependsOn("installDist")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-content-negotiation-jvm:$ktorversion")
    implementation("io.ktor:ktor-server-core-jvm:$ktorversion")
    implementation("io.ktor:ktor-serialization-kotlinx-json-jvm:$ktorversion")
    implementation("io.ktor:ktor-server-call-logging-jvm:$ktorversion")
    implementation("io.ktor:ktor-server-netty-jvm:$ktorversion")
    implementation("ch.qos.logback:logback-classic:$logbackVersion")
    testImplementation("io.ktor:ktor-server-tests-jvm:$ktorversion")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlinversion")
    // Koin for Ktor
    implementation("io.insert-koin:koin-ktor:$koinversion")
    // SLF4J Logger
    implementation("io.insert-koin:koin-logger-slf4j:$koinversion")
    implementation("io.ktor:ktor-server-status-pages:$ktorversion")
    implementation("io.ktor:ktor-server-default-headers:$ktorversion")
}