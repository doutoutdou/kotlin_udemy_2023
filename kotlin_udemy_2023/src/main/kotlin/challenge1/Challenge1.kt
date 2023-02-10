package challenge1

fun main(args: Array<String>) {

    val hello1 = "Hello"
    val hello2 = "Hello"

    // test de reference
    println(hello1 === hello2)

    // test de comparaison dobjet
    println(hello1 == hello2)

    var number = 2988

    val value : Any = "any type"
    if (value is String) {
        println(value.uppercase())
    }

    val ones = """    1   
                 |   11
                 |  111
                 | 1111""".trimMargin()

    // juste pour lexemple
    println("$ones")


}