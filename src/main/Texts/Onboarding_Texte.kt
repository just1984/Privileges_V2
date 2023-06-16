var chosenLanguage: Language? = null
fun welcomeUser() {
    val welcomeMessage = chosenLanguage?.getMessage("welcomeIntro", userName)
    if (welcomeMessage != null) {
        println(welcomeMessage.wordWrap(100))
    }
}

abstract class Language {
    abstract fun getMessage(key: String, userName: String? = null): String
}
class English : Language() {
    private val messages = mapOf(
        "wahtsthename" to "Please enter your name: ",
        "welcomeIntro" to "${GREEN.ON}Welcome to the Privilege Game %s!${GREEN.OFF} This game is designed to shed light on societal inequalities and the uneven distribution of opportunities. Our goal is to foster empathy towards social minorities, encourage self-reflection on your societal position, and stimulate a stance of solidarity. Let's challenge our understanding and dive into the complex dynamics of privilege. ${RED.ON}Triggerwarning: Topics such as sexual violence or racism will be mentioned.${RED.OFF} ${BLUE.ON}Hit Enter${BLUE.OFF}.",
        "anleitungIntro" to "${GREEN.ON}The game works as follows:${GREEN.OFF} You will be asked 20+ questions. If you can answer the questions with 'yes', then press 1. If you want to answer with 'no', then press 2. For each question answered we take you a step forward or back. Additionally we added 5 NPCs. Everyone starts in the middle of the progress bar. ${BLUE.ON}Enter${BLUE.OFF}.",
        "characterChoice" to "${GREEN.ON}CHoose your character:${GREEN.OFF} do you want to play yourself, or do you like to choose one of 20 pre-made characters?\n\n1. I want to play myself\n2. I want to choose a pre-made character",
        "selfChoice" to "You have chosen to play yourself. Try to answer the questions as honestly as possible.",
        "roleAdaption" to "This is your role. Try to adapt to it as good as possible. CLose your eyes and try to imagine yourself in this role for a second. Answer all following questions based on this role.",
        "game1fragen" to "Question {0}: {1}\n1 for Yes, 2 for No",
        "invalidChoice" to "${RED.ON}You have chosen an invalid option. Please try again.${RED.OFF}\n\n",
        )
    override fun getMessage(key: String, userName: String?): String {
        return String.format(messages[key] ?: throw IllegalArgumentException(" .. $key"), userName)
    }
}

class Deutsch : Language() {
    private val messages = mapOf(
        "welcomeIntro" to "${GREEN.ON}Willkommen beim Privilegien-Spiel %s!${GREEN.OFF} Dieses Spiel ist dazu gedacht, auf gesellschaftliche UNgleichheiten und die ungleiche Verteilung von Chancen hinzuweisen. Unser Ziel ist es, Empathie gegenüber sozialen Minderheiten zu fördern, zur Selbstreflexion über deine gesellschaftliche Position anzuregen und eine Haltung der Solidarität zu fördern. Lass uns unser Verständnis herausfordern und in die komplexen Dynamiken des Privilegs eintauchen. ${RED.ON}Triggerwarnung: Themen wie sexuelle Gewalt oder Rassismus werden erwähnt.${RED.OFF} ${BLUE.ON}Drücke Enter${BLUE.OFF}.",
        "anleitungIntro" to "${GREEN.ON}Das Spiel funktioniert folgendermaßen:${GREEN.OFF} Du wirst mehr als 20 Fragen gestellt bekommen. Wenn du die Fragen mit 'ja' beantworten kannst, dann drücke 1. Wenn du mit 'nein' antworten möchtest, dann drücke 2. Bei jeder beantworteten Frage bewegen wir dich einen Schritt vorwärts oder rückwärts. Zusätzlich haben wir 5 NPCs hinzugefügt. Jeder startet in der Mitte der Fortschrittsleiste. ${BLUE.ON}Enter drücken${BLUE.OFF}.",
        "characterChoice" to "${GREEN.ON}Wähle deinen CHarakter:${GREEN.OFF} Möchtest du dich selbst spielen, oder möchtest du einen von 20 vorgefertigten Charakteren auswählen?\n\n1. Ich möchte mich selbst spielen\n2. Ich möchte einen vorgefertigten Charakter wählen",
        "selfChoice" to "Du hast dich entschieden, dich selbst zu spielen. Versuche, die Fragen so ehrlich wie möglich zu beantworten.",
        "roleAdaption" to "Das ist deine Rolle. Versuche dich so gut wie möglich daran anzupassen. Schließe deine Augen und versuche dir für eine Sekunde vorzustellen, wie du dich in dieser Rolle fühlst. Beantworte alle folgenden Fragen basierend auf dieser Rolle.",
        "game1fragen" to "Frage {0}: {1}\n1 für Ja, 2 für Nein",
        "invalidChoice" to "${RED.ON}Du hast eine ungültige Option gewählt. Bitte versuche es erneut.${RED.OFF}\n\n",
        "wahtsthename" to "Bitte gib deinen Namen ein: ",
        )
    override fun getMessage(key: String, userName: String?): String {
        return String.format(messages[key] ?: throw IllegalArgumentException(" .. $key"), userName)
    }
}

