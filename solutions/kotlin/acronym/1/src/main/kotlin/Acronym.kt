object Acronym {
    fun generate(phrase: String) : String {
        
        val regex = Regex("[\\p{Punct}&&[^-]]")
		val noPunctuationPhrase = regex.replace(phrase, "")
        
        val splitRegex = "[\\s-]".toRegex()
        
        return splitRegex.split(noPunctuationPhrase).filter{it.length > 0}.map{it[0]}.filter{it.isLetter()}.map{it.uppercase()}.joinToString("")
    }
}