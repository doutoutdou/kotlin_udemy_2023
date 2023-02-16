package challenge3.kotlin


fun main() {
    val bicycle = KotlinBicycle(100, 3, 50)
    val moutainBike = KotlinMoutainBike(10, 50, 1, 20)
    val roadBike = KotlinRoadBike(30, 200, 5, 80)

    bicycle.printDescription()
    moutainBike.printDescription()
    roadBike.printDescription()

    val bicycleWithoutGear = KotlinBicycle(100, speed =   50)
    val moutainBikeWithoutGear = KotlinMoutainBike(10, 50,  speed = 20)
    val roadBikeWithoutGear = KotlinRoadBike(30, 200,  speed = 80)

    bicycleWithoutGear.printDescription()
    moutainBikeWithoutGear.printDescription()
    roadBikeWithoutGear.printDescription()

    val moutainBikeWithColor = KotlinMoutainBike("blue", 50,  5, 20, 100)
    moutainBikeWithColor.printDescription()

    KotlinMoutainBike.availableColors.forEach {println(it)}
}
// on declare en var car besoin de getter et setter
// surtout pas de private devant car sinon non accessible de lexterieur (pas comme en java)
// open pour rendre lheritage possible
// valeur par defaut pour la gear
open class KotlinBicycle(var cadence : Int, var gear: Int = 10, var speed : Int ){
    fun applyBrake(decrement : Int) {
        speed -= decrement
    }

    fun speedUp(increment : Int) {
        speed += increment
    }

    // on souhaite pouvoir surcharger la methode
    open fun printDescription() {
        val s = "Bike is in gear $gear with a cadence of $cadence " +
                "travelling at a speed of $speed"
        println(s)
    }
}

// on herite de KotlinBicycle et on ajoute un parametre
class KotlinMoutainBike(var seatHeight : Int, cadence: Int, gear: Int = 10, speed: Int)  : KotlinBicycle(cadence, gear, speed) {

    // on souhaite ajouter un parametre et donc creer un 2nd constructeur
    // il ne faut pas lajouter meme en tant que parametre dans le classe mais bien ici seulement
    constructor(color: String, seatHeight: Int, cadence: Int, gear: Int, speed: Int) : this(seatHeight, cadence, gear, speed) {
        println("this is the color $color")
    }


    override fun printDescription() {
        super.printDescription()
        println("this moutainbike has a seatHeight of $seatHeight")
    }

    companion object  {
        val availableColors = listOf("blue", "red", "white", "black", "green", "brown")

    }

}

// on herite de KotlinBicyle et on ajoute un parametre avec juste un getter
class KotlinRoadBike (val tireWidth : Int, cadence: Int, gear: Int = 10, speed: Int) : KotlinBicycle(cadence, gear, speed) {

    override fun printDescription() {
        super.printDescription()
        println("this roadbike has a tireWidth of $tireWidth")
    }
}
