/**
 * Created by Karol on 2015-06-29.
 */
package zadanie_flamastry

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val name = scanner.next()
    var counter = 0
    var currentChar = name.first()

    for (a in name) {      //iteracja po ka¿dej sk³adowej zmiennej "name" przy pomocy zmiennej "a"
        if(a==currentChar)
            counter++
        else{
            print("$currentChar$counter")
            counter = 1
            currentChar = a
        }
    }
    print("$currentChar$counter")
}

//rozwi¹zanie alternatywne:

/*
   for (i in 0..name.length()-2){

       if(name.length() == i){
           break
       }

       if (name[i]==name[i+1]){
           counter++
       }
       if (name[i]!=name[i+1]){
           counter=0
       }

   }
   */
