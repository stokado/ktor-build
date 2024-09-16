package subprojects.build.generator

import jetbrains.buildServer.configs.kotlin.*

object ProjectGenerator : Project({
    id("ProjectKtorGenerator")
    name = "Project Generator"
    description = "Code for start.ktor.io"

    /**
     *
     */
    buildType(PublishPluginRegistry)

    /**
     * Tests registry and ensures any new plugins can be built.
     */
    buildType(TestPluginRegistry)

    /**
     * Tests backend for generating different project types when modified.
     */
    buildType(TestGeneratorBackEnd)

    /**
     * Runs on every PR for ktor-generator-website.
     */
    buildType(BuildGeneratorWebsite)

})


