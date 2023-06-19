package Texts.DEU

import BLUE
import ORANGE
import chosenLanguage
import rollenListeDeu
import wordWrap

fun onboarding2deu() {
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
        println("Dein Name ist ${randomCharacter.name}, du bist ${randomCharacter.geschlecht} und ${randomCharacter.alter} Jahre alt. Deine Herkunft ist ${randomCharacter.herkunft}. ${randomCharacter.schicksal}".wordWrap(100))
        print(ORANGE.OFF)
        Thread.sleep(3000)
    } else {
        println(chosenLanguage?.getMessage("invalidChoice")?.wordWrap(100))
        onboarding2deu()
    }
    println()
    println("${BLUE.ON}Drücke Enter um das Spiel zu starten${BLUE.OFF}.")
    readln()
}
