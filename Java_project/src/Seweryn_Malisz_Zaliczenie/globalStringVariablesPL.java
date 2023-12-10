/*
*   Globalne zmienne tekstowe
*
*   Tutaj będą przechowywane zmienne z głównymi wartościami tekstowymi.
*
*   Otwiera program na dalszy rozwój i potencjalne tłumaczenie na inne języki
*
*
*/


package Seweryn_Malisz_Zaliczenie;

public class globalStringVariablesPL {
    String globalHello = "Witamy w programie Listy zakupów";

    //Main menu
    String mainMenuHeader = "Wybierz co chcesz zrobić";
    String mainMenuEntry[] = {
            "1 - Dodaj nowy produkt",
            "2 - Usuń produkt z listy",
            "3 - Wyświetl aktualną listę zakupów",
            "4 - Sprawdź czy konkretny produkt już jest na liście",
            "Aby zakończyć podaj inną wartość cyfrową"
    };

    String addEntryAddName = "Podaj opis produktu: ";
    String addEntryAddValue = "Podaj ilość do zakupu: ";

    String findEntryName = "Podaj nazwę wyszukiwanego elementu: ";

    String findEntryPass[] = {
            "Podany element znajduje się na liście pod indeksem ",
            ". Aktualna ilość do zakupu: "
    };

    String findEntryFail = "Podanego elementu nie ma na liście";

    String deleteEntryName = "Podaj nazwę elementu do usunięcia: ";

    String deleteEntryPass[] = {
            "Usunięto wpis \"",
            "\" na indeksie "
    } ;

    String emptyList = "Lista zakupów jest pusta";

    String globallGoodBye = "Dziękujemy za korzystanie z programu listy zakupów";
}
