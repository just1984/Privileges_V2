fun spielDynamik_DE() {
    var position = fragenFaktenDEU.size * 10
    val gemischteFragen = fragenFaktenDEU.shuffled()
    for (i in gemischteFragen.indices) {
        var answer = ""
        do {
            try {
                print(CYAN.ON)
                println("Frage ${i + 1} / ${fragenFaktenDEU.size}: ${gemischteFragen[i].first.wordWrap(100)}\n1 für Ja, 2 für Nein")
                print(CYAN.OFF)
                print("${CYAN.ON}--> ${CYAN.OFF}")
                answer = readln()
                println()
                if (answer != "1" && answer != "2") {
                    throw IllegalArgumentException("Ungültige Eingabe. Bitte gib 1 für Ja oder 2 für Nein ein.")
                }
            } catch (e: IllegalArgumentException) {
                print(RED.ON)
                println(e.message)
                print(RED.OFF)
                println()
                continue
            }
        } while (answer != "1" && answer != "2")

        if (answer == "1") {
            position += 10
            yesCount++
        } else {
            position -= 10
            noCount++
        }
        printProgressBar(position, fragenFaktenDEU.size * 20, WHITE.ON, spielName)
        updateAdditionalProgressBars()
        printAdditionalProgressBars()
        println("")
        printInBox2(gemischteFragen[i].second)
        clearScreen5()
    }
}



/* Zuerst lege ich zwei globale Variablen fest: userName und yesCount, noCount.
Diese speichern den Namen der Benutzer*in und die Anzahl der mit 'Ja' bzw. 'Nein' beantworteten Fragen.

Die Funktion spielDynamik_DE steuert den Hauptspielverlauf.
Ich beginne damit, eine Variable position festzulegen, die die aktuelle Position der Benutzer*in
auf der Fortschrittsleiste darstellt. Diese wird anhand der Anzahl der Fragen berechnet.

Dann mische ich die Fragen mit der Funktion shuffled() durch,
um bei jedem Spiel eine andere Reihenfolge zu erreichen um das Spiel so laenger interessant zu halten.
Mit einer for-Schleife gehe ich durch alle gemischten Fragen.
Jede Frage wird der Benutzer*in gestellt und die Antwort wird eingelesen.
Falls die Eingabe ungültig ist (also nicht 1 oder 2),
wird eine Fehlermeldung ausgegeben und die Frage erneut gestellt.

Nachdem eine gültige Antwort eingegeben wurde,
aktualisiere ich die Position auf der Fortschrittsleiste basierend auf der Antwort.
Bei einem 'Ja' bewegt sich die Benutzer*in vorwärts, bei einem 'Nein' rückwärts.
Ebenso wird der jeweilige Zähler (yesCount/noCount) erhoeht.
Die Fortschrittsleiste wird dann mit der aktuellen Position aktualisiert und gedruckt.
Zusätzlich werden eventuelle zusätzliche Fortschrittsleisten aktualisiert und ebenfalls gedruckt.

Zum Schluss wird die Fakt-Information, die zu jeder Frage gehört,
in einem Textkasten gedruckt und der Bildschirm wird um fünf Zeilen nach oben gescrollt,
um die Ansicht zu klären. */