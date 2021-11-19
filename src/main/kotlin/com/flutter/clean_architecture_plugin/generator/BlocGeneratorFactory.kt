package com.flutter.clean_architecture_plugin.generator

import com.flutter.clean_architecture_plugin.generator.components.BlocEventGenerator
import com.flutter.clean_architecture_plugin.generator.components.BlocStateGenerator
import com.flutter.clean_architecture_plugin.generator.components.BlocGenerator


object BlocGeneratorFactory {
    fun getBlocGenerators(
        name: String,
        useEquatable: Boolean
    ): List<com.flutter.clean_architecture_plugin.generator.BlocGenerator> {
        val bloc = BlocGenerator(name, useEquatable)
        val event = BlocEventGenerator(name, useEquatable)
        val state = BlocStateGenerator(name, useEquatable)
        return listOf(bloc, event, state)
    }
}