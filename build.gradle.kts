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
    implementation("com.thedeanda:lorem:2.2")
}

application {
    mainClass.set("nl.jurwind.MainKt")
}

kotlin {
    jvmToolchain(21)
}