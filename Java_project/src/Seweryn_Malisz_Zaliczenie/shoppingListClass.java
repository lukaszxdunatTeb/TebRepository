/*
*   Klasa przechowująca zmienne i funkcje związane z samą listą zakupów
*
*/

package Seweryn_Malisz_Zaliczenie;

    public class shoppingListClass {

        shoppingListElement shoppingListEntry[] = new shoppingListElement[0];       // Lista zakupów
        int entriesAmount = 0;                                                      // Faktyczna ilość wpisów na liście

        globalStringVariablesPL text = new globalStringVariablesPL();
        class shoppingListElement{                                                  // Klasa wpisu na liście zakupów. Zawiera opis i ilość
            String EntryValue;                                                      // Opis/nazwa produktu
            int EntryAmount;                                                        // Ilość danego produktu do zakupu

            shoppingListElement(String inputName, int inputValue){
                EntryValue = inputName;
                EntryAmount = inputValue;
            }
        }
        void addNewElement(String inputName, int inputValue){

            entriesAmount++;                                                        // Zwiększenie faktycznej ilości wpisów o 1

            if(entriesAmount>shoppingListEntry.length){                             // Sprawdzenie czy faktyczna ilość wpisów jest większa niż aktualny rozmiar tablicy
                shoppingListElement tmp[] = new shoppingListElement[entriesAmount]; // Tymczasowa tablica listy zakupów do powiększenia tej faktycznej
                for(int i = 0; i < shoppingListEntry.length; i++){                  // Kopiowanie danych do listy tymczasowej
                    tmp[i] = shoppingListEntry[i];
                }
                tmp[tmp.length-1] = new shoppingListElement(inputName, inputValue);
                shoppingListEntry = tmp;
            } else {                                                                // Gdy autentyczna ilość wpisów jest mniejsza niż rozmiar tablicy wpisujemy na indeks o wartości równej ilości faktycznych wpisów
                shoppingListEntry[entriesAmount - 1] = new shoppingListElement(inputName, inputValue);
            }
        }

        int findExistingItem(String name){                                          // Funkcja wyszukiwania elementu - zwraca indeks elementu na liście na którym można później operować
            for ( int i = 0; i < shoppingListEntry.length; i++){
                if( shoppingListEntry[i].EntryValue.toLowerCase().equals( name.toLowerCase() ) ){ return i; }       // Sprawdzanie czy element jest na liście - jesli tak zwracany jest indeks i przerywane jest działanie funkcji
            }
            return -1;                                                              // W przypadku gdy nie ma elementu na liście zwracana jest wartość -1
        }

        void deleteExistingItem(String name){
            int index = findExistingItem(name);                                     // Odnalezienie indeksu wyszukiwanego elementu

            if ( index > -1 ) {                                                     // Jeżeli indeks nie jest mniejszy od 0 to znaczy, że element jest na liście
                entriesAmount--;                                                    // Zmniejszenie ilości wpisów o 1

                for ( int i = index; i<entriesAmount; i++){                         //
                    shoppingListEntry[i]=shoppingListEntry[i+1];                    // Usunięcie szukanego elementu i przesunięce elementów tablicy o jeden wstecz
                }                                                                   //

                shoppingListEntry[entriesAmount] = null;                          // Wyczyszczenie ostatniego wpisu na liście

                System.out.println( text.deleteEntryPass[0] + name + text.deleteEntryPass[1] + ( index + 1 ) );     // Potwierdzenie usunięcia komunikatem
            } else {
                System.out.println(text.findEntryFail);                             // W przypadku nie odnalezienia elementu wyświetlenie odpowiedniego komunikatu
            }
        }
    }
