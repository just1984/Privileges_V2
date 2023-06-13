fun printProgressBar(current: Int, total: Int) {
    val progressBarLength = 50
    val progress = (current.toDouble() / total.toDouble()) * progressBarLength
    val filled = progress.toInt()
    val remaining = progressBarLength - filled

    val builder = StringBuilder()
    //builder.append("[")
    for (i in 0 until filled) {
        builder.append("█")
    }
    for (i in 0 until remaining) {
        builder.append(" ")
    }
    // builder.append("]")
    //print(RED.ON)
    print("\r$builder $current/$total")
   // print(RED.OFF)
    println()
}

fun game1() {
    var position = 0
    val gemischteFragen = fragen.shuffled()
    for (i in gemischteFragen.indices) {
        var answer: String
        do {
            print(CYAN.ON)
            println("Frage ${i + 1}: ${fragen[i]}\n1 für Ja, 2 für Nein")
            print(CYAN.OFF)
            answer = readln()
            if (answer != "1" && answer != "2") {
                print(RED.ON)
                println("Ungültige Eingabe, bitte gib 1 für Ja oder 2 für Nein ein.")
                print(RED.OFF)
                println()
            }
        } while (answer != "1" && answer != "2")

        if (answer == "1") position += 10 else position -= 10
        printProgressBar(position, fragen.size * 10)
        println()
    }
    println("")
}
