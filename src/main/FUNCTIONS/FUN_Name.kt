fun askForUserName() {
    var name: String
    do {
        println("${GREEN.ON}Bitte gib deinen Namen ein:${GREEN.OFF}")
        print("${GREEN.ON}--> ${GREEN.OFF}")
        name = readln()
        if (name.length > 10) {
            println("Dein Name muss kürzer als 10 Zeichen sein.")
        }
    } while (name.length > 10)
    userName = name
    println()
}

/*
Die Funktion askForUserName() fragt den Benutzer nach seinem Namen und speichert
diesen in der globalen Variable userName. Der Name darf nicht länger als 10 Zeichen sein.
Wenn der Benutzer einen Namen eingibt, der länger als 10 Zeichen ist,
wird er aufgefordert, einen kürzeren Namen einzugeben.

Zuerst wird eine lokale Variable name deklariert.
Dann wird der Benutzer in einer Schleife aufgefordert, seinen Namen einzugeben.
Die Schleife läuft, solange der eingegebene Name länger als 10 Zeichen ist.

Innerhalb der Schleife wird zuerst eine Aufforderung ausgegeben,
den Namen einzugeben. Die Aufforderung wird in grüner Farbe ausgegeben,
um die Aufmerksamkeit des Benutzers zu erregen.

Dann wird der Benutzer aufgefordert, seinen Namen einzugeben.
Wenn der Benutzer einen Namen eingibt, der länger als 10 Zeichen ist,
wird er mit einer Nachricht informiert, dass der Name kürzer als 10 Zeichen sein muss.

Sobald der Benutzer einen gültigen Namen eingibt,
wird dieser in der globalen Variable userName gespeichert und eine Leerzeile wird ausgegeben,
um den Bildschirm aufzuräumen.
*/
