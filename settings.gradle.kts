pluginManagement {
    includeBuild("convention-plugins")
    repositories {
        google()
        mavenCentral()
        mavenLocal()
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        mavenLocal()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.4.0"
}

rootProject.name = "compose-richeditor"

include(
    ":richeditor-compose",

    ":sample:android",
    ":sample:desktop",
    ":sample:web",
    ":sample:common",
)
