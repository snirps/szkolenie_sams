/**
 * Created by Karol on 2015-06-29.
 */
package wprowadzenie

import java.util.*

fun main(args: Array<String>) {

        val scanner = Scanner(System.`in`)
        val i = scanner.next()

        if (i.last() == 'a'){
            println("imie damskie ${i}") //dolar dodaje zmienna do stringa wraz z mozliwoscia uruchomienia funkcji
        }
        else{
            println("imie meskie")
        }

}