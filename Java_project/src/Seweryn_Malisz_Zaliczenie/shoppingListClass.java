/*
*   Klasa przechowująca zmienne i funkcje związane z samą listą zakupów
*
*/

package Seweryn_Malisz_Zaliczenie;

    public class shoppingListClass {

        shoppingListElement shoppingListEntry[] = new shoppingListElement[0];       // Lista zakupów
        int entriesAmount = 0;                                                      // Faktyczna ilość wpisów na liście
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
                shoppingListEntry[entriesAmount] = new shoppingListElement(inputName, inputValue);
            }
        }
    }
