fun translate(rna: String?): List<String> {

    if (rna == null) return emptyList()
    
    if (rna.isBlank() || rna.length < 3){
        throw IllegalArgumentException()
    }
    
    val codons = mutableListOf<String>()

    for(i in 0 until rna.length step 3){
        if (rna.length - i < 3) {
            throw IllegalArgumentException()
        }
        val codon = rna.substring(i, i+3)
        when(codon){
            "AUG" -> codons.add("Methionine")
            "UUU", "UUC" -> codons.add("Phenylalanine")
            "UUA", "UUG" ->	codons.add("Leucine")   
			"UCU", "UCC", "UCA", "UCG"	->	codons.add("Serine")  
			"UAU", "UAC"	->	codons.add("Tyrosine")  
            "UGU", "UGC"	->	codons.add("Cysteine")  
            "UGG"	->	codons.add("Tryptophan")  
            "UAA", "UAG", "UGA"	-> return codons
            else -> throw IllegalArgumentException()
        }
    }
    return codons
    
}
