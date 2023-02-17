package challenge4

fun main(args: Array<String>) {

    // gestion des ranges
    for(i in 5..5000 step 5) {
//        println(i)
    }

    val range = 5..5000
//    range.step(5).forEach { it -> println(it) }

    val rangeNegative = -500..0
//    rangeNegative.forEach {it -> println(it) }

    var total: Int
    var last = 1
    var beforeLast = 0
    for(i in 1..13){
        total = last + beforeLast
//        println(total)
        beforeLast = last
        last = total

    }

    // le but est dafficher uniquement 1 11 100 99 98 2
    iloop@ for(i in 1..5){
        println(i)
        if(i == 2) {
            break
        }
        for(j in 11..20) {
            println(j)
            for (k in 100 downTo 90) {
                println(k)
                if(k == 97){
                    continue@iloop
                }
            }
        }
    }

    var num = 3
    print(when {
        num > 100 -> -234.567
        num < 100 -> 4444.555
        else -> 0.0
    })
//    println(dnum)

}


