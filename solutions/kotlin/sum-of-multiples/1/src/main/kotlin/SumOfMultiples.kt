object SumOfMultiples {

    fun sum(factors: Set<Int>, limit: Int): Int {
        val multiples = mutableSetOf<Int>()
        
        factors.filter{it != 0}.forEach{
            for (i in it until limit){
                if(i.rem(it) == 0){
                    multiples.add(i)
                }
            }
        }
        
        
        return multiples.sum()
    }
}
