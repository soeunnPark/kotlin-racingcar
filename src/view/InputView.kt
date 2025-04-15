package view

class InputView {

    fun input() : String{
        val input = readLine() ?: throw IllegalArgumentException("empty input")
        return input
    }

    fun carNameInput(input: String): List<CarNameDto> {
        val carNameInput: List<CarNameDto> = input.split(",")
            .map {it.trim()}
            .filter {it.isNotEmpty()}
            .map {CarNameDto(it)}
        if(carNameInput.isEmpty()) {
            throw IllegalArgumentException("at least one car name is required")
        }
        return carNameInput
    }
}