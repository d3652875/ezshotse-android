plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.gooddrs.ezshotse"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.gooddrs.ezshotse"
        minSdk = 24
        targetSdk = 34

        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        debug {
            // 필요하면 여기에 디버그 옵션 추가
        }
    }

    buildFeatures {
        viewBinding = true
        // dataBinding = true  // <-- dataBinding 쓰는 프로젝트가 아니면 켜지 마세요.
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    // (선택) Fragment/Activity KTX
    implementation("androidx.fragment:fragment-ktx:1.8.2")
    implementation("androidx.activity:activity-ktx:1.9.2")
}
