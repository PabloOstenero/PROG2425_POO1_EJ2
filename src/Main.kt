fun main() {
    val persona1 = Persona(70.5, 1.75)
    val persona2 = Persona("Carlos", 80.0, 1.85)
    val persona3 = Persona("Ana", 60.0, 1.50)

    println(persona1)
    println(persona2)
    println(persona3)

    //Sobre la persona 1
    var nombre: String? = null
    while (nombre == null) {
        println("Introduce un nombre para introducirlo a la primera persona")
        nombre = readlnOrNull()?.trim()
    }

    persona1.nombre = nombre

    println("Nombre: ${persona1.nombre}, Peso: ${persona1.peso}, Altura: ${persona1.altura}")

    //Sobre la persona 3
    println("Peso: ${persona3.peso}, Altura: ${persona3.altura}, Imc: ${persona3.imc}")

    persona3.altura = 1.8

    println("Peso: ${persona3.peso}, Altura: ${persona3.altura}, Imc: ${persona3.imc}")

    //Sobre la persona 2
    persona2.altura = persona3.altura

    println(persona2)
    println(persona3)

    if(persona2 == persona3) {
        println("Las personas 2 y 3 son iguales")
    } else {
        println("Las personas 2 y 3 no son iguales")
    }
}