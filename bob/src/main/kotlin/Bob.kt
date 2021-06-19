object Bob {
    fun hey(input: String): String {

        val answers = arrayListOf("Sure.", "Whoa, chill out!",
            "Calm down, I know what I'm doing!", "Fine. Be that way!",
            "Whatever.")

        return when (Request.filterInputSentence(input)) {
            Request.QUESTION -> answers[0]
            Request.YELL -> answers[1]
            Request.ADDRESS -> answers[3]
            Request.ELSE -> answers[4]
            Request.QUESTION_YELL -> answers[2]
        }

    }


}
enum class Request {
    QUESTION, YELL, ADDRESS, ELSE, QUESTION_YELL;

    companion object {
        fun filterInputSentence(input: String) =
            when {
                input.isBlank() -> ADDRESS
                input.filter { it.isUpperCase()}.endsWith('?') -> QUESTION_YELL
                input.filter { it.isLetter() }.let { it.isNotEmpty() && it.none { it.isLowerCase() } && !it.contains('?') } -> YELL
                input.trimEnd().endsWith('?') -> QUESTION
                else -> ELSE
            }
    }
}

