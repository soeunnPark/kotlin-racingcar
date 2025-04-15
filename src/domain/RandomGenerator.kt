package domain

class RandomGenerator: Fuel {

    fun makeRandom(): Int {
        return (0..9).random();
    }

    override fun isEnough(): Boolean {
        return makeRandom() > 4;
    }
}
