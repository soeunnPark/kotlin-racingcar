package view

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class InputViewTest {
    
    private lateinit var inputView: InputView
    
    @BeforeEach
    fun setUp() {
        inputView = InputView()
    }
    
    @Test
    fun inputTest_namesAreCorrect() {
        val carNameInput: List<CarNameDto> = inputView.carNameInput("pobi, woni, jun");
        assertEquals(carNameInput.size, 3)
        assertEquals(carNameInput[0].name, "pobi")
        assertEquals(carNameInput[1].name, "woni")
        assertEquals(carNameInput[2].name, "jun")
    }

    @Test
    fun inputTest_invalidNameLength_throwsException() {
        assertThrows(IllegalArgumentException::class.java) {
            val carNameInput = inputView.carNameInput("pobbbbi, yoooonniii, Juuuunnnn")
        }
    }
}