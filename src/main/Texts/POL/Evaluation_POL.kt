fun auswertungPol() {
    print(ORANGE.ON)
    println("Wspaniale, odpowiedziałeś na wszystkie ${fragenFaktenDEU.size} pytań.\n$yesCount z nich odpowiedzią 'Tak' i $noCount odpowiedzią 'Nie'.")
    println()
    println("Teraz nadszedł czas, abyś mógł zastanowić się nad swoimi odpowiedziami i przywilejami. Zajmij sobie chwilę i przemyśl każde z poniższych pytań.".wordWrap(100))
    print(ORANGE.OFF)
    println("${BLUE.ON}Wciśnij Enter, aby przejść dalej.${BLUE.OFF}.")
    readln()
    println("Jak się czułeś, odpowiadając na pytania? Czy były pytania, które sprawiły Ci szczególny dyskomfort? ${BLUE.ON}Enter${BLUE.OFF}.".wordWrap(100))
    readln()
    println("Czy jakiekolwiek pytania uświadomiły Ci bardziej Twoje przywileje? Jeśli tak, które i dlaczego? ${BLUE.ON}Enter${BLUE.OFF}.".wordWrap(100))
    readln()
    println("Czy czujesz, że masz więcej przywilejów niż inni? Jeśli tak, czy potrafisz to wyjaśnić? ${BLUE.ON}Enter${BLUE.OFF}.".wordWrap(100))
    readln()
    println("Jak czujesz się, wiedząc, że inni mogą mieć mniej przywilejów niż Ty? ${BLUE.ON}Enter${BLUE.OFF}.".wordWrap(100))
    println()
    println("${GREEN.ON}Podsumowując, możemy powiedzieć, że:${GREEN.OFF} Przywileje są złożone, wielowymiarowe i głęboko splecione z naszymi społeczeństwami, często kształtując nasze ścieżki życiowe i doświadczenia. Przywilej, socjologicznie rzecz biorąc, to niewynikająca z wysiłku przewaga przyznawana pewnym osobom na podstawie takich czynników jak ich status społeczno-ekonomiczny, rasa, płeć czy kraj, w którym się urodzili. Istotnym, często pomijanym przywilejem jest na przykład 'loteria urodzenia'. Jest to niekontrolowalny czynnik polegający na urodzeniu się w rozwiniętym kraju zachodnim lub zamożnym społeczeństwie. Jest to niewynikający z zasług przywilej, zwykły fart, nie świadczący o zdolnościach czy ciężkiej pracy jednostki. Wiele osób w biedniejszych krajach lub w uprzywilejowanych społecznościach boryka się z większymi wyzwaniami i przeszkodami od samego początku, mając możliwe braki w dostępie do wysokiej jakości edukacji, opieki zdrowotnej, bezpiecznego mieszkania czy możliwości ekonomicznych. Są to wszystkie przywileje, które osoby w bogatszych krajach czy społeczeństwach często biorą za pewnik. Ponadto, przywileje mogą znacząco wpływać na wejście w świat zawodowy. Osoby mające dostęp do dobrej edukacji, sieci kontaktów i zasobów często łatwiej znajdują stabilne i dobrze płatne prace oraz rozwijają udane kariery. Z kolei osoby pozbawione tych przywilejów mogą mieć trudności ze znalezieniem bezpiecznych i dobrze płatnych miejsc pracy, nawet jeśli są pracowite i utalentowane. W gruncie rzeczy, przywileje mogą znacząco ułatwiać lub utrudniać życie. Rozpoznanie i kwestionowanie tych różnic jest niezbędne w dążeniu do bardziej sprawiedliwego społeczeństwa. Przywileje podsycają uczucia wyższości wśród uprzywilejonych, podczas gdy osoby mające mniej przywilejów mogą czuć się niższe. Ta dynamika władzy może występować w klasie, między grupami społecznymi w kraju takim jak Niemcy, czy między krajami na skalę globalną (tzw. kraje uprzemysłowione i rozwijające się). Ważne jest zauważenie, że przywileje wykraczają poza namacalne korzyści takie jak bogactwo i wykształcenie, dotyczą także emocjonalnych lub psychologicznych doświadczeń poczucia bezpieczeństwa, pewności siebie oraz przynależności lub uznania przez społeczeństwo czy grupę społeczną. Jednak porównanie do grupy odniesienia jest w każdym przypadku istotne. Podsumowując, rozpoznanie, zrozumienie i kwestionowanie naszych przywilejów to kluczowe kroki w promowaniu społecznej równości. Przecież nie są to osiągnięcia indywidualne, lecz raczej systemowe korzyści, które mogą utrwalać społeczne nierówności, wywoływać uczucia wyższości i często sprawiać, że początek, na przykład w świecie zawodowym, jest dla innych niesprawiedliwie trudny.".wordWrap(100))
    println()
    println("${GREEN.ON}Podsumowując, powinniśmy być świadomi naszych własnych przywilejów, niezależnie od tego, czy wynikają one z miejsca urodzenia, płci czy statusu społecznego. Powinniśmy również dążyć do większego wsparcia i współczucia wobec siebie nawzajem.${GREEN.OFF}".wordWrap(100))
}