fun main() {
    val rangeInt = 4..40 step 4
    rangeInt.forEach {
        print("$it ")
    }
    println(rangeInt.step)
}