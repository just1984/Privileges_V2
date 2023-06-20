open class Rolle(
    val name: String,
    val alter: Int,
    val herkunft: String,
    val geschlecht: String,
    val schicksal: String
)
class RolleKarte(
    name: String,
    alter: Int,
    herkunft: String,
    geschlecht: String,
    schicksal: String
) : Rolle(name, alter, herkunft, geschlecht, schicksal)

val rollenKarte1_class = RolleKarte(
    "Akon",
    17,
    "Südsudan",
    "weiblich",
    "Aufgrund des Bürgerkriegs musstest du mit deiner Familie fliehen. Du lebst jetzt in einem Flüchtlingslager und bekommst dort Essen verteilt. Du hast keinen Zugang zu Bildung, und deine täglichen Aufgaben bestehen darin, auf deine jüngeren Geschwister aufzupassen und Wasser aus einem nahe gelegenen Brunnen zu holen."
)

val rollenKarte2_class = RolleKarte(
    "Carlos",
    42,
    "Leon, Nicaragua",
    "männlich",
    "Du wurdest von deinem Land vertrieben, damit große Unternehmen Bananenplantagen errichten konnten. Zusammen mit anderen Bauern versuchst du, dich gegen die Landnahme zu wehren."
)

val rollenKarte3_class = RolleKarte(
    "Olena",
    34,
    "Ukraine",
    "weiblich",
    "Du hast deinen Abschluss in der Ukraine gemacht. Leider wird dieser in Deutschland nicht anerkannt, deswegen arbeitest du jetzt als Reinigungskraft für eine große Reinigungskette."
)

val rollenKarte4_class = RolleKarte(
    "Tom",
    38,
    "USA",
    "männlich",
    "Du hast in der US-Marine gearbeitet und warst in Afghanistan stationiert. Nun lebst du in Chicago auf der Straße. Du trinkst viel Alkohol, um die schrecklichen Bilder in deinem Kopf vergessen zu können."
)

val rollenKarte5_class = RolleKarte(
    "Anja",
    43,
    "Deutschland",
    "weiblich",
    "Du bist eine allein erziehende Mutter. Du hast zwei Kinder, 6 und 10 Jahre alt, und arbeitest in Teilzeit als Verkäuferin im Lebensmittelgeschäft."
)

val rollenKarte6_class = RolleKarte(
    "Mahi",
    30,
    "Irak",
    "männlich",
    "Du lebst seit 9 Jahren ohne Papiere in Deutschland. Du kannst schwarz auf dem Bau arbeiten, hast aber immer Angst, dass die Polizei dich eines Tages erwischen könnte und du abgeschoben wirst."
)

val rollenKarte7_class = RolleKarte(
    "João",
    61,
    "Huambo, Angola",
    "männlich",
    "Weil du kein Geld hast, um Medikamente gegen deine Diabetes-Erkrankung zu kaufen, mussten dir Stück für Stück beide Beine amputiert werden. Nun sitzt du im Rollstuhl."
)

val rollenKarte8_class = RolleKarte(
    "Emma",
    9,
    "Deutschland",
    "weiblich",
    "Du möchtest einmal Tänzerin werden. Deine Eltern schicken dich zweimal in der Woche auf eine Ballettschule, außerdem spielst du gerne Klavier und gehst in den Ferien auf einen Reiterhof mit vielen Pferden."
)

val rollenKarte9_class = RolleKarte(
    "Li Wei",
    50,
    "Shanghai, China",
    "männlich",
    "Du bist Wissenschaftsminister der Volksrepublik China und nimmst deine Arbeit sehr ernst, denn du bist überzeugt, dass Bildung für jeden Menschen wichtig ist."
)

val rollenKarte10_class = RolleKarte(
    "Abeba",
    26,
    "Äthiopien",
    "weiblich",
    "Du hast meistens nur Maisbrei zum Essen und bist auf Hilfslieferungen aus anderen Ländern angewiesen. Du vermisst die Zeit, in der ihr eure Herden noch tränken konntet, weil es genug Wasser für alle gab."
)

val rollenKarte11_class = RolleKarte(
    "Pierre",
    38,
    "Gabun",
    "männlich",
    "Du betreibst ein wenig Landwirtschaft und verkaufst die Überschüsse auf dem Markt. Leider ist dieses Jahr die Ernte schlecht ausgefallen."
)

