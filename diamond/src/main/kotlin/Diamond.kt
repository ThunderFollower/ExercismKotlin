class DiamondPrinter {

    fun printToList(letter: Char): List<String> {
        val quarter = ('A'..letter).map {
            "${" ".repeat(letter - it)}$it${" ".repeat(it - 'A')}"
        }
        val half = quarter.map { "$it${it.dropLast(1).reversed()}" }
        return half + half.dropLast(1).reversed()
    }

}
