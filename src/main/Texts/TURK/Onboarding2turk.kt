package Texts.TURK

import BLUE
import ORANGE
import chosenLanguage
import rollenListeDeu
import wordWrap

fun onboarding2turk() {
    val rollenZuweisung = rollenListeDeu.shuffled()
    println(chosenLanguage?.getMessage("characterChoice")?.wordWrap(100))
    print("${GREEN.ON}--> ${GREEN.OFF}")
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
        println("Adın ${randomCharacter.name}, sen bir ${randomCharacter.geschlecht} ve ${randomCharacter.alter} yaşındasın. Kökenin ${randomCharacter.herkunft}. ${randomCharacter.schicksal}".wordWrap(100))
        print(ORANGE.OFF)
        Thread.sleep(3000)
    } else {
        println(chosenLanguage?.getMessage("invalidChoice")?.wordWrap(100))
        onboarding2turk()
    }
    println()
    println("${BLUE.ON}Oyunu başlatmak için Enter'a basın${BLUE.OFF}.")
    readln()
}
