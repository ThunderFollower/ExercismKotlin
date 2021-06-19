class Anagram(source: String) {

    private val freqMap = source.toLowerCase().groupBy { it }
    private val word = source.toLowerCase()

    fun match(anagrams: Collection<String>): Set<String> {
        return anagrams.filter { isAnagram(it.toLowerCase()) }.toSet()
    }

    private fun isAnagram(test: String) : Boolean {
        return test != word && test.length == word.length && test.groupBy {it }.all { it.value in freqMap.values }
    }
}