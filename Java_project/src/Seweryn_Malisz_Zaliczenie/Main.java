/*
*   Główne ciało programu
*
*   Tutaj będą się pojawiać zmienne i funkcje bezpośrednio wpływające na działanie programu
*
* */


package Seweryn_Malisz_Zaliczenie;
    public class Main {
        public static void main(String[] args) {

            globalStringVariablesPL text = new globalStringVariablesPL();                   // Przygotowanie obsługi tekstu

            shoppingListClass shoppingList = new shoppingListClass();                       // Przygotowanie obsługi listy zakupów

            boolean programExecution = true;                                                // Warunek wykonywania się programu - jego zmiana kończy program

            System.out.println( text.globalHello );                                         // Komunikat powitalny

            do{

                System.out.println( text.mainMenuHeader );                                  //
                                                                                            //
                System.out.println( text.mainMenuEntry[0] );                                //
                System.out.println( text.mainMenuEntry[1] );                                //
                System.out.println( text.mainMenuEntry[2] );                                //      Menu główne programu
                System.out.println( text.mainMenuEntry[3] );                                //
                                                                                            //
                System.out.println(text.mainMenuEntry[text.mainMenuEntry.length-1]);        //
                System.out.print("> ");                                                     //

                switch ( inputDataClass.get_Value_Int() ) {
                    case 1:                                                                 //Dodaj nowy wpis

                        System.out.print( text.addEntryAddName );                           //
                        String inputName = inputDataClass.get_Value_String();               // Prośba o podanie nazwy produktu

                        System.out.print( text.addEntryAddValue );                          //
                        int inputValue = inputDataClass.get_Value_Int();                    // Prośba o podanie ilości do zakupu

                        shoppingList.addNewElement( inputName , inputValue );               // Wykonanie funkcji dodawania produktu

                        break;

                    case 2:                                                                 //Usuń wpis

                        System.out.print( text.deleteEntryName );                               //
                        shoppingList.deleteExistingItem( inputDataClass.get_Value_String() );   // Prośba o podanie nazwy produktu do usunięcia i wykonanie funkcji

                        break;

                    case 3:                                                                 //Wyświetl wszystkie wpisy

                        if ( shoppingList.entriesAmount > 0 ) {
                            for (int i = 0; i < shoppingList.entriesAmount; i++) {
                                System.out.println( (i+1)+". "+shoppingList.shoppingListEntry[i].EntryValue + " x" + shoppingList.shoppingListEntry[i].EntryAmount);
                            }
                        } else {
                            System.out.println(text.emptyList);
                        }
                        break;

                    case 4:                                                                 //Wyszukaj i wyświetl wpis wpis

                        if ( shoppingList.entriesAmount > 0 ) {                             // Sprawdzenie czy lista zakupów nie jest pusta

                            System.out.print(text.findEntryName);

                            int foundIndex = shoppingList.findExistingItem( inputDataClass.get_Value_String() );

                            if (foundIndex > -1) {                                          // Sprawdzenie czy element jest na liście. Jeśli tak zostaje wyświetlony komunikat i informacja o ilości do zakupu
                                System.out.println(text.findEntryPass[0] + (foundIndex + 1) + text.findEntryPass[1] + shoppingList.shoppingListEntry[foundIndex].EntryAmount );
                            } else {
                                System.out.println(text.findEntryFail);                     // Jeśli element nie zostanie znaleziony wyświetlony zostaje odpowiedni komunikat
                            }

                        } else {                                                            // W przypadku gdy lista jest pusta następuje wyświetlenie odpowiedniego komunikatu
                            System.out.println(text.emptyList);
                        }
                        break;

                    default:                                                                //Zakończ program
                        programExecution = false;
                        break;
                }

            } while (programExecution);

            System.out.println(text.globallGoodBye);
        }
    }
