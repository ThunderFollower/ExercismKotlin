fun transcribeToRna(dna: String): String {
    val arrayOfChars = dna.toCharArray()
    var string = ""
    arrayOfChars.forEach {
        when(it) {
            'G' -> string += "C"
            'C' -> string += "G"
            'T' -> string += "A"
            'A' -> string += "U"
        }
    }
    return string
}
