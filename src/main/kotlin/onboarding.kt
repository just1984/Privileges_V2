fun onboarding() {
    clearScreen100()
    var validInput = false
    while (!validInput) {
        println("Please choose a language:\n1: Deutsch\n2: English\n3: Türkçe\n4: Polski\n5: العربية")
        val languageSelector = readln()
        println()
        when {
            languageSelector.startsWith("1") -> {
                validInput = true
                println("Du hast Deutsch gewählt. Das Spiel wird geladen...")
                chosenLanguage = Deutsch()
            }

            languageSelector.startsWith("2") -> {
                validInput = true
                println("You've selected English. The Game is loading...")
                chosenLanguage = English()
            }

            languageSelector.startsWith("3") -> {
                validInput = true
                println("Türkçe seçtiniz. Oyun yükleniyor...")
                chosenLanguage = Tuerkisch()
            }

            languageSelector.startsWith("4") -> {
                validInput = true
                println("Wybrałeś Polski. Gra się ładuje...")
                chosenLanguage = Polnisch()
            }

            languageSelector.startsWith("5") -> {
                validInput = true
                println("لقد اخترت العربية. اللعبة تحمل...")
                chosenLanguage = Arabisch()
            }

            else -> {
                print(RED.ON)
                println("Invalid selection. Please try again. Enter 1: Deutsch 2: English 3: Türkçe 4: Polski 5: العربية")
                println()
                print(RED.OFF)
            }
        }
    }
Thread.sleep(1500)
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
        Thread.sleep(50)
    }
    Thread.sleep(1000)
    print(ORANGE.OFF)
    //  clearScreen100()
    val welcomeIntro = chosenLanguage?.getMessage("welcomeIntro")
    if (welcomeIntro != null) {
        println(welcomeIntro.wordWrap(150))
    }
    readln()
    //println("The game works as follows:\nAt first: you choose yourself, or a charcter to play with.")
    val anleitungIntro = chosenLanguage?.getMessage("anleitungIntro")
    if (anleitungIntro != null) {
        println(anleitungIntro.wordWrap(150))
    }
    readln()
}