class Persona(var peso: Double, var altura: Double) {

    var nombre: String = ""

    init {
        require(nombre.isNotBlank()){"El nombre no debe estar vacio."}
    }

    private val imc: Double = peso/(altura*altura)

    constructor(nombre: String, peso: Double, altura: Double) : this(peso, altura) {
        this.nombre = nombre
    }

    override fun equals(other: Any?): Boolean {

    }

    override fun toString(): String {
        return "Persona: Nombre = $nombre, Peso: ${peso}kg, Altura: ${altura}m, IMC: $imc"
    }
}