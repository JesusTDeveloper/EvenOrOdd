fun main() {
    println("Par o Impar?")
    println("Ingresa un número:")
    val input = readln()

    if (input.toIntOrNull() != null) {
        val number = input.toInt()
        if ((number%2) == 0) {
            println("$number es PAR")
        } else {
            println("$number es IMPAR")
        }
    } else {
        println("ERROR, entrada no numérica")
    }
}