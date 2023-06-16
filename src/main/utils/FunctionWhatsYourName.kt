fun askForUserName() {
    var name: String
    do {
        println(chosenLanguage?.getMessage("wahtsthename"))
        name = readln()
        if (name.length > 10) {
            println("Name must be shorter than 10 characters.")
        }
    } while (name.length > 10)
    userName = name
    println()
}
