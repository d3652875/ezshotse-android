plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    // kotlin-kapt가 필요한 경우가 많지만,
    // DataBinding만 쓰면 보통 kapt 없이도 빌드됩니다.
    // 만약 Room/Glide/다른 annotation processor 쓰면 아래 주석을 풀어주세요.
    // id("org.jetbrains.kotlin.kapt")
}

android {
    namespace = "com.gooddrs.ezshotse"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.gooddrs.ezshotse"
        minSdk = 21
        targetSdk = 34

        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
            isMinifyEnabled = false
        }
    }

    // ✅ GitHub Actions / 로컬 둘 다 안정적으로 맞추기: JDK 17
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }

    // ✅ 기존 코드 유지용(중요)
    buildFeatures {
        viewBinding = true
        dataBinding = true
        compose = false
    }

    // 리소스 충돌/중복 관련 문제 줄이기(가끔 도움이 됨)
    packaging {
        resources {
            excludes += setOf(
                "META-INF/DEPENDENCIES",
                "META-INF/LICENSE",
                "META-INF/LICENSE.txt",
                "META-INF/NOTICE",
                "META-INF/NOTICE.txt",
                "META-INF/*.kotlin_module"
            )
        }
    }
}

dependencies {
    // AndroidX 기본
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")

    // Activity/Fragment (requireContext(), startActivity(), Fragment() 등 해결)
    implementation("androidx.activity:activity-ktx:1.9.2")
    implementation("androidx.fragment:fragment-ktx:1.8.4")

    // Lifecycle
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.6")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.6")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.8.6")

    // UI에서 흔히 필요 (없어도 되지만 대부분 쓰임)
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.recyclerview:recyclerview:1.3.2")

    // 테스트(필요 없으면 삭제 가능)
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
}
