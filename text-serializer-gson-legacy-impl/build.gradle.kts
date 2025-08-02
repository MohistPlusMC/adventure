plugins {
  id("adventure.common-conventions")
}

if (System.getProperty("JITPACK") == "true") group = "${parent!!.group}.adventure" // Mohist+ - Ensure JitPack uses correct group in POMs

dependencies {
  api(projects.adventureTextSerializerGson)
  api(projects.adventureTextSerializerJsonLegacyImpl)
}

applyJarMetadata("net.kyori.adventure.text.serializer.gson.legacyimpl")
