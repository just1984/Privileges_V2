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
            answer = readln()
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
        println(gemischteFragen[i].second.wordWrap(100))
        println("---------------------------------------------")
        println()
        println()
    }
    println("")
}

fun game1eng() {
    var position = fragenFaktenEng.size * 10
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
        printProgressBar(position, fragenFaktenEng.size * 20, WHITE.ON, userName)
        updateAdditionalProgressBars()
        printAdditionalProgressBars()
        println(gemischteFragenFakten[i].second.wordWrap(100))
        println("---------------------------------------------")
        println()
        println()
    }
    println("")
}
fun game1pol() {
    var position = fragenFaktenPOL.size * 10
    val gemischteFragen = fragenFaktenPOL.shuffled()
    for (i in gemischteFragen.indices) {
        var answer: String
        do {
            print(CYAN.ON)
            println("Pytanie ${i + 1} / ${fragenFaktenPOL.size}: ${gemischteFragen[i].first.wordWrap(100)}\n1 dla Tak, 2 dla Nie")
            print(CYAN.OFF)
            answer = readln()
            if (answer != "1" && answer != "2") {
                print(RED.ON)
                println("Nieprawidłowe dane wejściowe, wprowadź 1 dla Tak lub 2 dla Nie.")
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
        printProgressBar(position, fragenFaktenPOL.size * 20, WHITE.ON, userName)
        updateAdditionalProgressBars()
        printAdditionalProgressBars()
        println(gemischteFragen[i].second.wordWrap(100))
        println("---------------------------------------------")
        println()
        println()
    }
    println("")
}

fun game1arb() {
    var position = fragenFaktenARAB.size * 10
    val gemischteFragen = fragenFaktenARAB.shuffled()
    for (i in gemischteFragen.indices) {
        var answer: String
        do {
            print(CYAN.ON)
            println("السؤال ${i + 1} / ${fragenFaktenARAB.size}: ${gemischteFragen[i].first.wordWrap(100)}\n1 للنعم، 2 لللا")
            print(CYAN.OFF)
            answer = readln()
            if (answer != "1" && answer != "2") {
                print(RED.ON)
                println("إدخال غير صالح، يرجى إدخال 1 للنعم أو 2 لللا.")
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
        printProgressBar(position, fragenFaktenARAB.size * 20, WHITE.ON, userName)
        updateAdditionalProgressBars()
        printAdditionalProgressBars()
        println(gemischteFragen[i].second.wordWrap(100))
        println("---------------------------------------------")
        println()
        println()
    }
    println("")
}

fun game1tur() {
    var position = fragenFaktenTURK.size * 10
    val gemischteFragen = fragenFaktenTURK.shuffled()
    for (i in gemischteFragen.indices) {
        var answer: String
        do {
            print(CYAN.ON)
            println("Soru ${i + 1} / ${fragenFaktenTURK.size}: ${gemischteFragen[i].first.wordWrap(100)}\n1 için Evet, 2 için Hayır")
            print(CYAN.OFF)
            answer = readln()
            if (answer != "1" && answer != "2") {
                print(RED.ON)
                println("Geçersiz giriş, lütfen Evet için 1 veya Hayır için 2 girin.")
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
        printProgressBar(position, fragenFaktenTURK.size * 20, WHITE.ON, userName)
        updateAdditionalProgressBars()
        printAdditionalProgressBars()
        println(gemischteFragen[i].second.wordWrap(100))
        println("---------------------------------------------")
        println()
        println()
    }
    println("")
}
