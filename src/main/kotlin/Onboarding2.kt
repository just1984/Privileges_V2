fun onboarding2() {
    val rollenZuweisung = rollenListe.shuffled()
    println(chosenLanguage?.getMessage("characterChoice")?.wordWrap(100))
    val choice = readln()
    if (choice == "1") {
        println(chosenLanguage?.getMessage("selfChoice")?.wordWrap(100))
        val name = readln()
    } else if (choice == "2") {
        val randomCharacter = rollenZuweisung.first()
        println()
        println(chosenLanguage?.getMessage("roleAdaption")?.wordWrap(100))
        println()
        print(ORANGE.ON)
        println(randomCharacter.wordWrap(100))
        print(ORANGE.OFF)
    } else {
        println(chosenLanguage?.getMessage("invalidChoice")?.wordWrap(100))
        onboarding2()
    }
    println()
    Thread.sleep(3000)
    println("${BLUE.ON}Hit Enter to start the Game${BLUE.OFF}.")
    readln()
}
