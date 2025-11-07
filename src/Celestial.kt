class Celestial(val name: String, val accelerations: Double) {
    fun distance(t: Double): Double {
        return this.accelerations * t * t / 2
    }
}