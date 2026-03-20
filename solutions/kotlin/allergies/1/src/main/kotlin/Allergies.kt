
fun main() {  
    println(Allergies(509).getList())
}


class Allergies(val score: Int) {
    val normalizedScore = score % 256
	val allergens = mutableListOf<Allergen>()
    
    init{
        buildList()
    }
    
    fun getList(): List<Allergen> { 
    	return allergens
    }

    fun buildList() {

               var remainingScore = normalizedScore

               for(currentScore in Allergies.scores){
                   if(remainingScore == 0){
                       break
                   }
                   println("new iteration")
                   println("current iterated currentScore : $currentScore")
                   println("current remainingScore : $remainingScore")
                   if((remainingScore - currentScore) >= 0){
                       val allergen = Allergies.fromScore(currentScore)
                       println("found allergen : $allergen")
                       if(allergen != null){
                           allergens.add(allergen)
                       }
                       remainingScore = remainingScore - currentScore
                       println("current remainingScore updated to : $remainingScore")
                   }
               }
              allergens.reverse()
    }

    fun isAllergicTo(allergen: Allergen): Boolean {
        return allergens.contains(allergen)
    }
    companion object {
        private val map: Map<Int, Allergen>
        fun fromScore(score: Int): Allergen? = map[score]
        val scores: List<Int>
        
        init {
            map = Allergen.entries.associateBy { it.score }
            scores = Allergen.entries.map{it.score}.toList().sortedByDescending{it}
        }
        
    }
}