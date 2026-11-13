plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.dessertlab.app"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.dessertlab.app"
        minSdk = 26
        targetSdk = 35
        versionCode = 3
        versionName = "1.2.1"
    }
}