class Polnisch : Language() {
    private val messages = mapOf(
        "welcomeIntro" to "${GREEN.ON}Witamy w grze o przywilejach %s!${GREEN.OFF} Ta gra ma na celu zwrócenie uwagi na nierówności społeczne i nierówny podział szans. Naszym celem jest zaszczepienie empatii wobec mniejszości społecznych, zachęcanie do samorefleksji na temat Twojej pozycji społecznej oraz stymulowanie postawy solidarności. Sprawdźmy nasze zrozumienie i zanurzmy się w skomplikowane dynamiki przywilejów. Ostrzeżenie: W grze poruszane będą tematy takie jak przemoc seksualna czy rasizm. ${BLUE.ON}Naciśnij Enter${BLUE.OFF}.",
        "anleitungIntro" to "${GREEN.ON}Gra działa w następujący sposób:${GREEN.OFF} Zostaniesz zapytany o 20+ pytań. Jeśli możesz odpowiedzieć na pytania twierdząco, wciśnij 1. Jeśli chcesz odpowiedzieć przecząco, wciśnij 2. Po każdym pytaniu, które odpowiesz, przeniesiemy Cię krok naprzód lub w tył. Dodatkowo dodaliśmy 5 NPC. Każdy zaczyna na środku paska postępu. ${BLUE.ON}Enter${BLUE.OFF}.",
        "characterChoice" to "${GREEN.ON}Wybierz swoją postać:${GREEN.OFF} czy chcesz grać sobą, czy wolisz wybrać jedną z 20 wcześniej przygotowanych postaci?\n\n1. Chcę grać sobą\n2. Chcę wybrać wcześniej przygotowaną postać",
        "selfChoice" to "Wybrałeś grę jako sobą. Staraj się odpowiadać na pytania tak szczery jak to tylko możliwe.",
        "roleAdaption" to "To jest twoja rola. Spróbuj dostosować się do niej jak najlepiej. Zamknij oczy i spróbuj na chwilę wyobrazić sobie siebie w tej roli. Odpowiadaj na wszystkie następne pytania na podstawie tej roli.",
        "game1fragen" to "Pytanie {0}: {1}\n1 dla Tak, 2 dla Nie",
        "invalidChoice" to "${RED.ON}Wybrałeś nieprawidłową opcję. Spróbuj ponownie.${RED.OFF}\n\n",
        "wahtsthename" to "Jak masz na imię?",
        )
    override fun getMessage(key: String, userName: String?): String {
        return String.format(messages[key] ?: throw IllegalArgumentException(" .. $key"), userName)
    }
}

