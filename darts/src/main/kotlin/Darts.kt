import kotlin.math.sqrt

object Darts {

    fun score(x: Int , y: Int): Int {
        val distance = sqrt((x * x + y * y).toDouble())
        when {
            distance <= 1  -> return 10
            distance <= 5  -> return 5
            distance <= 10 -> return 1
        }
        return 0
    }

    fun score(x: Double , y: Int): Int {
        val distance = sqrt((x * x + y * y))
        when {
            distance <= 1  -> return 10
            distance <= 5  -> return 5
            distance <= 10 -> return 1
        }
        return 0
    }

    fun score(x: Double , y: Double): Int {
        val distance = sqrt((x * x + y * y).toDouble())
        when {
            distance <= 1  -> return 10
            distance <= 5  -> return 5
            distance <= 10 -> return 1
        }
        return 0
    }
}





