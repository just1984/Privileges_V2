var chosenLanguage: Language? = null
abstract class Language {
    abstract fun getMessage(key: String): String
}
class English : Language() {
    private val messages = mapOf(
        "welcomeIntro" to "${GREEN.ON}Welcome to the Privilege Game!${GREEN.OFF} This game is designed to shed light on societal inequalities and the uneven distribution of opportunities. Our goal is to foster empathy towards social minorities, encourage self-reflection on your societal position, and stimulate a stance of solidarity. Let's challenge our understanding and dive into the complex dynamics of privilege. ${BLUE.ON}Hit Enter${BLUE.OFF}.",
        "anleitungIntro" to "${GREEN.ON}The game works as follows:${GREEN.OFF} You will be asked 20+ questions. If you can answer the questions with 'yes', then press 1. If you want to answer with 'no', then press 2. For each question answered we take you a step forward or back. Additionally we added 5 NPCs. Everyone starts in the middle of the progress bar. ${BLUE.ON}Enter${BLUE.OFF}.",
        "characterChoice" to "${GREEN.ON}Choose your character:${GREEN.OFF} do you want to play yourself, or do you like to choose one of 20 pre-made characters?\n\n1. I want to play myself\n2. I want to choose a pre-made character",
        "selfChoice" to "You have chosen to play yourself. Try to answer the questions as honestly as possible.",
        "roleAdaption" to "This is your role. Try to adapt to it as good as possible. Close your eyes and try to imagine yourself in this role for a second. Answer all following questions based on this role.",
        "game1fragen" to "Question {0}: {1}\n1 for Yes, 2 for No",
        "invalidChoice" to "${RED.ON}You have chosen an invalid option. Please try again.${RED.OFF}\n\n",
        "auswertung1" to ""
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
