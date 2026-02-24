object ETL {
    fun transform(source: Map<Int, Collection<Char>>): Map<Char, Int> {
        val output = mutableMapOf<Char, Int>()
        
        for((k, v) in source){
            for( character in v){
                output[character.lowercaseChar()] = k
            }
        }
        return output
    }
}
