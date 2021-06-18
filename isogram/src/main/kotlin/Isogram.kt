object Isogram {

    fun isIsogram(input: String): Boolean {
        val cleanInput = input.filter { it.isLetter() }
        return (cleanInput.length == cleanInput
                                                .toLowerCase()
                                                .toCharArray()
                                                .distinct()
                                                .size)

    }
}
