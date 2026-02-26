import java.math.BigInteger

object Board {

    fun getGrainCountForSquare(number: Int): BigInteger {
        require (number in 1..64) {"invalid value"}
        
        var currentSquareGrains = BigInteger.ONE
        for (i in 2..number){
            currentSquareGrains = currentSquareGrains.multiply(BigInteger.TWO)
        }
        return currentSquareGrains
    }

    fun getTotalGrainCount(): BigInteger {
        var totalGrains = BigInteger.ONE
        var currentSquareGrains = BigInteger.ONE
        for (i in 2..64){
            currentSquareGrains = currentSquareGrains.multiply(BigInteger.TWO)
            totalGrains = totalGrains.add(currentSquareGrains)
        }
        return totalGrains
    }
}
