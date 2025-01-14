class Persona(var nombre: String, var peso: Double, var altura: Double,var imc: Double) {

    constructor(nombre: String,imc: Double): this(nombre){
        this.imc = imc
    }

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun toString(): String {
        return "Persona (nombre = $nombre, peso = $peso)"
    }
}