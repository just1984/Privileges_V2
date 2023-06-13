var chosenLanguage: Language? = null
abstract class Language {
    abstract fun getMessage(key: String): String
}
class English : Language() {
    private val messages = mapOf(
        "welcomeIntro" to "Welcome to the Privilege Game! This game is designed to shed light on societal inequalities and the uneven distribution of opportunities. You'll gain insights into different life paths around the world and explore the social prerequisites for good jobs, education, and secure living conditions. Our goal is to foster empathy towards social minorities, encourage self-reflection on your societal position, and stimulate a stance of solidarity. Let's challenge our understanding and dive into the complex dynamics of privilege. ${BLUE.ON}Hit Enter${BLUE.OFF}.",
        "anleitungIntro" to "The game works as follows: At first: you choose yourself, or a charcter to play with. Secondly: you will be asked 20 questions. If you can answer the questions with 'yes', then press 1. If you want to answer with 'no', then press 2. For each question answered with 'yes', we take you one step forward - for one answered with 'no', we take you a step back. ${BLUE.ON}Enter${BLUE.OFF}.",
        "characterChoice" to "First off, do you want to play yourself, or do you like to choose one of 30 pre-made characters?\n1. I want to play myself\n2. I want to choose a pre-made character",
        "selfChoice" to "You have chosen to play yourself.",
        "roleAdaption" to "This is your role. Try to adapt to it as good as possible.\nSeriously.. close your eyes and try to imagine yourself in this role. ${BLUE.ON}Enter${BLUE.OFF}.",
        "game1fragen" to "Question {0}: {1}\n1 for Yes, 2 for No",
        "invalidChoice" to "${RED.ON}You have chosen an invalid option. Please try again.${RED.OFF}\n\n"
    )
    override fun getMessage(key: String): String {
        return messages[key] ?: throw IllegalArgumentException("Key not found: $key")
    }
}

class Deutsch : Language() {
    private val messages = mapOf(
        "welcomeIntro" to "TEST",
        "anleitungIntro" to "TEST2",
        "invalidChoice" to "${RED.ON}Sie haben eine ungültige Option gewählt. Bitte versuchen Sie es erneut.${RED.OFF}\n\n"

    )

    override fun getMessage(key: String): String {
        return messages[key] ?: throw IllegalArgumentException("Der Key wurde nicht gefunden: $key")
    }
}

class Polnisch : Language() {
    private val messages = mapOf(
        "welcomeIntro" to "",
        "anleitungIntro" to "",
        "invalidChoice" to "${RED.ON}Wybrałeś nieprawidłową opcję. Spróbuj ponownie.${RED.OFF}\n\n"

    )

    override fun getMessage(key: String): String {
        return messages[key] ?: throw IllegalArgumentException("Klucz nie znaleziony: $key")
    }
}

class Arabisch : Language() {
    private val messages = mapOf(
        "welcomeIntro" to "",
        "anleitungIntro" to "",
        "invalidChoice" to "${RED.ON}لقد اخترت خيارًا غير صالح. يرجى المحاولة مرة أخرى.${RED.OFF}\n\n"

    )

    override fun getMessage(key: String): String {
        return messages[key] ?: throw IllegalArgumentException("لم يتم العثور على المفتاح: $key")
    }
}

class Tuerkisch : Language() {
        private val messages = mapOf(
            "welcomeIntro" to "Ayrıcalık Oyununa hoş geldiniz! Bu oyun, toplumsal eşitsizliklere ve fırsatların eşit olmayan dağılımına ışık tutmak için tasarlanmıştır. Dünyanın dört bir yanındaki farklı yaşam yollarına içgörü kazanacak, iyi işler, eğitim ve güvenli yaşam koşulları için sosyal önkoşulları keşfedeceksiniz. Amacımız, sosyal azınlıklara karşı empati geliştirmek, toplumsal konumunuz üzerinde kendi kendine düşünmeyi teşvik etmek ve dayanışma duruşunu teşvik etmektir. Anlayışımızı sorgulayalım ve ayrıcalığın karmaşık dinamiklerine dalalım. ${BLUE.ON}Enter'a basın${BLUE.OFF}.",
            "anleitungIntro" to "Oyun şu şekilde işler: İlk olarak: kendinizi veya oynamak için bir karakter seçin. İkincisi: size 20 soru sorulacak. Soruları 'evet' ile yanıtlayabilirseniz, 1'e basın. 'Hayır' ile yanıtlamak isterseniz, 2'ye basın. 'Evet' ile yanıtlanan her soru için sizi bir adım ileri alırız - 'hayır' ile yanıtlanan biri için sizi bir adım geri alırız. ${BLUE.ON}Enter'a basın${BLUE.OFF}.",
            "characterChoice" to "Öncelikle, kendinizi mi oynamak istersiniz, yoksa 30 önceden hazırlanmış karakterden birini mi seçmek istersiniz?\n1. Kendimi oynamak istiyorum\n2. Önceden hazırlanmış bir karakter seçmek istiyorum",
            "selfChoice" to "Kendinizi oynamayı seçtiniz.",
            "roleAdaption" to "Bu sizin rolünüz. Mümkün olduğunca iyi uyarlanmaya çalışın.\nCiddiyim.. gözlerinizi kapatın ve bu rolde kendinizi hayal etmeye çalışın. ${BLUE.ON}Enter'a basın${BLUE.OFF}.",
            "game1fragen" to "Soru {0}: {1}\nEvet için 1, Hayır için 2",
            "invalidChoice" to "${RED.ON}Geçersiz bir seçenek seçtiniz. Lütfen tekrar deneyin.${RED.OFF}\n\n"
        )
        override fun getMessage(key: String): String {
            return messages[key] ?: throw IllegalArgumentException("Key not found: $key")
        }
    }


