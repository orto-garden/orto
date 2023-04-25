object Orto {
    const val versionCode = 1
    const val versionName = "1.0.0"
}

object Versions {
    // Gradle plugins
    const val android = "7.4.2"
    const val kotlin = "1.8.20"
    const val ksp = "1.8.20-1.0.10"

    // Kotlin
    const val jdk = "11"
    const val kotlinCompilerExtensionVersion = "1.4.6"

    // KotlinX
    const val coroutines = "1.6.4"
    const val datetime = "0.4.0"

    // Kotlin Multiplatform
    const val koin = "3.3.3"
    const val sqldelight = "1.5.5"
    const val ktor = "2.2.1"
    const val settings = "1.0.0"

    // Kotlin Multiplatform Test
    const val mockative = "1.4.1"

    // OFM
    const val ofm = "0.1.2"

    // OFM
    const val ofm = "0.1.1-SNAPSHOT"

    // Jetpack Compose
    const val composeFoundation = "1.3.1"
    const val composeUi = "1.3.3"
    const val composeMaterial = "1.3.1"
    const val composeMaterial3 = "1.0.1"
    const val coil = "1.4.0"
    const val activityCompose = "1.6.1"
    const val viewmodelCompose = "2.6.0"
    const val navigation = "2.5.3"

    // Android
    const val minSdk = 24
    const val compileSdk = 33
    const val targetSdk = 33
}

object Deps {

    object Gradle {
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
        const val kotlinSerialization =
            "org.jetbrains.kotlin:kotlin-serialization:${Versions.kotlin}"
        const val navigation =
            "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"
        const val android = "com.android.tools.build:gradle:${Versions.android}"
        const val sqldelight = "com.squareup.sqldelight:gradle-plugin:${Versions.sqldelight}"
    }

    object Compose {
        // Material Design 3
        const val material3 = "androidx.compose.material3:material3:${Versions.composeMaterial3}"
        const val material3Window =
            "androidx.compose.material3:material3-window-size-class:${Versions.composeMaterial3}"

        // Material Design 2
        const val material = "androidx.compose.material:material:${Versions.composeMaterial}"

        // or skip Material Design and build directly on top of foundational components
        const val foundation =
            "androidx.compose.foundation:foundation:${Versions.composeFoundation}"

        // or only import the main APIs for the underlying toolkit systems,
        // such as input and measurement/layout
        const val ui = "androidx.compose.ui:ui:${Versions.composeUi}"

        // Android Studio Preview support
        const val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview:${Versions.composeUi}"

        // Optional - Integration with activities
        const val activity = "androidx.activity:activity-compose:${Versions.activityCompose}"

        // Optional - Integration with ViewModels
        const val viewmodel =
            "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.viewmodelCompose}"
        const val coil = "io.coil-kt:coil-compose:${Versions.coil}"
    }

    object Koin {
        const val core = "io.insert-koin:koin-core:${Versions.koin}"
        const val test = "io.insert-koin:koin-test:${Versions.koin}"
        const val android = "io.insert-koin:koin-android:${Versions.koin}"
    }

    object KotlinX {
        const val datetime = "org.jetbrains.kotlinx:kotlinx-datetime:${Versions.datetime}"
        object Coroutines {
            const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}-native-mt"
            const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
            const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
        }
    }

    object Ktor {
        const val core = "io.ktor:ktor-client-core:${Versions.ktor}"
        const val content = "io.ktor:ktor-client-content-negotiation:${Versions.ktor}"
        const val serializationJson = "io.ktor:ktor-serialization-kotlinx-json:${Versions.ktor}"
        const val logging = "io.ktor:ktor-client-logging:${Versions.ktor}"
        const val android = "io.ktor:ktor-client-android:${Versions.ktor}"
        const val darwin = "io.ktor:ktor-client-darwin:${Versions.ktor}"
    }

    object Mockative {
        const val core = "io.mockative:mockative:${Versions.mockative}"
        const val processor = "io.mockative:mockative-processor:${Versions.mockative}"
    }

    object Navigation {
        // Kotlin
        const val fragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
        const val ui = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"

        // Feature module Support
        const val features =
            "androidx.navigation:navigation-dynamic-features-fragment:${Versions.navigation}"

        // Testing Navigation
        const val testing = "androidx.navigation:navigation-testing:${Versions.navigation}"

        // Jetpack Compose Integration
        const val compose = "androidx.navigation:navigation-compose:${Versions.navigation}"
    }

    object OFM {
        const val ofm = "garden.orto:ofm:${Versions.ofm}"
    }

    object Settings {
        const val coroutines = "com.russhwolf:multiplatform-settings-coroutines:${Versions.settings}"
        const val settings = "com.russhwolf:multiplatform-settings:${Versions.settings}"
        const val test = "com.russhwolf:multiplatform-settings-test:${Versions.settings}"
    }

    object SqlDelight {
        const val runtime = "com.squareup.sqldelight:runtime:${Versions.sqldelight}"
        const val coroutines =
            "com.squareup.sqldelight:coroutines-extensions:${Versions.sqldelight}"
        const val sqlite = "com.squareup.sqldelight:sqlite-driver:${Versions.sqldelight}"
        const val android = "com.squareup.sqldelight:android-driver:${Versions.sqldelight}"
        const val native = "com.squareup.sqldelight:native-driver:${Versions.sqldelight}"
    }

}
