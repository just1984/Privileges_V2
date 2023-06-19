fun onboarding() {
    intro_header()
    askForUserName()
    println()

    val anleitungIntro =
        "${GREEN.ON}Das Spiel funktioniert folgendermaßen:${GREEN.OFF} Du wirst mehr als 20 Fragen gestellt bekommen. Wenn du die Fragen mit 'ja' beantworten kannst, dann drücke 1. Wenn du mit 'nein' antworten möchtest, dann drücke 2. Bei jeder beantworteten Frage bewegen wir dich einen Schritt vorwärts oder rückwärts. Zusätzlich haben wir 5 NPCs hinzugefügt. Jeder startet in der Mitte der Fortschrittsleiste."
    println(anleitungIntro.wordWrap(100))
    println()

    val welcomeMessage =
        "${GREEN.ON}Willkommen beim Privilegien-Spiel $userName!${GREEN.OFF} Dieses Spiel ist dazu gedacht, auf gesellschaftliche Ungleichheiten und die ungleiche Verteilung von Chancen hinzuweisen. Unser Ziel ist es, Empathie gegenüber sozialen Minderheiten zu fördern, zur Selbstreflexion über deine gesellschaftliche Position anzuregen und eine Haltung der Solidarität zu fördern. Lass uns unser Verständnis herausfordern und in die komplexen Dynamiken des Privilegs eintauchen. Triggerwarnung: Themen wie sexuelle Gewalt oder Rassismus werden erwähnt."
    println(welcomeMessage.wordWrap(100))
}