fun main() {
    var playAgain = "y"
    onboarding()
    while (playAgain == "y") {
        onboarding2()
        game1()
        auswertungEng()
        println()
        println("Do you like to play again? (y/n)")
        playAgain = readln()
        println()
    }
}