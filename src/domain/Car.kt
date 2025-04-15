package domain

class Car (
    val name: String,
    var status: Int = 0
){


    fun go() {
        if(true) {
            this.status++;
        }
    }

}