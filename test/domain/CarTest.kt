package domain

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class CarTest {

    private lateinit var car: Car
    private lateinit var fuel: Fuel

    @BeforeEach
    fun setUp() {
        fuel = ChargeFull()
        car = Car("car1", fuel = fuel)
    }

    @Test
    fun makeTest() {
        assertEquals("car1", car.name);
    }

    @Test
    fun goTest() {
        car.go();
        assertEquals(1, car.getCarStatus());
    }
}