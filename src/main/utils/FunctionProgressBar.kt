fun printProgressBar(current: Int, total: Int, color: String = WHITE.ON, name: String = "") {

    val progressBarLength = 50
    val progress = (current.toDouble() / total.toDouble()) * progressBarLength
    val filled = progress.toInt()
    val remaining = progressBarLength - filled

    val builder = StringBuilder()
    val formattedName =
        name.padEnd(10)
    builder.append("$formattedName: ")
    builder.append(color)
    for (i in 0 until filled) {
        builder.append("█")
    }
    for (i in 0 until remaining) {
        builder.append(" ")
    }
    builder.append("|")
    builder.append(WHITE.OFF)
    println("\r$builder")
}