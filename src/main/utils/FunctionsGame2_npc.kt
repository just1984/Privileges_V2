import kotlin.random.Random

val goodNames = listOf("Matthias", "Rafael", "Kai", "Dennis", "Jim", "Felix", "Klaas", "Piet", "Henning", "Tamino", "Findus", "Niklas", "Emil", "Danny", "Sam", "Patrick", "Marten", "Julius", "Bryan", "Noel", "Jay", "Pascal", "Christian")
val badNames = listOf("Aydan", "Serafina", "Peggy", "Ayşegül", "Beyzanur", "Fatima", "Çiğdem", "Gökhan", "Mariusz", "Cindy", "Emily", "Marcél", "Sergej", "Mohammed", "Emre", "Dimitrios", "Johannes", "Ali", "Malek")

val mehrPrivilegien = listOf(-10, 10, 10, 10) // Für die guten PCs: 3 Mal "ja" (+10), 1 Mal "nein" (-10)
val wenigerPrivilegien = listOf(-10, -10, -10, 10) // Für die schlechten PCs: 3 Mal "nein" (-10), 1 Mal "ja" (+10)

val pcs = mutableListOf<Pair<String, List<Int>>>().apply {
    addAll(goodNames.shuffled().take(2).map { Pair(it, mehrPrivilegien) }) // Füge 2 zufällige männliche und deutsche Namen hinzu und verknüpfe sie mit "mehrPrivilegien"
    addAll(badNames.shuffled().take(3).map { Pair(it, wenigerPrivilegien) }) // Füge 3 zufällige weibliche und ausländische Namen hinzu und verknüpfe sie mit "wenigerPrivilegien"
}

val additionalPositions = MutableList(5) { fragenFaktenDEU.size * 10 } // Initialisiere die Position für jeden zusätzlichen Balken

fun updateAdditionalProgressBars() {
    for (i in additionalPositions.indices) {
        val movement = pcs[i].second[Random.nextInt(pcs[i].second.size)] // Wähle eine zufällige Bewegung basierend auf der Bewegungsliste des PCs
        additionalPositions[i] += movement // Aktualisiere die Position des Balkens
    }
}
fun printAdditionalProgressBars() {
    val colors = listOf(ORANGE.ON, GREEN.ON, RED.ON, BLUE.ON, YELLOW.ON)
    pcs.forEachIndexed { index, pc -> // Ersetze "pcNames" durch "pcs", um auf die Namen in den Paaren zuzugreifen
        printProgressBar(additionalPositions[index], fragenFaktenDEU.size * 20, colors[index], pc.first) // Benutze "pc.first" anstelle von "pcNames[index]"
    }
}
