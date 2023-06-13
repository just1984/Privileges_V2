fun onboarding2() {
    val rollenZuweisung = rollenListe.shuffled()
    println(chosenLanguage?.getMessage("characterChoice"))
    val choice = readln()
    if (choice == "1") {
        println(chosenLanguage?.getMessage("selfChoice"))
        val name = readln()
    } else if (choice == "2") {
        val randomCharacter = rollenZuweisung.first()
        println()
        print(ORANGE.ON)
        println(randomCharacter.wordWrap(150))
        print(ORANGE.OFF)
        println()
        println(chosenLanguage?.getMessage("roleAdaption"))
    } else {
        println(chosenLanguage?.getMessage("invalidChoice"))
        onboarding2()
    }
    readln()
    clearScreen100()
}