// Hier ist der Code der Die Fragen lädt und den Progress-Balken steuert:

fun game1deu() {
    var position = 0
    val gemischteFragen = fragen.shuffled()
    for (i in gemischteFragen.indices) {
        var answer: String
        do {
            print(CYAN.ON)
            println("Frage ${i + 1}: ${fragen[i]}\n1 für Ja, 2 für Nein")
            print(CYAN.OFF)
            answer = readln()
            if (answer != "1" && answer != "2") {
                print(RED.ON)
                println("Ungültige Eingabe, bitte gib 1 für Ja oder 2 für Nein ein.")
                print(RED.OFF)
                println()
            }
        } while (answer != "1" && answer != "2")

        if (answer == "1") position += 10 else position -= 10
        printProgressBar(position, fragen.size * 10)
        println()
    }
    println("")
}


fun game1eng() {
    var position = 0
    val gemischteFragen = fragenEng.shuffled()
    for (i in gemischteFragen.indices) {
        var answer: String
        do {
            print(CYAN.ON)
            println("Question ${i + 1}: ${fragenEng[i]}\n1 for Yes, 2 for No")
            print(CYAN.OFF)
            answer = readln()
            if (answer != "1" && answer != "2") {
                print(RED.ON)
                println("Invalid input, please enter 1 for Yes or 2 for No.")
                print(RED.OFF)
                println()
            }
        } while (answer != "1" && answer != "2")

        if (answer == "1") position += 10 else position -= 10
        printProgressBar(position, fragenEng.size * 10)
        println()
    }
    println("")
}
fun game1tur() {
    var position = 0
    val gemischteFragen = fragenTur.shuffled()
    for (i in gemischteFragen.indices) {
        var answer: String
        do {
            print(CYAN.ON)
            println("Soru ${i + 1}: ${fragenTur[i]}\n1 için Evet, 2 için Hayır")
            print(CYAN.OFF)
            answer = readln()
            if (answer != "1" && answer != "2") {
                print(RED.ON)
                println("Geçersiz giriş, lütfen Evet için 1 veya Hayır için 2 girin.")
                print(RED.OFF)
                println()
            }
        } while (answer != "1" && answer != "2")

        if (answer == "1") position += 10 else position -= 10
        printProgressBar(position, fragenTur.size * 10)
        println()
    }
    println("")
}

fun game1pol() {
    var position = 0
    val gemischteFragen = fragenPol.shuffled()
    for (i in gemischteFragen.indices) {
        var answer: String
        do {
            print(CYAN.ON)
            println("Pytanie ${i + 1}: ${fragenPol[i]}\n1 dla Tak, 2 dla Nie")
            print(CYAN.OFF)
            answer = readln()
            if (answer != "1" && answer != "2") {
                print(RED.ON)
                println("Nieprawidłowe dane wejściowe, wprowadź 1 dla Tak lub 2 dla Nie.")
                print(RED.OFF)
                println()
            }
        } while (answer != "1" && answer != "2")

        if (answer == "1") position += 10 else position -= 10
        printProgressBar(position, fragenPol.size * 10)
        println()
    }
    println("")
}

fun game1arb() {
    var position = 0
    val gemischteFragen = fragenArb.shuffled()
    for (i in gemischteFragen.indices) {
        var answer: String
        do {
            print(CYAN.ON)
            println("السؤال ${i + 1}: ${fragenArb[i]}\n1 للنعم، 2 لللا")
            print(CYAN.OFF)
            answer = readln()
            if (answer != "1" && answer != "2") {
                print(RED.ON)
                println("إدخال غير صالح، يرجى إدخال 1 للنعم أو 2 لللا.")
                print(RED.OFF)
                println()
            }
        } while (answer != "1" && answer != "2")

        if (answer == "1") position += 10 else position -= 10
        printProgressBar(position, fragenArb.size * 10)
        println()
    }
    println("")
}

