fun main() {
    val colors: Array<Color> = Color.values()
    colors.forEach{color ->
        println(color)
    }
}

enum class Color(val value:Int){
    BLUE(0x0000FF),
    GREEN(0x00FF00),
    PINK(0x0000FF),

}