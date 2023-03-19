package com.example.testapp

import org.junit.Test
import org.junit.Assert.assertEquals

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
        assertEquals(4,2 + 2)
    }
}