/**
 * Created by Karol on 2015-06-29.
 */

package zaa_obsluga_klasy

//wlasny wyjatek:
class WlasnyWyjatek(napis:String):Exception(napis)

//klasa abstrakcyjna ktorej pola musza byc zaimplementowane w klasie nadrzednej
abstract class Animals(protected val name:String, protected val lastName:String) {
    //abstract fun drink() -> abstrakcyjna metoda
}

interface Age{
    var age: Int
}

class Cow(name:String, lastName: String, var eatenFood:Int = 0, var maxEeat:Int = 0): Animals(name, lastName),Age {
    @override
    var age: Int =0
    get()=throw UnsupportedOperationException()

    init {
        //wywoluje sie tutaj metody z innych obiektow, rejestrujemy sie us³ugi, implementuje interakcje z innymi obiektami z zewnatrz
        //obsluga wlasnego wyjatku
        if(maxEeat>10){
            throw WlasnyWyjatek("Za duzo zarcia na dzis")
        }
    }

    //zadeklarowane pola sa widoczne w calym pakiecie:
    var fullName = "$name $lastName"
    // fun eat(volume: TYP):RETURN_VALUE
    fun eat(volume: Int) {
        //sprawdzamy czy to co zjadla krowa nie przekroczy jej dziennego limitu
        if (eatenFood+volume >= maxEeat){
            eatenFood=maxEeat
        }
        else{
            eatenFood += volume
        }
    }
}
fun main(args: Array<String>) {
    val cow = Cow("Mucka","Mleczna",1,10)
    val cow2= Cow("Melania","Szalona",0,5)

    cow.eat(4);
    cow2.eat(10);

    println(cow.eatenFood);
    println(cow2.eatenFood)

}
