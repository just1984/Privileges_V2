fun main() {
    var nochEinmal_DE = "j"
    onboarding()
    while (nochEinmal_DE == "j") {
        onboarding2_de()
        clearScreen100()
        game1deu()
        evaluation_de()
        println("Möchtest du noch einmal spielen? (j/n)")
        nochEinmal_DE = readln()
    }
}
