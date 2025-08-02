plugins {
  id("adventure.common-conventions")
}

if (System.getProperty("JITPACK") == "true") group = "${parent!!.group}.adventure" // Mohist+ - Ensure JitPack uses correct group in POMs

configurations {
  testCompileOnly {
    extendsFrom(compileOnlyApi.get())
  }
}

dependencies {
  api(libs.examination.api)
  api(libs.examination.string)
  compileOnlyApi(libs.jetbrainsAnnotations)
  testImplementation(libs.guava)
}

applyJarMetadata("net.kyori.adventure.key")
