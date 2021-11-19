package com.flutter.clean_architecture_plugin.generator.components

import com.flutter.clean_architecture_plugin.generator.BlocGenerator

class BlocStateGenerator(
    name: String,
    useEquatable: Boolean
) : BlocGenerator(name, useEquatable, templateName = "bloc_state") {
    override fun fileName() = "${snakeCase()}_state.${fileExtension()}"
}