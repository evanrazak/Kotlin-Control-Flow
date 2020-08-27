fun main() {
    val listOfInt = listOf(8, 9, null, 13, 15, null, 27)

    for (i in listOfInt) {
        if (i == null) break
        print(i)
    }
}