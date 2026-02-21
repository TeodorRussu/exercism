object EliudsEggs {
    fun eggCount(number: Int): Int{
        // val binary = StringBuilder()
        var remainingDecimal = number
        var eggs = 0
        
        while(remainingDecimal > 0 ){
            var remaining = remainingDecimal.rem(2)
            // binary.append(remaining)
            if (remaining == 1){
                eggs++
            }
            remainingDecimal = remainingDecimal/2
            
            if(remainingDecimal == 0){
                // binary.append(0)
                remainingDecimal = -1
            }
        }
        // println("binary of $number = ${binary.reverse()}")
        return eggs
    }
}