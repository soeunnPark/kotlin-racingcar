package view

data class CarNameDto(val name: String) {
    init {
        require(name.length <=5) {"Car Name must be between 5 characters"}
    }
}
