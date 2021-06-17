object Raindrops {

    fun convert(n: Int): String? {
        val pairs = mapOf(3 to "Pling", 5 to "Plang", 7 to "Plong")
        var result = ""
        for (key in pairs.keys) {
            if (n % key == 0) result += pairs[key]
        }
        return if (result.isEmpty()) "$n"
        else result
    }
}
