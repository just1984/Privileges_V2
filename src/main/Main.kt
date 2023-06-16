import Texts.ARAB.onboarding2arab
import Texts.DEU.onboarding2deu
import Texts.ENG.onboarding2eng
import Texts.POL.onboarding2pol
import Texts.TURK.onboarding2turk

fun main() {
    var playAgain = "y"
    var playAgainDeutsch = "j"
    var playAgainPolnisch = "t"
    var playAgainTuerkisch = "e"
    var playAgainArabisch = "n"

    onboarding()

    when (chosenLanguage) {
        is Deutsch -> {
            while (playAgainDeutsch == "j") {
                onboarding2deu()
                game1deu()
                auswertungDEU()
                println()
                println("Möchten Sie nochmal spielen? (j/n)")
                playAgainDeutsch = readln()
                println()
            }
        }
        is English -> {
            while (playAgain == "y") {
                onboarding2eng()
                game1eng()
                auswertungEng()
                println()
                println("Do you like to play again? (y/n)")
                playAgain = readln()
                println()
            }
        }
        is Polnisch -> {
            while (playAgainPolnisch == "t") {
                onboarding2pol()
                game1pol()
                auswertungPol()
                println()
                println("Czy chcesz zagrać jeszcze raz? (t/n)")
                playAgainPolnisch = readln()
                println()
            }
        }
        is Tuerkisch -> {
            while (playAgainTuerkisch == "e") {
                onboarding2turk()
                game1tur()
                auswertungTurk()
                println()
                println("Tekrar oynamak ister misiniz? (e/h)")
                playAgainTuerkisch = readln()
                println()
            }
        }
        is Arabisch -> {
            while (playAgainArabisch == "n") {
                onboarding2arab()
                game1arb()
                auswertungArab()
                println()
                println("Hal tureed al-la'ib marra ukhra? (n/la)")
                playAgainArabisch = readln()
                println()
            }
        }
    }
}
