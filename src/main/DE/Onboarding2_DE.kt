fun onboarding2_de() {
    val rollenZuweisung = rollenListeDeu.shuffled()
    println()
    val characterChoiceMessage =
        "${GREEN.ON}Wähle deinen Charakter:${GREEN.OFF} Möchtest du dich selbst spielen, oder möchtest du einen von 20 vorgefertigten Charakteren auswählen?"
    val characterChoicemessage2 =
        "1. Ich möchte mich selbst spielen\n2. Ich möchte einen vorgefertigten Charakter wählen"
    println(characterChoiceMessage.wordWrap(100))
    println()
    println(characterChoicemessage2.wordWrap(100))
    print("${GREEN.ON}--> ${GREEN.OFF}")

    val choice = readln()
    if (choice == "1") {
        spielName = userName
        println()
        val selfChoiceMessage =
            "Du hast dich entschieden, dich selbst zu spielen. Versuche, die Fragen so ehrlich wie möglich zu beantworten. ${BLUE.ON}Drücke Enter um das Spiel zu starten${BLUE.OFF}."
        println(selfChoiceMessage.wordWrap(100))
        println()
        readln()
    } else if (choice == "2") {
        val randomCharacter = rollenZuweisung.first()
        spielName = randomCharacter.name
        println()
        val roleAdaptionMessage =
            "Das ist deine Rolle. Versuche dich so gut wie möglich daran anzupassen. Schließe deine Augen und versuche dir für eine Sekunde vorzustellen, wie du dich in dieser Rolle fühlst. Beantworte alle folgenden Fragen basierend auf dieser Rolle."
        println(roleAdaptionMessage.wordWrap(100))
        println()
        print(ORANGE.ON)
        println(
            "Dein Name ist ${randomCharacter.name}, du bist ${randomCharacter.geschlecht} und ${randomCharacter.alter} Jahre alt. Deine Herkunft ist ${randomCharacter.herkunft}. ${randomCharacter.schicksal}".wordWrap(
                100
            )
        )
        println()
        print(ORANGE.OFF)
        Thread.sleep(3000)
        println("${BLUE.ON}Drücke Enter um das Spiel zu starten${BLUE.OFF}.")
        readln()
    } else {
        val invalidChoiceMessage =
            "${RED.ON}Du hast eine ungültige Option gewählt. Bitte versuche es erneut.${RED.OFF}\n\n"
        println(invalidChoiceMessage.wordWrap(100))
        onboarding2_de()
    }
}

/* Die Funktion onboarding2_de ist für den zweiten Teil des Onboarding-Prozesses zuständig,
in dem die Benutzer*innen ihren Charakter auswählen können.

Zuerst wird die Liste der Rollen durchmischt. Anschließend werden die Benutzer*innen gefragt,
ob sie sich selbst spielen oder einen der vorgefertigten Charaktere wählen möchten.
Dies geschieht durch die Ausgabe von entsprechenden Nachrichten in der Konsole.
Die Benutzer*innen geben ihre Wahl ein und diese Eingabe wird in der Variable 'choice' gespeichert.

Wenn die Benutzer*innen sich entscheiden, sich selbst zu spielen (choice = "1"),
wird der in der Variable userName gespeicherte Benutzer*innen-Name in die Variable spielName übertragen.
Eine entsprechende Nachricht wird ausgegeben, in der sie dazu aufgefordert werden,
die Fragen so ehrlich wie möglich zu beantworten.
Nach der Eingabe einer Bestätigung (Enter drücken) geht das Spiel weiter.

Wenn die Benutzer*innen einen vorgefertigten Charakter wählen (choice = "2"),
wird der erste Charakter aus der durchmischten Rollenliste ausgewählt und der Name dieses Charakters
auch in der Variable spielName gespeichert. Anschließend wird eine Nachricht ausgegeben,
in der die Benutzer*innen aufgefordert werden, sich in ihre Rolle hineinzuversetzen
und die folgenden Fragen basierend auf dieser Rolle zu beantworten.
Es folgen detaillierte Informationen über den Charakter (Name, Geschlecht,
Alter, Herkunft und Schicksal) und nach einer kurzen Pause von 3 Sekunden,
können die Benutzer*innen das Spiel mit der Eingabe einer Bestätigung (Enter drücken) fortsetzen.

Wenn eine ungültige Option gewählt wurde, wird eine entsprechende Fehlermeldung ausgegeben
und die Funktion onboarding2_de wird erneut aufgerufen,
um die Benutzer*innen erneut nach ihrer Wahl zu fragen. */
