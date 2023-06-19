var userName = ""
var yesCount = 0
var noCount = 0

fun game1deu() {
    var position = fragenFaktenDEU.size * 10
    val gemischteFragen = fragenFaktenDEU.shuffled()
    for (i in gemischteFragen.indices) {
        var answer: String
        do {
            print(CYAN.ON)
            println("Frage ${i + 1} / ${fragenFaktenDEU.size}: ${gemischteFragen[i].first.wordWrap(100)}\n1 für Ja, 2 für Nein")
            print(CYAN.OFF)
            print("${CYAN.ON}--> ${CYAN.OFF}")
            answer = readln()
            println()
            if (answer != "1" && answer != "2") {
                print(RED.ON)
                println("Ungültige Eingabe, bitte gib 1 für Ja oder 2 für Nein ein.")
                print(RED.OFF)
                println()
            }
        } while (answer != "1" && answer != "2")

        if (answer == "1") {
            position += 10
            yesCount++
        } else {
            position -= 10
            noCount++
        }
        printProgressBar(position, fragenFaktenDEU.size * 20, WHITE.ON, userName)
        updateAdditionalProgressBars()
        printAdditionalProgressBars()
        println("")
        printInBox2(gemischteFragen[i].second)
        clearScreen5()
    }
}
