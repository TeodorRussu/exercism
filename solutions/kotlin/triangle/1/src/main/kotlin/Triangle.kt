fun main() {
    val triangle = Triangle<Int>(1,3,1)
    
    println("is equilateral: ${triangle.isEquilateral}")
    println("is isosceles: ${triangle.isIsosceles}")
    println("is scalene: ${triangle.isScalene}")
}

class Triangle<out T : Number>(val a: T, val b: T, val c: T) {
	
    val distinctSides: Set<Double>
    init{
        val aVal = a.toDouble()
		val bVal = b.toDouble()
        val cVal = c.toDouble()
        
        require(aVal > 0 && bVal > 0 && cVal > 0){"all the sides should have the length greater than zero"}
        
        distinctSides = setOf(aVal, bVal, cVal)
        val sides = mutableListOf(aVal, bVal, cVal)
        sides.sort()
        println(sides)
		
        require((sides[0] + sides[1]) > sides[2]) {"the sides cannot make a triangle"} 
    }

    val isEquilateral: Boolean = distinctSides.size == 1
    val isIsosceles: Boolean = distinctSides.size == 2 || isEquilateral == true
    val isScalene: Boolean = distinctSides.size == 3
}