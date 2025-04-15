package domain

class Car (
    val name: String,
    private var status: Int = 0,
    private val fuel: Fuel
){

    fun go() {
        if(fuel.isEnough()) {
            this.status++;
        }
    }

    fun getCarName(): String {
        return this.name;
    }

    fun getCarStatus(): Int {
        return this.status;
    }

}