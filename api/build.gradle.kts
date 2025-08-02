plugins {
  id("adventure.common-conventions")
  alias(libs.plugins.jmh)
}

if (System.getProperty("JITPACK") == "true") group = "${parent!!.group}.adventure" // Mohist+ - Ensure JitPack uses correct group in POMs

configurations {
  testCompileOnly {
    extendsFrom(compileOnlyApi.get())
  }
}

dependencies {
  api(projects.adventureKey)
  api(libs.examination.api)
  api(libs.examination.string)
  compileOnlyApi(libs.jetbrainsAnnotations)
  testImplementation(libs.guava)
  annotationProcessor(projects.adventureAnnotationProcessors)
}

applyJarMetadata("net.kyori.adventure")
