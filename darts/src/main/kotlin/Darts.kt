import kotlin.math.hypot
import kotlin.math.sqrt

object Darts {
    //Best solution
    fun score(x: Number, y: Number): Int {
        val offset = hypot(x.toDouble(),y.toDouble())
        return when {
            offset <= 1  -> 10
            offset <= 5  -> 5
            offset <= 10 -> 1
            else -> 0
        }
    }


    //Polymorphism

//    fun score(x: Int , y: Int): Int {
//        val distance = sqrt((x * x + y * y).toDouble())
//        when {
//            distance <= 1  -> return 10
//            distance <= 5  -> return 5
//            distance <= 10 -> return 1
//        }
//        return 0
//    }
//
//    fun score(x: Double , y: Int): Int {
//        val distance = sqrt((x * x + y * y))
//        when {
//            distance <= 1  -> return 10
//            distance <= 5  -> return 5
//            distance <= 10 -> return 1
//        }
//        return 0
//    }
//
//    fun score(x: Double , y: Double): Int {
//        val distance = sqrt((x * x + y * y).toDouble())
//        when {
//            distance <= 1  -> return 10
//            distance <= 5  -> return 5
//            distance <= 10 -> return 1
//        }
//        return 0
//    }
}





