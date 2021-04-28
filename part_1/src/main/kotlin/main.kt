fun main(args: Array<String>) {
    val name = " Kotlin"
    println("Hello ${name}")  // String interpolations

    // Variables

    printVars()
    println(max(10,20))  //
    println(one())
    looping()
}

fun printVars() : Unit{
    var age  = 20  // Mutable

    val pi = 3.14 // Immutable

    println(pi)
    var number = 1
    var b = yn(number)
    println(b)
}

fun yn(a:Int) : String =
    when(a) {
        1 -> "Yes baby"
        2 -> "No baby"
        else -> "None"   // Else is mandatory here because of the function signature
    }

fun looping() {
    var myList = listOf<String>("azizasiri", "aasiri", "aaasiri")

    for (i in myList) {
        println(i)
    }

    // Iterating over a map

    var map = mapOf(1 to "Aziz", 2 to "A", 3 to 1)

    for ((key, value) in map)  {
        println("key ${key} and value ${value}")

    }
    for (i in  1..9) {
        println(i)
    }

    for (i in 1 until 10) {
        println(i)
    }

    for (ch in "abc") {
        print(ch + 1)
    }
}



// Example of a function in kotlin.
fun max(a:Int , b:Int) : Int {
    return if (a > b) a else b ;
}


fun one() = 1 // This is a simple expression for returning a one liner code in kotlin.


// Iterating using a range including and excluding the last number


