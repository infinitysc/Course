plugins {
    kotlin("jvm")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    implementation(libs.dagger)
    implementation(libs.kotlin.stdlib)
    implementation(libs.kotlinx.coroutines)
    testImplementation(libs.junit)
}
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}