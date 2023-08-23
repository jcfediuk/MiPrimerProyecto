package com.example.miprimerproyecto

import androidx.lifecycle.ViewModel


class ComparisonViewModel : ViewModel() {
    fun compareValues(value1: Double, value2: Double): String {
        return when {
            value1 > value2 -> "El valor 1 es mayor"
            value1 < value2 -> "El valor 2 es mayor"
            else -> "Los valores son iguales"
        }
    }
}