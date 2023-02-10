package challenge2

fun main() {

    // init float 2 ways
    var float1 = -3847.384f
    var float2 : Float = -3847.384f

    // init nullable float 2 ways
    var float3 : Float? = -3847.384f
    var float4 : Float? = -3847.384.toFloat()

    // type primitif
    var array1 = shortArrayOf(1, 2, 3, 4, 5)
    // object
    var array2 : Array<Short> = arrayOf(1, 2, 3, 4, 5)

    // init nullable array of int with values 5 to 200
    val array3 = Array<Int?>(40) { i -> (i+1) * 5 }

    // init char array that could be use in a java method
    var charArray = charArrayOf('a', 'b', 'c')

    // init nullable string
    val x: String? = "I AM UPPERCASE"
    // create new string with lowercase if not null, set I give up otherwise
    val z = x?.lowercase() ?: "I give up"

    // lowercase the value and then modify it
    x?.let { it -> println(it.lowercase().replace("am","am not")) }

    // Indicate that the variable isnt null (even if it is in the example)
    val nonNullVariable: Int? = null
    nonNullVariable!!.toDouble()
}