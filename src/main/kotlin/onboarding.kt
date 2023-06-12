fun onboarding() {
    clearScreen100()
    var validInput = false
    while (!validInput) {
        println("Please choose a language:\n1: Deutsch\n2: English")
        val languageSelector = readln() ?: ""
        println()
        when {
            languageSelector.startsWith("1") -> {
                validInput = true
                println("Du hast Deutsch gewählt. Das Spiel wird geladen...")
            }
            languageSelector.startsWith("2") -> {
                validInput = true
                println("You've selected English. The Game is loading...")
            }
            else -> {
                println("Invalid selection. Please try again. Enter '1' for Deutsch or '2' for English.")
            }
        }
    }
    Thread.sleep(1500)
    clearScreen100()
    val ANSI_ORANGE = "\u001B[38;5;208m"
    val ANSI_RESET = "\u001B[0m"
    println(ANSI_ORANGE)
    println("8888888b.  8888888b.  8888888 888     888 8888888 888      8888888888  .d8888b.   8888888888  .d8888b. ")
    println("888   Y88b 888   Y88b   888   888     888   888   888      888        d88P  Y88b  888        d88P  Y88b")
    println("888    888 888    888   888   888     888   888   888      888        888    888  888        Y88b.     ")
    println("888   d88P 888   d88P   888   Y88b   d88P   888   888      8888888    888         8888888      Y888b.  ")
    println("8888888P   8888888P     888    Y88b d88P    888   888      888        888  88888  888             Y88b.")
    println("888        888 T88b     888     Y88o88P     888   888      888        888    888  888               888")
    println("888        888  T88b    888      Y888P      888   888      888        Y88b  d88P  888        Y88b  d88P")
    println("888        888   T88b 8888888     Y8P     8888888 88888888 8888888888   Y8888P88  8888888888   Y8888P  ")
    /*    println()
        println()
        println(" .d8888b.         d8888  888b     d888  8888888888 ")
        println("d88P  Y88b       d88888  8888b   d8888  888        ")
        println("888    888      d88P888  88888b.d88888  888        ")
        println("888            d88P 888  888Y88888P888  8888888    ")
        println("888  88888    d88P  888  888 Y888P 888  888        ")
        println("888    888   d88P   888  888  Y8P  888  888        ")
        println("Y88b  d88P  d8888888888  888       888  888        ")
        println(" Y8888P88  d88P     888  888       888  8888888888 ")*/
    println()
    val textOrwell = "“All are equal, but some are more equal than others.“ - George Orwell, Animal Farm"
    for (char in textOrwell) {
        print(char)
        Thread.sleep(50)
    }
    Thread.sleep(1000)
    println()
    println(ANSI_RESET)
    //  clearScreen100()
    val text = "Welcome to the Privilege Game! This game is designed to shed light on societal inequalities and the uneven distribution of opportunities. You'll gain insights into different life paths around the world and explore the social prerequisites for good jobs, education, and secure living conditions. Our goal is to foster empathy towards social minorities, encourage self-reflection on your societal position, and stimulate a stance of solidarity. Let's challenge our understanding and dive into the complex dynamics of privilege. Let's start the game! Hit Enter!"
    println(text.wordWrap(150))
    readln()
}