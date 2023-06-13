fun printProgressBar(current: Int, total: Int) {
    val progressBarLength = 50
    val progress = (current.toDouble() / total.toDouble()) * progressBarLength
    val filled = progress.toInt()
    val remaining = progressBarLength - filled

    val builder = StringBuilder()
    for (i in 0 until filled) {
        builder.append("█")
    }
    for (i in 0 until remaining) {
        builder.append(" ")
    }
    //print(RED.ON)
    print("\r$builder $current/$total")
   // print(RED.OFF)
    println()
}

fun game1() {
    when (chosenLanguage) {
        is Deutsch -> game1deu()
        is English -> game1eng()
        is Tuerkisch -> game1tur()
        is Polnisch -> game1pol()
        is Arabisch -> game1arb()
        else -> println("Es wurde keine Sprache gewaehlt.. Restarte das Programm.")
    }
}