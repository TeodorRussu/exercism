class Anagram(val source: String) {

    fun match(anagrams: Collection<String>): Set<String> {
        val originalToLowercase = anagrams.associate { it.lowercase() to it }

        fun String.hashCodeAnagram(): Int {
            return this.chars().sum()
        }

        val sourceLowercased = source.lowercase()
        val sourceHashCodeAnagram = sourceLowercased.hashCodeAnagram()
        val sourceLowercasedToSet = sourceLowercased.toSet()


        return originalToLowercase.keys
            .filter {
                it != sourceLowercased &&
                        it.hashCodeAnagram() == sourceHashCodeAnagram &&
                        it.toSet() == sourceLowercasedToSet
            }
            .map { originalToLowercase[it] }
            .filterNotNull().toSet()
    }
}