val rollenKarte12_class = RolleKarte(
    "Elisabeth",
    45,
    "Berlin, Deutschland",
    "weiblich",
    "Du bist Geschäftsführerin eines Schmuckunternehmens. An manchen Tagen arbeitest du bis zu 15 Stunden, aber du liebst deine Arbeit. Zur Entspannung machst du öfter Kurztrips nach Norditalien."
)

val rollenKarte13_class = RolleKarte(
    "Carlos",
    21,
    "Madrid, Spanien",
    "männlich",
    "Du hast einen kleinen Gemüsestand auf der Straße von Madrid. Du würdest gerne auf die Universität gehen, aber du hast keinen Schulabschluss und auch keine Berufsausbildung gemacht."
)

val rollenKarte14_class = RolleKarte(
    "Samuel",
    31,
    "Nakuru, Kenia",
    "männlich",
    "Du arbeitest auf einer Kaffeeplantage in Nakuru, Kenia. Du bist froh, einen gut bezahlten Job zu haben, der es dir ermöglicht, deine zwei Kinder auf eine gute Schule zu schicken."
)

val rollenKarte15_class = RolleKarte(
    "Thandi",
    35,
    "Johannesburg, Südafrika",
    "weiblich",
    "Du lebst in einem Township in der Nähe von Johannesburg. Du besitzt einen kleinen Kosmetiksalon mit zwei Angestellten. Ihr macht zwar keinen großen Gewinn, aber du bist deine eigene Chefin und liebst deinen Job."
)

val rollenKarte16_class = RolleKarte(
    "Amina",
    28,
    "Bangladesch",
    "weiblich",
    "Du arbeitest als Schneiderin in einer T-Shirt-Fabrik. Oft musst du die ganze Nacht durcharbeiten und bekommst die Überstunden nicht bezahlt. Aber du versuchst durchzuhalten, weil du deinen Eltern auf dem Land Geld schicken möchtest."
)

val rollenKarte17_class = RolleKarte(
    "Isabel",
    24,
    "Spanien",
    "weiblich",
    "Du hast Kunstgeschichte studiert. Du lebst bei deinen Eltern, weil du dir keine eigene Wohnung leisten kannst. Du hast Praktika absolviert, findest aber keine feste Anstellung."
)

val rollenKarte18_class = RolleKarte(
    "Maximilian",
    47,
    "Deutschland",
    "männlich",
    "Du bist Geschäftsführer eines internationalen Elektronikkonzerns. Dein Jahresgehalt liegt bei rund 2 Millionen Euro. Du gehst oft auf Dienstreisen und lässt es dir in deiner wenigen Freizeit gut gehen."
)

val rollenKarte19_class = RolleKarte(
    "Karim",
    40,
    "Rabat, Marokko",
    "männlich",
    "Du bist ein erfolgreicher Geschäftsmann in Rabat. Dein Unternehmen verkauft Gips, das aus den Minen des Landes gewonnen wird, an europäische Baufirmen. Du lebst mit deiner Familie in einer schönen Villa am Stadtrand."
)

val rollenKarte20_class = RolleKarte(
    "Florian",
    23,
    "München, Deutschland",
    "männlich",
    "Du studierst und kommst aus einer eher einkommensschwachen Familie. Deine Eltern können dich nicht unterstützen. Du finanzierst deinen Lebensunterhalt mit Nebenjobs, die du nach deinen Vorlesungen machst."
)

val rollenKarte21_class = RolleKarte(
    "Jose",
    55,
    "Rio de Janeiro, Brasilien",
    "männlich",
    "Du bist Taxifahrer in Rio. Du arbeitest oft sehr lange Schichten, um deine Familie zu unterstützen, aber du liebst es, neue Leute kennenzulernen und ihnen Geschichten zu erzählen."
)

val rollenKarte22_class = RolleKarte(
    "Ingrid",
    40,
    "Stockholm, Schweden",
    "weiblich",
    "Du bist Bibliothekarin. Du liebst Bücher und hilfst den Leuten gerne dabei, neue Bücher zu entdecken und zu lernen."
)

val rollenListeDeu = listOf(
    rollenKarte1_class, rollenKarte2_class, rollenKarte3_class, rollenKarte4_class,
    rollenKarte5_class, rollenKarte6_class, rollenKarte7_class, rollenKarte8_class,
    rollenKarte9_class, rollenKarte10_class, rollenKarte11_class, rollenKarte12_class,
    rollenKarte13_class, rollenKarte14_class, rollenKarte15_class, rollenKarte16_class,
    rollenKarte17_class, rollenKarte18_class, rollenKarte19_class, rollenKarte20_class,
    rollenKarte21_class, rollenKarte22_class
)
