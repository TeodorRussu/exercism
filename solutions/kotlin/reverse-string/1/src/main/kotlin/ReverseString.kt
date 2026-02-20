fun reverse(input: String): String {
    val reversedInput = StringBuilder()
    for (i in (input.indices).reversed())
        reversedInput.append(input[i])
    return reversedInput.toString()
}
