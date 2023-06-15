fun printProgressBar(current: Int, total: Int, color: String = WHITE.ON, name: String = "") {
    val progressBarLength = 50
    val progress = (current.toDouble() / total.toDouble()) * progressBarLength
    val filled = progress.toInt()
    val remaining = progressBarLength - filled

    val builder = StringBuilder()
    val formattedName =
        name.padEnd(10) // Formatieren Sie den Namen, um sicherzustellen, dass er eine Breite von 10 Zeichen hat
    builder.append("$formattedName: ") // Fügen Sie den Namen vor dem Fortschrittsbalken hinzu
    builder.append(color)
    for (i in 0 until filled) {
        builder.append("█")
    }
    for (i in 0 until remaining) {
        builder.append(" ")
    }
    builder.append("|") // Fügen Sie den geraden Strich am Ende des Fortschrittsbalkens hinzu
    builder.append(WHITE.OFF)
    println("\r$builder")
    //clearScreen100()
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


// Hier ist der Code der Die Fragen lädt und den Progress-Balken steuert:

fun game1deu() {
    var position = fragen.size * 10 / 2
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
        printProgressBar(position, fragen.size * 20)
        println()
    }
    println("")
}


// Globale Variablen
var yesCount = 0
var noCount = 0

fun game1eng() {
    var position = fragen.size * 10
    val gemischteFragenFakten = fragenFaktenEng.shuffled()  // Fragen und Fakten gemeinsam mischen
    for (i in gemischteFragenFakten.indices) {
        var answer: String
        do {
            print(CYAN.ON)
            print("Question ${i + 1} / ${fragenFaktenEng.size}: ${gemischteFragenFakten[i].first.wordWrap(100)}\n1 for Yes, 2 for No ")
            print(CYAN.OFF)
            answer = readln()
            println()
            if (answer != "1" && answer != "2") {
                print(RED.ON)
                println("Invalid input, please enter 1 for Yes or 2 for No.")
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
        printProgressBar(position, fragen.size * 20, WHITE.ON, "Spieler1")
        updateAdditionalProgressBars()
        printAdditionalProgressBars()
        println(gemischteFragenFakten[i].second.wordWrap(100))  // Fakt anzeigen
        println()
    }
    println("")
}

fun game1tur() {
    var position = 0
    val gemischteFragen = fragenTur.shuffled()
    for (i in gemischteFragen.indices) {
        var answer: String
        do {
            print(CYAN.ON)
            println("Soru ${i + 1}: ${fragenTur[i]}\n1 için Evet, 2 için Hayır")
            print(CYAN.OFF)
            answer = readln()
            if (answer != "1" && answer != "2") {
                print(RED.ON)
                println("Geçersiz giriş, lütfen Evet için 1 veya Hayır için 2 girin.")
                print(RED.OFF)
                println()
            }
        } while (answer != "1" && answer != "2")

        if (answer == "1") position += 10 else position -= 10
        printProgressBar(position, fragenTur.size * 10)
        println()
    }
    println("")
}

fun game1pol() {
    var position = 0
    val gemischteFragen = fragenPol.shuffled()
    for (i in gemischteFragen.indices) {
        var answer: String
        do {
            print(CYAN.ON)
            println("Pytanie ${i + 1}: ${fragenPol[i]}\n1 dla Tak, 2 dla Nie")
            print(CYAN.OFF)
            answer = readln()
            if (answer != "1" && answer != "2") {
                print(RED.ON)
                println("Nieprawidłowe dane wejściowe, wprowadź 1 dla Tak lub 2 dla Nie.")
                print(RED.OFF)
                println()
            }
        } while (answer != "1" && answer != "2")

        if (answer == "1") position += 10 else position -= 10
        printProgressBar(position, fragenPol.size * 10)
        println()
    }
    println("")
}

fun game1arb() {
    var position = 0
    val gemischteFragen = fragenArb.shuffled()
    for (i in gemischteFragen.indices) {
        var answer: String
        do {
            print(CYAN.ON)
            println("السؤال ${i + 1}: ${fragenArb[i]}\n1 للنعم، 2 لللا")
            print(CYAN.OFF)
            answer = readln()
            if (answer != "1" && answer != "2") {
                print(RED.ON)
                println("إدخال غير صالح، يرجى إدخال 1 للنعم أو 2 لللا.")
                print(RED.OFF)
                println()
            }
        } while (answer != "1" && answer != "2")

        if (answer == "1") position += 10 else position -= 10
        printProgressBar(position, fragenArb.size * 10)
        println()
    }
    println("")
}