class Arabisch : Language() {
        private val messages = mapOf(
            "welcomeIntro" to "${GREEN.ON}مرحبًا بك في لعبة الامتياز ! 1${GREEN.OFF} هذه اللعبة مصممة للتأكيد على عدم المساواة في المجتمع وتوزيع الفرص بشكل غير متساوي. هدفنا هو تعزيز التعاطف مع الأقليات الاجتماعية، وتشجيع الانعكاس الذاتي على موقعك في المجتمع، وتحفيز موقف التضامن. دعونا نتحدى فهمنا ونغوص في ديناميكية الامتياز المعقدة. تحذير: سيتم ذكر موضوعات مثل العنف الجنسي أو العنصرية. ${BLUE.ON}اضغط Enter${BLUE.OFF}.",
            "anleitungIntro" to "${GREEN.ON}تعمل اللعبة على النحو التالي:${GREEN.OFF} سيتم طرح أكثر من 20 سؤال عليك. إذا كنت تستطيع الإجابة على الأسئلة بـ 'نعم'، فاضغط على 1. إذا كنت تريد الإجابة بـ 'لا'، فاضغط على 2. لكل سؤال تجيب عليه، سنأخذك خطوة للأمام أو للخلف. بالإضافة إلى ذلك، أضفنا 5 شخصيات غير لاعبة. يبدأ الجميع في منتصف شريط التقدم. ${BLUE.ON}اضغط Enter${BLUE.OFF}.",
            "characterChoice" to "${GREEN.ON}اختر شخصيتك:${GREEN.OFF} هل تريد أن تلعب بنفسك، أم ترغب في اختيار واحدة من 20 شخصية معدة مسبقًا؟\n\n1. أريد أن ألعب بنفسي\n2. أريد اختيار شخصية معدة مسبقًا",
            "selfChoice" to "لقد اخترت أن تلعب بنفسك. حاول الإجابة على الأسئلة بأمانة قدر الإمكان.",
            "roleAdaption" to "هذا هو دورك. حاول التكيف معه بقدر ما تستطيع. أغلق عينيك وحاول تخيل نفسك في هذا الدور للحظة. أجب على كل الأسئلة التالية استنادًا إلى هذا الدور.",
            "game1fragen" to "السؤال {0}: {1}\n1 للنعم، 2 لا",
            "invalidChoice" to "${RED.ON}لقد اخترت خيارًا غير صالح. يرجى المحاولة مرة أخرى.${RED.OFF}\n\n",
            "wahtsthename" to "ما اسمك؟",
            )
    override fun getMessage(key: String, userName: String?): String {
        return String.format(messages[key] ?: throw IllegalArgumentException(" .. $key"), userName)
    }
    }

    class Tuerkisch : Language() {
        private val messages = mapOf(
            "welcomeIntro" to "${GREEN.ON}Ayrıcalık Oyununa Hoş Geldiniz %s!${GREEN.OFF} Bu oyun, toplumsal eşitsizliklere ve fırsatların eşit dağıtılmamasına ışık tutmak için tasarlanmıştır. Amacımız, sosyal azınlıklara karşı empatiyi teşvik etmek, toplumdaki konumunuz üzerinde kendi kendinize düşünmeyi teşvik etmek ve dayanışma duruşunu teşvik etmektir. Anlayışımızı zorlayalım ve ayrıcalığın karmaşık dinamiklerine dalmaya çalışalım. Tetikleyici Uyarı: Cinsel şiddet veya ırkçılık gibi konular bahsedilecektir. ${BLUE.ON}Enter'a basın${BLUE.OFF}.",
            "anleitungIntro" to "${GREEN.ON}Oyun şu şekilde işler:${GREEN.OFF} Size 20+ soru sorulacak. Soruları 'evet' ile yanıtlayabiliyorsanız, 1'e basın. 'Hayır' ile yanıtlamak isterseniz, 2'ye basın. Her soru yanıtlandığında sizi bir adım ileri veya geri alırız. Ek olarak 5 NPC ekledik. Herkes ilerleme çubuğunun ortasından başlar. ${BLUE.ON}Enter'a basın${BLUE.OFF}.",
            "characterChoice" to "${GREEN.ON}Karakterinizi seçin:${GREEN.OFF} Kendinizi mi oynamak istersiniz yoksa 20 önceden hazırlanmış karakterden birini mi seçmek istersiniz?\n\n1. Kendimi oynamak istiyorum\n2. Önceden hazırlanmış bir karakter seçmek istiyorum",
            "selfChoice" to "Kendinizi oynamayı seçtiniz. Soruları mümkün olduğunca dürüst bir şekilde yanıtlayın.",
            "roleAdaption" to "Bu sizin rolünüz. Mümkün olduğunca iyi adapte olmaya çalışın. Gözlerinizi kapatın ve bir saniyeliğine bu rolde kendinizi hayal etmeye çalışın. Tüm sonraki soruları bu role dayanarak yanıtlayın.",
            "game1fragen" to "Soru {0}: {1}\nEvet için 1, Hayır için 2",
            "invalidChoice" to "${RED.ON}Geçersiz bir seçenek seçtiniz. Lütfen tekrar deneyin.${RED.OFF}\n\n",
            "wahtsthename" to "Adınız nedir?",
            )
        override fun getMessage(key: String, userName: String?): String {
            return String.format(messages[key] ?: throw IllegalArgumentException(" .. $key"), userName)
        }
    }