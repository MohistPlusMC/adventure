plugins {
  id("adventure.common-conventions")
}

if (System.getProperty("JITPACK") == "true") group = "${parent!!.group}.adventure" // Mohist+ - Ensure JitPack uses correct group in POMs

dependencies {
  api(libs.examination.api)
  api(libs.examination.string)
  compileOnlyApi(libs.jetbrainsAnnotations)
}

applyJarMetadata("net.kyori.adventure.nbt")
