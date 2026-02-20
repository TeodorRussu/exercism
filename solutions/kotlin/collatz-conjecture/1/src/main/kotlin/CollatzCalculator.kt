object CollatzCalculator {
    fun computeStepCount(start: Int): Int {

        if ( start <= 0){
            throw IllegalArgumentException()
        }
        var steps = 0;
        var tempNumber = start
        
        while(tempNumber!= 1){
            steps++
            tempNumber = when{
                tempNumber.rem(2) == 0 -> tempNumber / 2
                else -> tempNumber.times(3).plus(1)
            }
        }

        return steps 
    }
}
