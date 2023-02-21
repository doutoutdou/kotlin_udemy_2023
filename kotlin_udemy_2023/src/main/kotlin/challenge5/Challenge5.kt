package challenge5


fun main(args: Array<String>) {

    val joe = Person("Joe", "Jones", 31)
    val (fname, lname, age) = joe
    println("fname $fname, lname $lname, age $age")

    val jane = Person("Jane","Smith", 45)
    val mary = Person("Mary", "Wilson", 14)
    val john = Person("John", "Regor", 65)
    val jean = Person("Jean", "Sorton", 78)


    // permet de creer une map avec le lastname en cle et la person en valeur
    val people = mapOf("Jones" to joe, "Smith" to jane, "Wilson" to mary, "Regor" to john)

    // on souhaite compter le nombre de personnes avec le nom de famille terminant par s
    println(people.count {  entry -> entry.value.lastName .startsWith('S')})

    // creation de pair avec prenom nom
    val peoplePair = people.map { entry -> Pair(entry.value.firstName, entry.value.lastName) }
    // plus court
    val peoplePair2 = people.map { Pair(it.value.firstName, it.value.lastName) }

    // utilisation de also
    // il faut penser a faire un it.map pour iterer sur la map
    people.also {
        it.map { println("${it.value.firstName} is ${it.value.age} years old") }
    }

    val list1 = listOf(1, 4 ,9 ,15, 33)
    val list2 = listOf(4, 15, 55 , -83 , 22 , 101)

    // pas besoin de faire un map comme en java, loperation est terminale ici
    val output = list1.filter { it in list2 }
    println(output)

    val regularPaper = Box<Regular>()
    var paper = Box<Paper>()
    paper = regularPaper

}


// on cree des component pour destructurer
// on aurait aussi pu faire une data class qui le gere par defaut
class Person(val firstName: String, val lastName: String, val age: Int) {
    operator fun component1(): String {
        return firstName
    }
    operator fun component2(): String {
        return lastName
    }
    operator fun component3(): Int {
        return age
    }

}

// out T pour dire que ca peut accepter T ou nimporte quelle sous classe
// on ajoute de la covariance, comme on le ferait avec un ? extends en java 
class Box<out T> {

}

open class Paper {

}

class Regular: Paper() {

}

class Premium: Paper() {

}

