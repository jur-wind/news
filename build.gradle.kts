plugins {
    kotlin("jvm") version "2.0.0"
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

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}