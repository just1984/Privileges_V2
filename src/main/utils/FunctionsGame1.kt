var yesCount = 0
var noCount = 0

fun game1deu() {
    var position = fragen.size * 10 / 2
    val gemischteFragen = fragenFaktenDEU.shuffled()
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

fun game1eng() {
    var position = fragen.size * 10
    val gemischteFragenFakten = fragenFaktenEng.shuffled()
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
        println(gemischteFragenFakten[i].second.wordWrap(100))
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

