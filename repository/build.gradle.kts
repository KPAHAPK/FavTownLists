plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
}


dependencies {
    // Room
    kapt(Room.sqlite_jdbc)
    implementation(Room.runtime)
    kapt(Room.compiler)
    implementation(Room.room_ktx)

    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.appcompat:appcompat:1.4.2")
    implementation("com.google.android.material:material:1.6.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")


    implementation(project(Modules.model))

}