object Isogram {

    fun isIsogram(input: String): Boolean {
        val foundCharacters = mutableSetOf<Char>()
        
        for(i in 0 until input.length){
            val currentChar = input[i].lowercaseChar()
            if (currentChar == '-' || currentChar == ' '){
                continue
            }
            if (foundCharacters.add(currentChar) == false){
                return false
            }
            
        }
    
        return true
    }
}
