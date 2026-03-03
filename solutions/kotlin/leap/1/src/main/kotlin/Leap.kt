data class Year(val year: Int) {

    val isLeap: Boolean = when {
        year.rem(400) == 0 -> true
        year.rem(4) == 0 && year.rem(100) != 0 -> true
        else -> false
    }
}
