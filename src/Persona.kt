class Persona(var peso: Double, var altura: Double) {
    val imc: Double
        get() = calcularIMC()

    var nombre: String? = null

    constructor(nombre: String, peso: Double, altura: Double) : this(peso, altura) {
        this.nombre = nombre
    }

    private fun calcularIMC() : Double {
        return peso / (altura * altura)
    }

    override fun toString(): String {
        if(this.nombre == null) {
            return "Peso: $peso, Altura: $altura, IMC: $imc"
        } else {
            return "Nombre: $nombre, Peso: $peso, Altura: $altura, Imc: $imc"
        }
    }

    override fun equals(otro: Any?): Boolean {
        if (this === otro) {
            return true
        }
        if (otro !is Persona) {
            return false
        }

        return nombre == otro.nombre && peso == otro.peso && altura == otro.altura
    }
}