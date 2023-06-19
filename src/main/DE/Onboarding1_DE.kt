fun onboarding() {
    intro_header()
    askForUserName()

    val welcomeMessage =
        "${GREEN.ON}Willkommen beim Privilegien-Spiel $userName!${GREEN.OFF} Dieses Spiel ist dazu gedacht, auf gesellschaftliche Ungleichheiten und die ungleiche Verteilung von Chancen hinzuweisen. Unser Ziel ist es, Empathie gegenüber sozialen Minderheiten zu fördern, zur Selbstreflexion über deine gesellschaftliche Position anzuregen und eine Haltung der Solidarität zu fördern. Lass uns unser Verständnis herausfordern und in die komplexen Dynamiken des Privilegs eintauchen. Triggerwarnung: Themen wie sexuelle Gewalt oder Rassismus werden erwähnt."
    println(welcomeMessage.wordWrap(100))
    println()
    val anleitungIntro =
        "${GREEN.ON}Das Spiel funktioniert folgendermaßen:${GREEN.OFF} Du wirst mehr als 20 Fragen gestellt bekommen. Wenn du die Fragen mit 'ja' beantworten kannst, dann drücke 1. Wenn du mit 'nein' antworten möchtest, dann drücke 2. Bei jeder beantworteten Frage bewegen wir dich einen Schritt vorwärts oder rückwärts. Zusätzlich haben wir 5 Nicht-Spieler-Charaktere hinzugefügt. Alle starten in der Mitte der Fortschrittsleiste."
    println(anleitungIntro.wordWrap(100))
}

/* In meiner Funktion onboarding beginne ich mit der Spiel-Einführung, indem ich die Funktion intro_header aufrufe.
Diese lädt im Grunde nur ein Titelbild. Im Anschluss frage ich nach dem Benutzer*innenname,
indem ich die Funktion askForUserName aufrufe. Nun bereite ich die Begrüßungsnachricht vor,
die das Privilegien-Spiel vorstellt und die Benutzerin dazu auffordert,
sich mit gesellschaftlichen Ungleichheiten auseinanderzusetzen. Diese Nachricht drucke ich in der Konsole aus. Der
zuvor eingegebene Name der Benutzer*in wird in der Nachricht verwendet.

Um zu erläutern, wie das Spiel funktioniert, erstelle ich eine weitere Nachricht, die Anleitung zum Spiel.
Sie erklärt der Benutzer*in, wie sie auf die gestellten Fragen antworten kann und was diese Antworten im Spielkontext bedeuten.
Auch diese Nachricht wird in der Konsole ausgegeben. */