package ShoppingList;

public class ShoppingListClass {
    private int shoppingListItemsAmount = 0;
    private ShoppingListItemClass[] shoppingListItems = new ShoppingListItemClass[0];

    //Funkcja faktycznego dodania elementu do listy
    public void addNewItemToTheList(String inputName, int inputValue){
        //Rozszerzenie faktycznej iości produktów na liście
        shoppingListItemsAmount++;

        //Sprawdzanie czy długość tablicy jest wystarczająca by przyjąć kolejny element. Jeśli nie zostanie rozszerzona
        if(shoppingListItems.length<shoppingListItemsAmount){
            //Stworzenie tablicy tymczasowej o wymiarze 1 większym niż docelowa, skopiowanie do niej elementów
            ShoppingListItemClass[] temporaryList = new ShoppingListItemClass[shoppingListItemsAmount];
            for(int i = 0; i < shoppingListItems.length; i++){
                temporaryList[i]=shoppingListItems[i];
            }
            //Dodanie nowego wpisu na ostatnim indeksie
            temporaryList[shoppingListItemsAmount-1] = new ShoppingListItemClass(inputName,inputValue);
            //Skopiowanie danych z listy tymczasowej do docelowej
            shoppingListItems=temporaryList;
        } else {
            //Jeśli faktyczna ilość wpisów jest mniejsza lub równa długości tablicy nowy wpis zostanie wpisany na indeks o wartości ilości wpisów
            shoppingListItems[shoppingListItemsAmount] = new ShoppingListItemClass(inputName,inputValue);
        }
    }
}
