package com.flutter.clean_architecture_plugin.generator.components
import com.flutter.clean_architecture_plugin.generator.CubitGenerator


class CubitGenerator(
    name: String,
    useEquatable: Boolean
) : CubitGenerator(name, useEquatable, templateName = "cubit") {
    override fun fileName() = "${snakeCase()}_cubit.${fileExtension()}"
}