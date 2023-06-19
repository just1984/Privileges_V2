fun onboarding2_de() {
    val rollenZuweisung = rollenListeDeu.shuffled()
    println()
    val characterChoiceMessage =
        "${GREEN.ON}Wähle deinen Charakter:${GREEN.OFF} Möchtest du dich selbst spielen, oder möchtest du einen von 20 vorgefertigten Charakteren auswählen?"
    val characterChoicemessage2 = "1. Ich möchte mich selbst spielen\n2. Ich möchte einen vorgefertigten Charakter wählen"
    println(characterChoiceMessage.wordWrap(100))
    println()
    println(characterChoicemessage2.wordWrap(100))
    print("${GREEN.ON}--> ${GREEN.OFF}")

    val choice = readln()
    if (choice == "1") {
        println()
        val selfChoiceMessage =
            "Du hast dich entschieden, dich selbst zu spielen. Versuche, die Fragen so ehrlich wie möglich zu beantworten. ${BLUE.ON}Drücke Enter um das Spiel zu starten${BLUE.OFF}."
        println(selfChoiceMessage.wordWrap(100))
    } else if (choice == "2") {
        val randomCharacter = rollenZuweisung.first()
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
