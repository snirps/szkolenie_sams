/**
 * Created by Karol on 2015-06-29.
 */
package zadanko2

//ctrl+d kopiuje zaznaczona linie
//ctrl+tab
//find usages -> alt+shift+
data class Cow(val name:String, val age:Int, val parent:Cow?=null)

fun main(args: Array<String>) {
    val cow=Cow("ala",20)
    val cow1=Cow("bab",15,cow)
    val cow2 = Cow("cow",10,cow)
    val list = listOf(cow,cow1,cow2)
    /* najprostrze rozwiazanie
for (a in list){
    if(a.age>=15){
        println(a.name)
    }
}
*/
/*
    //wyrazenie lambda -> definicja funkcji w sposob uproszczony
    list.filter({cow -> cow.age>=15})
*/
/*
    //wyrazenie lambda -> definicja funkcji w sposob uproszczony (ujednolicenie)
    list.filter({it.age>=15}).forEach{println(it)}
*/

    //wyrazenie lambda -> definicja funkcji w sposob uproszczony (ujednolicenie i uproszczenie)
    list filter {it.age>=15} forEach{println(it)}

    //wyrazenie lambda -> definicja funkcji w sposob uproszczony (ujednolicenie)
    val newList= list filter {it.age>=15} map {it.name}
    //println(newList)

    var average = list.sumBy { it.age } / list.count()
    //println(average)
 /*
    //list.joinToString(",",transform ={it.name})
    println(list.joinToString(",",transform ={it.name}))
*/
    //list.joinToString(",", {it.name}-> poza poniewaz jest na koncu
    list.joinToString(",") {it.name}



    //skladamy cala liste w jeden obiekt (w inta, stringa), cur->aktualna krowa, acc->akumulator(krowa pierwsza)
    //list.fold("") {acc, cur -> acc + cur.name + ","}
    list.fold(0) {acc, cur -> acc + cur.age}

    //groupBy zwraca nam mapê/liste i do klucza przypisana jest lista krow


    //dzialanie groupBy ((klucz)ALA->(lista)[BAB,CAC} i NULL-> [ALA], it = ALA->[BAB,CAC}

    list.groupBy {it.parent}
            .filter{it.getValue().size()>1}
            .map {it.getKey()}

    //val tmpMap: MutableMap<Cow,MutableList>

    //tworzenie listy obiektow - niemodyfikowalna
    listOf("aaa","bbb")
    //modyfikowanlan lista obiektow
    arrayListOf("AAA","BBB")

    //slownik
    val dict = mapOf("AAA" to 123,
           "VVV" to 321 )

    println(dict["AAA"])

}

