
fun onboarding2() {
    val rollenZuweisung = rollenListe.shuffled()
    println("First off, do you want to play yourself, or do you like to choose one of 30 pre-made characters?")
    println("1. I want to play myself")
    println("2. I want to choose a pre-made character")
    val choice = readln()
    if (choice == "1") {
        println("You have chosen to play yourself.")
        println()
        println("Step 1: What is your name?")
        val name = readln()
    } else if (choice == "2") {
        val randomCharacter = rollenZuweisung.first()
        println()
        print(ORANGE.ON)
        println(randomCharacter.wordWrap(150))
        print(ORANGE.OFF)
        println()
        println("This is your role. Try to adapt to it as good as possible.")
        println(
            "Seriously.. close your eyes and try to imagine yourself in this role. ${BLUE.ON}Enter${BLUE.OFF}."
        )
    } else {
        println("You have chosen an invalid option. Please try again.")
        onboarding2()
    }
    readln()
    clearScreen100()
}
