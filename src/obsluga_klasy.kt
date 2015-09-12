/**
 * Created by Karol on 2015-06-29.
 */
package obsluga_klasy

//wlasny wyjatek:
class WlasnyWyjatek(napis:String):Exception(napis)

//w przypadku gdy "name:String" nie posiada deklaracji (val,var),zmienna istnieje tylko w momencie tworzenia obiektu a pó¿niej jest usuwana, nie mo¿na sie do niej odwo³aæ
class Cow(name:String, lastName: String, var eatenFood:Int = 0, var maxEeat:Int = 0) { //parametry ktore przyjmuje klasa moga byc zadeklarowane w konstruktorze
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

