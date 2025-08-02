plugins {
  id("adventure.json-impl-conventions")
  alias(libs.plugins.jmh)
}

if (System.getProperty("JITPACK") == "true") group = "${parent!!.group}.adventure" // Mohist+ - Ensure JitPack uses correct group in POMs

dependencies {
  api(libs.gson)
}

applyJarMetadata("net.kyori.adventure.text.serializer.gson")
