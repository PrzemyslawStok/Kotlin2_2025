class Celestial(val name: String, val accelerations: Double, val radius: Double) {
    fun distance(t: Double): Double {
        return this.accelerations * t * t / 2
    }

    fun surface(): Double {
        return 4 * Math.PI * radius * radius
    }
}