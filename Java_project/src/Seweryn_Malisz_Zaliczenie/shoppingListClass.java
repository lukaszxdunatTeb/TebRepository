/*
*   Klasa przechowująca zmienne i funkcje związane z samą listą zakupów
*
*/

package Seweryn_Malisz_Zaliczenie;

    public class shoppingListClass {

        shoppingListElement shoppingListEntry[] = new shoppingListElement[0];
        int entriesAmount = 0;
        class shoppingListElement{
            String EntryValue;
            int EntryAmount;

            shoppingListElement(String inputName, int inputValue){
                EntryValue = inputName;
                EntryAmount = inputValue;
            }
        }
        void addNewElement(String inputName, int inputValue){
            entriesAmount++;
            
        }
    }
