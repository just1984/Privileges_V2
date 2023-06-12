import kotlin.random.Random
val ANSI_ORANGE = "\u001B[38;5;208m"
val ANSI_RESET = "\u001B[0m"
fun onboarding2() {
    val rollenListe = listOf(
        rollenKarte1, rollenKarte2, rollenKarte3, rollenKarte4, rollenKarte5,
        rollenKarte6, rollenKarte7, rollenKarte8, rollenKarte9, rollenKarte10,
        rollenKarte11, rollenKarte12, rollenKarte13, rollenKarte14, rollenKarte15,
        rollenKarte16, rollenKarte17, rollenKarte18, rollenKarte19, rollenKarte20,
        rollenKarte21, rollenKarte22, rollenKarte23, rollenKarte24, rollenKarte25,
        rollenKarte26, rollenKarte27, rollenKarte28, rollenKarte29, rollenKarte30
    )

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
        println()
        println("This is your role. Try to adapt to it as good as possible.")
        println()
        val randomCharacter = rollenListe[Random.nextInt(rollenListe.size)]
        println(ANSI_ORANGE + randomCharacter.wordWrap(150) + ANSI_RESET)
    } else {
        println("You have chosen an invalid option. Please try again.")
        onboarding2()
    }
}
