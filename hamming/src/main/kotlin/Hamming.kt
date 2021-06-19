import java.lang.IllegalArgumentException

object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Int {
        val result: Int
        if (leftStrand.length == rightStrand.length) {
            result = leftStrand.toCharArray().zip(rightStrand.toCharArray()) { a, b -> a == b }
                                                             .filterNot { it }.size
        } else {
            throw IllegalArgumentException("left and right strands must be of equal length.")
        }
        return result
    }
}
