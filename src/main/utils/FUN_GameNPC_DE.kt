import kotlin.random.Random

val goodNames = listOf("Matthias", "Rafael", "Kai", "Dennis", "Jim", "Felix", "Klaas", "Piet", "Henning", "Tamino", "Findus", "Niklas", "Emil", "Danny", "Sam", "Patrick", "Marten", "Julius", "Bryan", "Noel", "Jay", "Pascal", "Christian")
val badNames = listOf("Aydan", "Serafina", "Peggy", "Ayşegül", "Beyzanur", "Fatima", "Çiğdem", "Gökhan", "Mariusz", "Cindy", "Emily", "Marcél", "Sergej", "Mohammed", "Emre", "Dimitrios", "Johannes", "Ali", "Malek")

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
