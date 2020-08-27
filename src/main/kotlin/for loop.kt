fun main() {

    val ranges = 7.rangeTo(65) step 8
    ranges.forEachIndexed { index, value ->
        println("suku ke $index adalah $value")

    }
}