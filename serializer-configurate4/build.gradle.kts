plugins {
  id("adventure.common-conventions")
}

if (System.getProperty("JITPACK") == "true") group = "${parent!!.group}.adventure" // Mohist+ - Ensure JitPack uses correct group in POMs

dependencies {
  api(projects.adventureApi)
  api(libs.configurate.v4)
  testImplementation(projects.adventureTextSerializerGson)
}

applyJarMetadata("net.kyori.adventure.serializer.configurate4")
