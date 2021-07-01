object BeerSong {

    private const val phrase0 = "No more bottles of beer on the wall, no more bottles of beer.\n" +
            "Go to the store and buy some more, 99 bottles of beer on the wall."

    private const val phrase1 = "1 bottle of beer on the wall, 1 bottle of beer.\n" +
            "Take it down and pass it around, no more bottles of beer on the wall."

    private const val phrase2 = "2 bottles of beer on the wall, 2 bottles of beer.\n" +
            "Take one down and pass it around, 1 bottle of beer on the wall."

    private const val phraseStandard = "%d bottles of beer on the wall, %d bottles of beer.\n" +
            "Take one down and pass it around, %d bottles of beer on the wall."

    fun verses(startBottles: Int, takeDown: Int): String = (startBottles downTo takeDown)
        .joinToString("\n") {
            when (it) {
                0 -> phrase0
                1 -> phrase1
                2 -> phrase2
                else -> phraseStandard.format(it, it, it - 1)
            } + "\n"
        }
}
