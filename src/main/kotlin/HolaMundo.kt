fun main(args: Array<String>)
{
    println("adios mundo")
    var x=10
    var y=20
    var z=70

    println("Suma:  "+  x.plus(y).plus(z))

    println("Resta:  "+ x.minus(y).minus(z))

    println("Division:  "+ x.div(y).div(z))

    println("Multiplicacion:  "+ x.times(y).times(z))

    //Strings

    val nombre= "Jose Carlos"
    val apellido ="Cabello"
    println("Tu nombre es:   $nombre $apellido \n" )

    val parrafo:String = """
      **  You and I who stood and faced each other beneath the cherry blossoms
        Is no coincidence
      **  Just like this season, it was a beautiful destiny
      **  Just like the promise we shared beneath the cherry blossoms
        Our hearts won’t change
        When we met each other on that dazzling day is no coincidence
        It’s no coincidence, it was us who were dreaming of it
    """.trimIndent()

    println(parrafo.trimMargin("**"))



    //for y rangos

    println("\t\t\t\n\n Cilco for\n")
    val uno_cinco= 1..5
    for(i in uno_cinco){
        println(i)
    }
    println("\t\n Letras")
    for (letra in 'A'..'D') {
        println(letra)
        }
    println("\t\n Numeros cuenta regresiva: ")

    for(i in '5' downTo '1'){
        println(i)
    }

    println("\t\n Letras cuenta regresiva: ")
    for(letra in 'D' downTo 'A'){
        println(letra)
    }

    //if

    println("\t\t\t\n\n If\n")
    var num1= 1
    val num2=1
    if (num1.equals(num2))
        println("son iguales")
    else
        println("son diferentes")

    println("\t\t\t\n\n When \n")
    for(i in 0..7)
    {
        num1++
        if (num1==2||num1.equals(4)||num1==6)
        {
            when(num1)
            {
                in 1..3 -> println("esta dentro de 1-3")
                in 4..5 -> println("esta dentro de 3-5")
                !in 1..5 -> println("No esta dentro de 1-5")
            }
        }
    }
    println("\t\t\t\n\n While \n")
    num1=1

    while (num1<=7)
    {
        num1++
        if (num1==2||num1.equals(4)||num1==6)
        {
            when(num1)
            {
                in 1..3 -> println("esta dentro de 1-3")
                in 4..5 -> println("esta dentro de 3-5")
                !in 1..5 -> println("No esta dentro de 1-5")
            }
        }
    }


    //nulls

    println("\t\t\t\n\n nulls \n")
    var i:Int? = null //null
    i?.plus(num2) //verifica si el numero es nulo
    println(i)





}