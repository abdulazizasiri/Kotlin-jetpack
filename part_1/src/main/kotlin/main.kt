fun main(args: Array<String>) {
    val name = " Kotlin"
    println("Hello ${name}")  // String interpolations

    // Variables

    printVars()
    println(max(10,20))  //
    println(one())
}

fun printVars() : Unit{
    var age  = 20  // Mutable

    val pi = 3.14 // Immutable



    println(pi)
    var number = 1
    var b = yn(number)
    println(b)

    // if an dwhen

}

fun yn(a:Int) : String =
    when(a) {
        1 -> "Yes baby"
        2 -> "No baby"
        else -> "None"   // Else is mandatory here because of the function signature
    }



// Example of a function in kotlin.
fun max(a:Int , b:Int) : Int {
    return if (a > b) a else b ;
}


fun one() = 1 // This is a simple expression for returning a one liner code in kotlin.