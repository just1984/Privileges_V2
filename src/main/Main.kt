var userName = ""
var yesCount = 0
var noCount = 0
var spielName = ""
fun main() {
    var nochEinmal_DE = "j"
    onboarding()
    while (nochEinmal_DE == "j") {
        onboarding2_de()
        clearScreen100()
        spielDynamik_DE()
        evaluation_de()
        println("\n\nMöchtest du noch einmal spielen? (j/n)")
        nochEinmal_DE = readln()
    }
}

/* Mit der main Funktion beginnt mein Kotlin-Programm.
Ich habe eine Variable nochEinmal_DE initialisiert,
die die Entscheidung der Benutzer*in speichert, ob das Spiel noch einmal gespielt werden soll.
Sie ist standardmäßig auf "j" gesetzt.

Zu Beginn rufe ich die onboarding Funktion auf, um das Spiel zu starten.
Danach starte ich eine Schleife, die das Spiel solange wiederholt,
wie die Benutzer*in es erneut spielen möchte, sprich, solange nochEinmal_DE auf "j" gesetzt ist.

Innerhalb dieser Schleife beginne ich den zweiten Onboarding-Prozess,
indem ich die Funktion onboarding2_de aufrufe. Diese ermöglicht es den Benutzer*innen, ihren Charakter zu wählen.
Dann lösche ich den Terminalbildschirm, indem ich die Funktion clearScreen100 aufrufe.

Im nächsten Schritt starte ich den Hauptteil des Spiels durch den Aufruf der Funktion game1deu.
Nachdem das Spiel beendet ist, werte ich es aus, indem ich die Funktion evaluation_de aufrufe.

Zum Schluss frage ich die Benutzerin mit der Ausgabe "Möchtest du noch einmal spielen? (j/n)",
ob sie das Spiel erneut spielen möchte. Die Antwort der Benutzerin lese ich ein
und speichere sie in der Variable nochEinmal_DE.
Diese Entscheidung bestimmt, ob die Schleife weiterläuft oder nicht.*/
