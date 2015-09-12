/**
 * Created by Karol on 2015-06-29.
 */
package zadanko
//kotlinlang.org
//najlepiej pisac data classe z powiazana classa

/*
class cow(name:String, lastName: String,  var eatenFood:Int = 0, var age:Int=0,val weight:Int=0) {
    //pola sa widoczne w calym pakiecie
    var fullName = "$name $lastName"

    //nadpisanie definicji przez metode equals, skrot alt+insert
    override fun equals(other: Any?): Boolean {
        if (other is cow) {
            return fullName == other.fullName
        }
        return false
    }

    override fun toString(): String {
        return fullName
    }

}
*/
fun test(napis: String){
    println(napis)
}
//kazda klasa moze dziedziczy tylko po jednej klasie
//nie mozemy bezposrednio utworzyc obiektu po abstract
//
abstract class Animal(protected val name:String, protected val lastName:String) {
    //abstract fun drink()
}

//idea interface - sposob na rozwiazanie wielodziedziczenia, zawieraja pola i medoty ktore moge byc zaimportowane przez inna klase
//
interface Beeing{
    val age: Int
}
/*
    //znak "?" daje nam tyle ze zmienna jest albo (w tym przypadku) stringiem albo nullem któego musimy obs³u¿yc
class Cow(name:String, lastName: String,  var eatenFood:Int = 0, var maxEeat:Int = 0):Animal(name,lastName),Beeing {
        override val age: Int = 0
            get() = throw UnsupportedOperationException()

        //pola sa widoczne w calym pakiecie
    var fullName = "$name $lastName"
    fun eat(volume: Int) {
/*
        if (eatenFood+volume >= maxEeat){
            eatenFood=maxEeat
        }
        else{
            eatenFood += volume
        }
*/
        //operator Elvisa "?:"
        test(lastName ?: "")

        //SmartCast
        if(lastName!=null){
            test(lastName)
        }
        //wskazujemy ze to my mamy racje
        lastName!!.length()
        //sprawda czy jest nullem
        lastName?.length()

        eatenFood=Math.min(maxEeat,eatenFood+volume)
    }
    //na niebiesko blad w naszym kodzie a nie w bibliotece


}


//tylko jeden main w jednym package
fun main(args: Array<String>) {
    /*val cow = cow("Mucka","Mleczna")
    val cow3 = cow("Mucka","Mleczna")
    val cow2=cow("Melania","Szalona",5)
    val cow0=cow(weight = 10,age=1,eatenFood = 4, name = "Kocurek",lastName = "Bialy")
    println(cow.fullName)
    //cow.eat(10)
    //cow2.eat(3)
    //nadpisanie definicji przez metode equals
    //println(cow==cow3)
    //println(cow)
    //=== - sprawdza czy obiekt ma ten sam adres
    val p1 = Point(1,2,3)
    val p2 = Point(1,2,3)

    println(p1==p2)
    println(p1===p2)

    println(p1)

    val newPoint = p1.copy(y=10) //poniewaz pola w klasie sa stale (val)
    println(newPoint)
    */

    /*
    val cow = Cow("Mucka","Mleczna",1,maxEeat = 5)

    cow.eat(3)
    println(cow.eatenFood)

    */

}
