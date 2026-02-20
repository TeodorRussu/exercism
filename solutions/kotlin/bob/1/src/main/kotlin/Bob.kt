object Bob {
    fun hey(input: String): String {        
    	val questionRegex = Regex("^.*\\?+\\s*$")
        val yellingRegex = Regex("^(?=.*[A-Z])[^a-z]*$")
        val yellingQuestionRegex = Regex("^(?=.*[A-Z])[^a-z]*\\?+\\s*$")
        val silenceRegex = Regex("^\\s*$")

        return when {
            yellingQuestionRegex.matches(input) -> "Calm down, I know what I'm doing!"
  			questionRegex.matches(input) -> "Sure." 
            yellingRegex.matches(input) -> "Whoa, chill out!"
            silenceRegex.matches(input) -> "Fine. Be that way!"
            else -> "Whatever."
        }
    }
}