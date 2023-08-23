package com.example.miprimerproyecto

import org.junit.Test
import org.junit.Assert.assertEquals
import org.junit.Before

class ComparisonViewModelUnitTest {
    private lateinit var viewModel: ComparisonViewModel

    @Before
    fun setUp() {
        viewModel = ComparisonViewModel()
    }

    @Test
    fun testComparisonValues() {
        val result1 = viewModel.compareValues(5.0, 3.0)
        assertEquals("El valor 1 es mayor", result1)

        val result2 = viewModel.compareValues(3.0, 5.0)
        assertEquals("El valor 2 es mayor", result2)

        val result3 = viewModel.compareValues(4.0, 4.0)
        assertEquals("Los valores son iguales", result3)
    }
}