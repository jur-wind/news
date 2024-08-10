plugins {
    kotlin("jvm") version "2.0.0"
    application
}

group = "nl.jurwind"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.thedeanda:lorem:2.2")
}

application {
    mainClass.set("nl.jurwind.MainKt")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}