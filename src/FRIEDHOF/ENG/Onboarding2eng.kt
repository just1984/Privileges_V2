package Texts.ENG

import BLUE
import ORANGE
import chosenLanguage
import roleListEng
import wordWrap

fun onboarding2eng() {
    val rollenZuweisung = roleListEng.shuffled()
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
        println("Your name is ${randomCharacter.name}, ${randomCharacter.gender} and you are ${randomCharacter.age} years old. You are from ${randomCharacter.origin}. ${randomCharacter.fate}".wordWrap(100))
        print(ORANGE.OFF)
        Thread.sleep(3000)
    } else {
        println(chosenLanguage?.getMessage("invalidChoice")?.wordWrap(100))
        onboarding2eng()
    }
    println()
    println("${BLUE.ON}Hit Enter to start the Game${BLUE.OFF}.")
    readln()
}
