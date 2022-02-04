package com.example.a01_helloandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //variablesYConstants()
        //dataTypes()
        //sentenciaIf()
    }
    /*
       Aqui vamos a hablar de variables y constantes --------------------------------
     */
    private fun variablesYConstants(){
        //Variables
        var myFirstVariable = "Hello World!"
        println(myFirstVariable)

        myFirstVariable = "Welcome!"
        println(myFirstVariable)

        //Constants
        val myFirstConstant = "This is a constant"
        println(myFirstConstant)
    }

    //Data Types --------------------------------------------------------------------------
    private fun dataTypes(){
        //String
        val myString: String ="This is a String"
        val myString2 ="This is also a string"
        val myString3: String = myString+ " " + myString2
        println(myString3)

        //Enteros (Byte, Short, Int, Long)
        val myInt:Int=1
        val myInt2 = 2
        val myInt3:Int = myInt+myInt2
        println(myInt3)

        //Dacimales(Float, Double)
        val myFloat:Float = 1.5f
        val myDouble = 1.5
        val myDouble2 = 2.6
        val myDouble3 = 1 //En realidad es un Int
        val myDouble4:Double = myDouble+myDouble2+myDouble3
        println(myDouble4)

        //Boolean (Bool)
        val myBool:Boolean = true
        val myBool2 = false
        println(myBool == myBool2)
        println(myBool && myBool2)
    }

    //If Sentence ------------------------------------------------------------------
    private fun sentenciaIf(){
        val myNumber = 10

        //Operadores condicionales
        // > mayor que
        // < menor que
        // >= mayor o igual que
        // <= menor o igual que
        // == igualdad
        // != desigualdad

        //Operadores logicos
        // && operador "y"
        // || operador "o"
        // ! operador "no"

        // Sentencia if con operadores condicionales
        if (myNumber<=10){
            println("$myNumber es menor o igual que 10")
        }else{
            println("$myNumber es mayor que 10")
        }

        //Sentencia if con operadores logicos
        if (myNumber<10 && myNumber >5){
            println("$myNumber es menor o igual que 10 y mayor que 5")
        }else{
            println("$myNumber es mayor que 10 o menor o igual que 5")
        }
    }

    //When sentence -------------------------------------------------------------
    private fun whenSentence(){
        //When con string
        val country ="Mexico"
        when(country){
            "México", "Argentina", "Chile" -> {
                println("El idioma es Español")
            }
            "Perú" -> {
                println("El idioma es Español")
            }
            "España" -> {
                println("El idioma es Español")
            }
            "EEUU" ->{
                println("El idioma es Inglés")
            }
            else -> {
                println("No conocemos el idioma")
            }
        }

        //When con Int
        val age=15
        when (age){
            0,1,2 -> {
                println("Eres un bebé")
            } in 3..10 -> {
                println("Eres un niño")
            } in 11..17 -> {
                println("Eres un adolescente")
            } in 18..69 -> {
                println("Eres adulto")
            } in 70..99 -> {
                println("Eres anciano")
            }else -> {
                println("Ninguno")
            }

        }
    }

    // Arreglos ---------------------------------------------------------------------
    fun arrays(){
        val name = "Guadalupe"
        val lastname = "Moure"
        val company = "ITSJ"
        val age = "32"

        //Creación de un array
        val myArray:ArrayList<String> = arrayListOf<String>()

        //Añadir datos de uno en uno
        myArray.add(name)
        myArray.add(lastname)
        myArray.add(company)
        myArray.add(age)

        print(myArray)

        //Añadir un conjunto de datos
        myArray.addAll(listOf("Hola","Este es un arreglo"))
        println(myArray)

        //Acceso a datos
        val myCompany=myArray[2]
        print(myCompany)

        //Modificar datos
        myArray[5] = "Bienvenido"
        println(myArray)

        //Eliminar datos
        myArray.removeAt(4)
        println(myArray)

        //Recorrer datos
        myArray.forEach{
            println(it)
        }

        //Otras operaciones
        myArray.count() //Saber cuantos elementos hay
        myArray.clear() //Limpiar
        myArray.first() //Primer elemento
        myArray.last() //Ultimo elemento
    }

    //Mapas o diccionarios --------------------------------------------
    fun maps(){
        //Sintaxis
        var myMap:Map<String,Int> = mapOf()
        var myMap2:Map<String,Int> = mapOf()
        println(myMap)

        //Añadir elementos (no existe un elemento en los mapas)
        myMap = mapOf("Guadalupe" to 1, "Pedro" to 2)
        myMap2 = mutableMapOf("Guadalupe" to 1, "Pedro" to 2)
        println(myMap)

        //Añadir un solo valor
        myMap2["Ana"]=3
        myMap2.put("Maria",4)
        println(myMap2)

        //Actualizacion de un dato
        myMap2.put("Guadalupe",3)
        myMap2["Guadalupe"]=4
        myMap2.put("Marcos",3)
        println(myMap2)

        //Acceso a datos
        println(myMap2["Guadalupe"])

        //Eliminar datos
        myMap2.remove("Marcos")
        println(myMap2)
    }

    //Bucles For y While -----------------------------------------------------------------------
    private fun loops(){
        //Bucles
        val myArray:List<String> = listOf("Hola","Bienvenido","Este es un arreglo")
        val myMap:MutableMap<String,Int> = mutableMapOf("Guadalupe" to 1, "Pedro" to 2)

        //for
        for (myString in myArray){
            println(myString)
        }

        for(myElement:MutableMap.MutableEntry<String,Int> in myMap){
            println("${myElement.key}-${myElement.value}")
        }

        //Recorrer rangos
        for(x in 0..10){
            println(x)
        }

        for(x in 0 until 10){
            println(x)
        }

        for(x in 0..10 step 2){
            println(x)
        }

        for(x in 10 downTo 0 step 3){
            println(x)
        }

        val myNumericArray:IntRange = (0..20)
        for (myNum:Int in myNumericArray){
            println(myNum)
        }

        //while
        var x=0
        while(x<10){
            println(x)
            x++
            x+=2
        }
    }

    //Seguridad contra nulos ----------------------------------------------
    fun nullSafety(){
        var myString = "Hola"
        // myString= null esto daria un error de compilación
        println(myString)

        //Variable null safety
        var mySafetyString:String? = "null safety"
        mySafetyString=null
        println(mySafetyString)

        mySafetyString = "Hola"
        //println(mySafetyString)

        /*if(mySafetyString != null){
            println(mySafetyString!!)
        }else{
            println(mySafetyString)
        }*/

        //Safe call
        println(mySafetyString?.length)
        mySafetyString?.let {
            println(it)
        } ?: run { println(mySafetyString) }
    }

    //Funciones ---------------------------------------------------------
    fun functions(){
        sayHello()
        sayHello()
        sayHello()

        sayMyName("Guadalupe")
        sayMyName("Ana")

        sayMyNameAndAge("Guadalupe",22)

        println(sumTwoNumbers(10,5))
    }

    //Funcion simple
    fun sayHello(){
        println("Hola!")
    }

    //Funciones con un parametro de entrada
    fun sayMyName(name:String){
        println("Hola mi nombre es $name")
    }

    //Funciones con un parametro de entrada
    fun sayMyNameAndAge(name:String,age:Int){
        println("Hola mi nombre es $name y mi edad es $age")
    }

    //Funciones con un valor de retorno
    fun sumTwoNumbers(first:Int,second:Int): Int{
        val sum = first+second
        return sum
    }

    //Clases -----------------------------------------------------------------
    fun classes(){
        val guadalupe = Programmer("Guadalupe",22,arrayOf(Programmer.Languaje.JAVA),null)
        println(guadalupe.name)

        guadalupe.age = 23

        val sara = Programmer("Sara",35, arrayOf(Programmer.Languaje.KOTLIN), arrayOf(guadalupe))
        sara.code()

        println("${sara.friends?.first()?.name} es amigo de ${sara.name}")
    }
}