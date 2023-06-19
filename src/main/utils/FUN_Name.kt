fun askForUserName() {
    var name: String
    do {
        println("${GREEN.ON}Bitte gib deinen Namen ein:${GREEN.OFF}")
        print("${GREEN.ON}--> ${GREEN.OFF}")
        name = readln()
        if (name.length > 10) {
            println("Dein Name muss kürzer als 10 Zeichen sein.")
        }
    } while (name.length > 10)
    userName = name
    println()
}
