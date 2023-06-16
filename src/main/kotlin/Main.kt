fun main() {
    var playAgain = "y"
    onboarding()
    while (playAgain == "y") {
        when (chosenLanguage) {
            is Deutsch -> {
                onboarding2deu()
                game1deu()
                auswertungDEU()
            }
            is English -> {
                onboarding2eng()
                game1eng()
                auswertungEng()
            }
            is Polnisch -> {
                onboarding2pol()
                game1pol()
                auswertungPol()
            }
            is Tuerkisch -> {
                onboarding2turk()
                game1tur()
                auswertungTurk()
            }
            is Arabisch -> {
                onboarding2arab()
                game1arb()
                auswertungArab()
            }
        }
        println()
        println("Do you like to play again? (y/n)")
        playAgain = readln()
        println()
    }
}