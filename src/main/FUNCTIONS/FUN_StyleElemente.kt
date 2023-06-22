fun clearScreen100() {
    for (i in 1..100) {
        println()
    }
}

fun clearScreen10() {
    for (i in 1..10) {
        println()
    }
}

fun clearScreen5() {
    for (i in 1..5) {
        println()
    }
}

fun String.wordWrap(len: Int): String {
    val words = this.split(' ')
    val lines = ArrayList<String>()
    var line = ""

    for (word in words) {
        if (line.length + word.length > len) {
            lines.add(line)
            line = ""
        }
        line += "$word "
    }

    if (line.isNotEmpty()) {
        lines.add(line)
    }

    return lines.joinToString("\n")
}

fun printInBox(text: String) {
    val line = "-".repeat(text.length + 4)

    println(line)
    println("| $text |")
    println(line)
}

fun printInBox2(text: String, maxLineLength: Int = 100) {
    val words = text.split(" ")
    val lines = mutableListOf<String>()
    var line = ""

    words.forEach { word ->
        if (line.length + word.length > maxLineLength) {
            lines.add(line)
            line = word
        } else {
            if (line.isNotEmpty()) {
                line += " "
            }
            line += word
        }
    }

    lines.add(line)

    val maxLength = lines.maxOf { it.length }
    val border = "${GREEN.ON}-".repeat(maxLength + 4) + "${GREEN.OFF}"

    println(border)
    lines.forEach { l ->
        println("${GREEN.ON}|${GREEN.OFF} ${l.padEnd(maxLength, ' ')} ${GREEN.ON}|${GREEN.OFF}")
    }
    println(border)
}

fun printInBox3(text: String, maxLineLength: Int = 100) {
    val words = text.split(" ")
    val lines = mutableListOf<String>()
    var line = ""

    words.forEach { word ->
        if (line.length + word.length > maxLineLength) {
            lines.add(line)
            line = word
        } else {
            if (line.isNotEmpty()) {
                line += " "
            }
            line += word
        }
    }

    lines.add(line)

    val maxLength = lines.maxOf { it.length }
    val border = "${GREEN.ON}-".repeat(maxLength + 4) + "${GREEN.OFF}"

    println(border)
    lines.forEach { l ->
        println("${GREEN.ON}|${GREEN.OFF} ${RED.ON}${l.padEnd(maxLength, ' ')}${RED.OFF} ${GREEN.ON}|${GREEN.OFF}")
    }
    println(border)
}