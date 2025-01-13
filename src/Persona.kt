class Persona(nombre:String, edad:Int) {

    var nombre:String = nombre
    var edad:Int = edad

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun toString(): String {
        return "Persona (nombre = $nombre, edad = $edad)"
    }

    override fun hashCode(): Int {
        var result = nombre.hashCode()
        result = 31 * result + edad.hashCode()
        return result
    }
}