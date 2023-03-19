plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.application").version("7.4.0").apply(false)
    id("com.android.library").version("7.4.0").apply(false)
    kotlin("android").version("1.8.0").apply(false)
    kotlin("multiplatform").version("1.8.0").apply(false)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

buildscript {
    val kotlinVersion by extra("1.8.0")
    val navVersion = "2.5.3"
    val sqlDelightVersion = "1.5.5"

    dependencies {
        classpath("com.squareup.sqldelight:gradle-plugin:$sqlDelightVersion")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$navVersion")
    }

    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}
repositories {
    google()
    gradlePluginPortal()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")}
