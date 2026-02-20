import kotlin.math.sqrt

object Darts {

    fun score(x: Number, y: Number): Int {

        val xDouble = x.toDouble()
        val yDouble = y.toDouble()
        val distanceFromCenterSquared = xDouble * xDouble + yDouble * yDouble

        return when{
            distanceFromCenterSquared <= 1.0 -> 10
            distanceFromCenterSquared > 1.0 && distanceFromCenterSquared <= 25.0  -> 5
            distanceFromCenterSquared > 25.0 && distanceFromCenterSquared <= 100.0  -> 1
            else -> 0
        }
    }
}
