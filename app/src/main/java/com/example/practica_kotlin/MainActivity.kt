package com.example.practica_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}


/*fun main() {
    var num1 = 10
    val num2 = 33
    val num3 = 66
    var result = num1 + num2 + num3
    println(result)
    num1 = 55
    result = num1 + num2 + num3
    println(result)
    val avg = result / 3
    println(avg)
}
*/

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    amanda.showProfile()
    atiqah.showProfile()
}
class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        println("Likes to $hobby")
        println(if (referrer !== null) "Has a referrer named ${referrer.name}, who likes to play ${referrer.hobby}" else "Doesn't have a referrer" )

    }


}