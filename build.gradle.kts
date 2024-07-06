plugins {
    kotlin("jvm") version "1.5.31"
id("com.apollographql.apollo3").version("3.8.3")
}

repositories {
    mavenCentral()
}

dependencies {
  implementation("com.apollographql.apollo3:apollo-runtime:3.8.4")
}


tasks.withType<JavaCompile> {
    options.compilerArgs.removeAll { it == "--illegal-access=permit" }
}