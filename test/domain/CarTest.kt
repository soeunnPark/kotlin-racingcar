package domain

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class CarTest {

    private lateinit var car: Car

    @BeforeEach
    fun setUp() {
        car = Car("car1")
    }

    @Test
    fun makeTest() {
        assertEquals("car1", car.name);
    }

    @Test
    fun goTest() {
        car.go();
        assertEquals(1, car.status);
    }
}