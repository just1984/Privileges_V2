fun printProgressBar(
    current: Int, total: Int, color:
    String = WHITE.ON, name: String = spielName
) {

    val progressBarLength = 50
    val progress = (current.toDouble() /
            total.toDouble()) * progressBarLength
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

/* Die Funktion printProgressBar wird verwendet, um eine Fortschrittsleiste in der Konsole anzuzeigen.
Sie nimmt vier Parameter entgegen:
1. current: Dieser Parameter repräsentiert den aktuellen Fortschritt.
2. total: Dieser Parameter repräsentiert den gesamten Fortschritt, der erreicht werden soll.
3. color: Dieser Parameter ist optional und setzt die Farbe der Fortschrittsleiste.
   Wenn keine Farbe angegeben wird, wird standardmäßig Weiß verwendet.
4. name: Dieser Parameter ist der Name, der vor der Fortschrittsleiste angezeigt wird.
   Hier wird entweder der eingegebene Spieler*innenname angezeigt oder der Name eines zufaelloig ausgewaehlten
   Characters.

Zunächst wird die Länge der Fortschrittsleiste auf 50 Zeichen festgelegt.
Dann berechne ich den aktuellen Fortschritt als Verhältnis von current zu total, multipliziert mit der Länge der Fortschrittsleiste.
Die Anzahl der ausgefüllten und der verbleibenden Zeichen in der Fortschrittsleiste wird berechnet.

Mit einem StringBuilder erstelle ich die Ausgabe für die Fortschrittsleiste.
Zuerst füge ich den Namen hinzu, der auf 10 Zeichen aufgefüllt wird, gefolgt von einem Doppelpunkt.
Danach füge ich die Farbe der Fortschrittsleiste hinzu und dann die tatsächliche Fortschrittsleiste, die aus gefüllten und leeren Zeichen besteht.

Schließlich gebe ich die erstellte Fortschrittsleiste in der Konsole aus. */
