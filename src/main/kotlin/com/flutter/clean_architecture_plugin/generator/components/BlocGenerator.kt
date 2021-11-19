package com.flutter.clean_architecture_plugin.generator.components
import com.flutter.clean_architecture_plugin.generator.BlocGenerator


open class BlocGenerator(
    name: String,
    useEquatable: Boolean
) : BlocGenerator(name, useEquatable, templateName = "bloc") {
    override fun fileName() = "${snakeCase()}_bloc.${fileExtension()}"
}