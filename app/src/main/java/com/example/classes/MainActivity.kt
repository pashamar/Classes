package com.example.classes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.ParcelFileDescriptor

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var car:Car = Car();
        var animal:Animal = Animal();
        var furniture:Furniture = Furniture();
        var car10:Car
        var alcohol:Alcohol = Alcohol();

    }

    class Car{
        lateinit var name:String;
        lateinit var color:String;
        lateinit var description:String;


        var car1:Car = Car();
        var car2:Car = Car();
        var car3:Car = Car();
        //car1.name = "BMW"
        //car2.color = "black"

        //println(Car1.name)

        fun drive():String{
            return "Машина едет";
        }

    }

    class Animal{
        lateinit var name:String;
        lateinit var type:String;
        lateinit var gender:String;

        fun zoo():String{
            return "Welcome to the zoo!";
        }

    }

    class Furniture{
        lateinit var name:String;
        lateinit var color:String;
        lateinit var descriptor:String;
    }

    class Alcohol{

        lateinit var name:String;
        lateinit var type:String;
        lateinit var description:String;

        var alcohol1:alcohol = Alcohol();

        alcohol1.name = "Beer"
        alcohol2.name = "Vodka"
        alcohol3.name = "Whisky"

        println(alcohol2.name)

    }

    fun main() {

        var user1 = User("Pablo", 30)

        println("user name: ${user1.name}")
        println("user age: ${user1.age}")

        var user2 = User("Andrew", 40)

        println("user name: ${user2.name}")
        println("user age: ${user2.age}")

    }

    class User(name: String, age: Int) {
        var name = name
        var age = age

    }

    class Pets(var name:String){
    var children: MutableList<Pets> = mutableListOf()

    }


    fun main() {
        var pets = Pets("Micky")
        var child = Pets("Little Micky!")
        pets.children.add(child)

    }

    class Basket{

        var lenght: Int = 10
        var width: Int = 20
        var height: Int = 5

        fun fillBasket(){
            println("Basket is Filled")
        }

        fun openBasket(){

            println("Basket Opened")

        }

        fun main(){
            var basket1 = Basket()
            var basket2 = Basket()
            var basket3 = Basket()

            println("Height: ${basket1.height}")
            println("Length: ${basket1.height}")
            println("Width: ${basket1.height}")

            basket1.openBasket()
            basket1.fillBasket()


        }

        class Track (var name:String, type:String, description:String, var speed : Int){

            fun driveTrack(){
                println("Track is driving")

            }

            fun applyStop(){
                println("Stop applied")
            }
        }

        fun mail(){

            var volvo = Track("volvo", "petrol", "automate", 100)
            var mersedes = Track("mersedes", "patrol", "manual", 120)
            var peugeot = Track("peugeot","diesel", "automate", 120)
            var kamaz = Track("kamaz", "electro", "smart drive", 150)

        }

        class Drinks (var name:String, type:String, description:String,var price : Int){

            fun purchaseDrinks(){
                println("Drink purchased!")

            }

            fun cancelDrinks(){
                println("Drink canceled")
            }

        }

        fun drinks(){

            var whisky = Drinks ("Jim Beam", "String", "American", 50)
            var vodka = Drinks ("Absolut", "String", "American", 65)
            var rum = Drinks ("Caballeros", "String", "American", 77)
        }

        }

}