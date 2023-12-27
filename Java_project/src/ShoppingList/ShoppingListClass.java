package ShoppingList;
import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;
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

    //Funkcja zwracająca ilość wpisów na liście
    public int returnProductsAmount(){
        return shoppingListItemsAmount;
    }
    //Funkcja wyświetlająca całą listę zakupów
    public void returnWholeShoppingList(){
        for(int i = 0; i < shoppingListItemsAmount; i++){
            System.out.println(shoppingListItems[i].returnItemName() +" x "+ shoppingListItems[i].returnItemAmount());
        }
    }

    public int returnItemIndex(String inputName){
        for(int i = 0; i < shoppingListItemsAmount; i++){
            if (inputName.toLowerCase().equals(shoppingListItems[i].returnItemName().toLowerCase())) {
                return i;
            }
        }
        return -1;
    }

    public int removeItemFromList(String inputName){
        int index = returnItemIndex(inputName);
        if (index > -1){
            shoppingListItemsAmount--;
            for(int i = index; i < shoppingListItemsAmount; i++){
                shoppingListItems[i]=shoppingListItems[i+1];
            }
            shoppingListItems[shoppingListItemsAmount]=null;
            return 1;
        } else {
            return 0;
        }
    }

    public void updateAmountOfItemOnList(int inputIndex, int inputValue){
        shoppingListItems[inputIndex].updateProductAmount(inputValue);
    }

    public void saveToFile() {
        try {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("amount", shoppingListItemsAmount);
            jsonObject.put("data", shoppingListItems);

            Files.write(Paths.get("data.json"), jsonObject.toString().getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
