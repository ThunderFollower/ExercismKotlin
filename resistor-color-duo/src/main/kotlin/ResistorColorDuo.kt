object ResistorColorDuo {

    fun value(vararg colors: Color): Int {
        var numberInStringFormat = ""
        var counter = 0
        colors.forEach {
            counter++
            if (counter <= 2) {
                numberInStringFormat += it.ordinal
            }
        }
        return numberInStringFormat.toInt()
    }
}


