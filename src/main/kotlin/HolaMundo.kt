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

}