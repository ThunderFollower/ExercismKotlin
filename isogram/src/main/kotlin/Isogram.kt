object Isogram {

    fun isIsogram(input: String): Boolean {
        return (input.trim().length == input.trim()
                                            .toLowerCase()
                                            .decapitalize()
                                            .toCharArray()
                                            .toSet()
                                            .size)
    }
}
