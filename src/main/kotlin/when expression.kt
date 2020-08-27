fun main(){
    val stringOfValue = when (5){
        3 ->{
            println("three")
            "Value is 3"
        }
        4 ->{
            println("Four")
            "Value is 4"
        }
        5 ->{
            println("Five")
            "Value is 5"
        }
        else ->{
            println("tak ditemukan")
            "Ra iso"
        }
    }
    println(stringOfValue)

}