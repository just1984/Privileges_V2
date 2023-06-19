fun onboarding() {

    clearScreen100()

    print(ORANGE.ON)

    println("8888888b.  8888888b.  8888888 888     888 8888888 888      8888888888  .d8888b.   8888888888  .d8888b. ")
    println("888   Y88b 888   Y88b   888   888     888   888   888      888        d88P  Y88b  888        d88P  Y88b")
    println("888    888 888    888   888   888     888   888   888      888        888    888  888        Y88b.     ")
    println("888   d88P 888   d88P   888   Y88b   d88P   888   888      8888888    888         8888888      Y888b.  ")
    println("8888888P   8888888P     888    Y88b d88P    888   888      888        888  88888  888             Y88b.")
    println("888        888 T88b     888     Y88o88P     888   888      888        888    888  888               888")
    println("888        888  T88b    888      Y888P      888   888      888        Y88b  d88P  888        Y88b  d88P")
    println("888        888   T88b 8888888     Y8P     8888888 88888888 8888888888   Y8888P88  8888888888   Y8888P  ")
    println()

    val textOrwell = "“All are equal, but some are more equal than others.“\n- George Orwell, Animal Farm\n\n"
    for (char in textOrwell) {
        print(char)
        Thread.sleep(30)
    }

    print(ORANGE.OFF)

    languageChoice()
    askForUserName()
    welcomeUser()
    println()
    val anleitungIntro = chosenLanguage?.getMessage("anleitungIntro")
    if (anleitungIntro != null) {
        println(anleitungIntro.wordWrap(100))
    }
    println()

}