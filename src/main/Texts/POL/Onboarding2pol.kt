package Texts.POL

import BLUE
import ORANGE
import chosenLanguage
import roleList_pol
import wordWrap

fun onboarding2pol() {
    val rollenZuweisung = roleList_pol.shuffled()
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
        println("Twoje imię to ${randomCharacter.name}, jesteś ${randomCharacter.gender} i masz ${randomCharacter.age} lat. Pochodzisz z ${randomCharacter.origin}. ${randomCharacter.fate}".wordWrap(100))
        print(ORANGE.OFF)
        Thread.sleep(3000)
    } else {
        println(chosenLanguage?.getMessage("invalidChoice")?.wordWrap(100))
        onboarding2pol()
    }
    println()
    println("${BLUE.ON}Naciśnij Enter, aby rozpocząć grę${BLUE.OFF}.")
    readln()
}
