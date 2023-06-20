import kotlin.random.Random

val goodNames = listOf("Matthias", "Boris", "Rafael", "Kai", "Dennis", "Jim", "Felix", "Klaas", "Piet", "Henning", "Tamino", "Findus", "Niklas", "Emil", "Danny", "Sam", "Patrick", "Marten", "Julius", "Bryan", "Noel", "Jay", "Pascal", "Christian")
val badNames = listOf("Aydan", "Serafina", "Peggy", "Ayşegül", "Beyzanur", "Fatima", "Çiğdem", "Gökhan", "Mariusz", "Cindy", "Emily", "Marcél", "Sergej", "Mohammed", "Emre", "Dimitrios", "Ali", "Malek")

val mehrPrivilegien = listOf(-10, 10, 10, 10)
val wenigerPrivilegien = listOf(-10, -10, -10, 10)

val pcs = mutableListOf<Pair<String, List<Int>>>().apply {
    addAll(goodNames.shuffled().take(2).map { Pair(it, mehrPrivilegien) })
    addAll(badNames.shuffled().take(3).map { Pair(it, wenigerPrivilegien) })
}

val additionalPositions = MutableList(5) { fragenFaktenDEU.size * 10 }

fun updateAdditionalProgressBars() {
    for (i in additionalPositions.indices) {
        val movement = pcs[i].second[Random.nextInt(pcs[i].second.size)]
        additionalPositions[i] += movement
    }
}
fun printAdditionalProgressBars() {
    val colors = listOf(ORANGE.ON, GREEN.ON, RED.ON, BLUE.ON, YELLOW.ON)
    pcs.forEachIndexed { index, pc ->
        printProgressBar(additionalPositions[index], fragenFaktenDEU.size * 20, colors[index], pc.first)
    }
}

/* Der obige Code implementiert zusätzliche Fortschrittsleisten,
die die Bewegung anderer Nichtspieler-Charaktere im Spiel simulieren.

Es gibt zwei Listen von Namen: goodNames und badNames.
Diese repräsentieren Gruppen mit mehr und weniger Privilegien.

Dann gibt es die Listen mehrPrivilegien und wenigerPrivilegien.
Diese repräsentieren die Fortschrittsbewegungen der guten und schlechten Charaktere.

Die pcs-Liste ist eine Liste von Paaren,
bei denen das erste Element ein Charaktername und das zweite Element eine Liste von möglichen Bewegungen ist.
Es werden zwei gute und drei schlechte Charaktere zufällig ausgewählt und mit ihren jeweiligen Bewegungen in die pcs-Liste aufgenommen.

Die Liste additionalPositions speichert die aktuelle Position jedes Charakters auf der Fortschrittsleiste.
Die Funktion updateAdditionalProgressBars aktualisiert die Positionen aller Charaktere auf der Fortschrittsleiste.
Es wird zufällig eine Bewegung aus den möglichen Bewegungen für jeden Charakter ausgewählt und die Position des Charakters entsprechend aktualisiert.

Die Funktion printAdditionalProgressBars druckt die Fortschrittsleisten aller Charaktere aus.
Für jeden Charakter in der pcs-Liste wird die Funktion printProgressBar aufgerufen,
wobei die aktuelle Position des Charakters, die maximale Position (die doppelte Größe der Liste fragenFaktenDEU),
die Farbe der Fortschrittsleiste und der Name des Charakters als Parameter übergeben werden. */
