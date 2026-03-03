class Dna(val dnaChain: String) {
    val nucleotideCounts = mutableMapOf(
        'A' to 0, 'C' to 0, 'G' to 0, 'T' to 0
    )

    init {
        for (i in dnaChain.indices) {
            when (dnaChain[i]) {
                'A', 'C', 'G', 'T' -> nucleotideCounts[dnaChain[i]] = (nucleotideCounts[dnaChain[i]] ?: 0) + 1
                else -> throw IllegalArgumentException()
            }
        }
    }
}