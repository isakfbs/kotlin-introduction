fun main() {
    println("Hello, world!")

//    val popcorn = 5
//    val hotdog = 7
//    val customers = 10

//    println("There are $customers customers")

//    println("There are ${customers + 1} customers")

//    val readOnlyShapes = listOf("triangle", "square", "circle")
//    println(readOnlyShapes)
//
//    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
//    println(shapes)
//
//    println("This list has ${shapes.count()} items")
//
//    println("circle" in readOnlyShapes)
//
//    shapes.add("pentagon")
//    println(shapes)
//    shapes.remove("pentagon")
//    println(shapes)


   // SET

//   val readOnlyFruit = setOf("apple","banana","cherry","cherry")
//
//    val fruit: MutableSet<String> = mutableSetOf("apple","banana","cherry","cherry")
//
//    println("This set has ${readOnlyFruit.count()} items")

    // MAP

//    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
//    println(readOnlyJuiceMenu)
//
//    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
//    println(juiceMenu)
//
//    juiceMenu["coconut"] = 150
//    juiceMenu.remove("orange")
//    println(juiceMenu)
//
////    println(readOnlyJuiceMenu.containsKey("kiwi"))
//
//    println(200 in readOnlyJuiceMenu.values)

    fun main(){

        //If

        val d : Int
        val check = true

        if(check){
            d = 1
        } else {
            d = 2
        }

        println(d)
        }

    //When

    val obj = "Hello"

    when(obj) {
        "1" -> println("One")
        "Hello" -> println("Greeting")
        else -> println("Unknown")
    }

    //For

    for (number in 1..5){
        println(number)
    }

    val cakes = listOf("carrot","cheese","chocolate")

    for(cake in cakes){
        println("Yummy, it's a $cake cake!")
    }




}