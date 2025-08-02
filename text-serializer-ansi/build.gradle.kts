plugins {
  id("adventure.common-conventions")
}

if (System.getProperty("JITPACK") == "true") group = "${parent!!.group}.adventure" // Mohist+ - Ensure JitPack uses correct group in POMs

dependencies {
  api(projects.adventureApi)
  api(libs.ansi)
}

applyJarMetadata("net.kyori.adventure.text.serializer.ansi")
