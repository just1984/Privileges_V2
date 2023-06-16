fun onboarding2arab() {
    val rollenZuweisung = roleList_ar.shuffled()
    print(chosenLanguage?.getMessage("characterChoice")?.wordWrap(100))
    val choice = readln()
    if (choice == "1") {
        println()
        println(chosenLanguage?.getMessage("selfChoice")?.wordWrap(100))
    } else if (choice == "2") {
        val randomCharacter = rollenZuweisung.first()
        println()
        println(chosenLanguage?.getMessage("roleAdaption")?.wordWrap(100))
        println()
        print(ORANGE.ON)
        println("اسمك هو ${randomCharacter.name}، أنت ${randomCharacter.gender} وعمرك ${randomCharacter.age} سنة. أنت تأتي من ${randomCharacter.origin}. ${randomCharacter.fate}".wordWrap(100))
        print(ORANGE.OFF)
        Thread.sleep(3000)
    } else {
        println(chosenLanguage?.getMessage("invalidChoice")?.wordWrap(100))
        onboarding2arab()
    }
    println()
    println("${BLUE.ON}اضغط Enter لبدء اللعبة${BLUE.OFF}.")
    readln()
}
