package com.flutter.clean_architecture_plugin.generator

import com.flutter.clean_architecture_plugin.generator.components.CubitStateGenerator
import com.flutter.clean_architecture_plugin.generator.components.CubitGenerator


object CubitGeneratorFactory {
    fun getCubitGenerators(name: String, useEquatable: Boolean): List<com.flutter.clean_architecture_plugin.generator.CubitGenerator> {
        val cubit = CubitGenerator(name, useEquatable)
        val state = CubitStateGenerator(name, useEquatable)
        return listOf(cubit, state)
    }
}