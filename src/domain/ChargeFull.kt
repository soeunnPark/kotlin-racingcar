package domain

class ChargeFull: Fuel{
    override fun isEnough(): Boolean {
        return true;
    }
}