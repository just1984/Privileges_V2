fun languageChoice() {
    var validInput = false
    while (!validInput) {
        println("${GREEN.ON}Please choose a language:${GREEN.OFF}\n1: Deutsch\n2: English\n3: Türkçe\n4: Polski\n5: العربية")
        print("${GREEN.ON}--> ${GREEN.OFF}")
        val languageSelector = readln()
        println()
        when {
            languageSelector.startsWith("1") -> {
                validInput = true
                println("Du hast Deutsch gewählt. Das Spiel und gewählter Datensatz wird geladen...")
                chosenLanguage = Deutsch()
            }

            languageSelector.startsWith("2") -> {
                validInput = true
                println("You've selected English. The Game and selected Dataset is loading...")
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
    println()
}