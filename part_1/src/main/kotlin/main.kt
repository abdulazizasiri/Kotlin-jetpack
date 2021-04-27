fun main(args: Array<String>) {
    val name = " Kotlin"
    println("Hello ${name}")  // String interpolations

    // Variables

    printVars()
    println(max(10,20))  // 
}

fun printVars() {
    var age  = 20  // Mutable

    val pi = 3.14 // Immutable

    println(age)

    println(pi)
}

fun max(a:Int , b:Int) : Int {
    return if (a > b) a else b ;
}
