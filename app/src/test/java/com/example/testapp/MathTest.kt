package com.example.testapp

import org.junit.Test
import org.junit.Assert.assertEquals
import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.math.roundToInt

val num = 12.5493

class MathTest {
    @Test
    fun addTest() {
        assertEquals(2,1 + 1)
    }

    @Test
    fun multiplyTest() {
        assertEquals(6,3 + 3)
    }

    @Test
    fun subtractTest() {
        assertEquals(4,2 + 2);

        println("roundToInt: " + ((num * 100.0).roundToInt() / 100.0).toString())
    }

    @Override
    fun roundToInt() {
        println("roundToInt: " + ((num * 100.0).roundToInt() / 100.0).toString())
    }

    @Override
    fun formatNumber() {
        println("String.format: " + String.format("%.2f", num))
    }

    @Override
    fun decimalFormat() {
        val df = DecimalFormat("#.##")
        df.roundingMode = RoundingMode.HALF_UP

        println("DecimalFormat: " + df.format(num))
    }

    @Test
    fun testFormatNumbers() {
        println(" Test Number Format")
        roundToInt();
        formatNumber();
        decimalFormat();
    }
}