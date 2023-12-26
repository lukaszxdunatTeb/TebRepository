package ShoppingList;

public class ShoppingListClass {
    private class ShoppingListItemClass{
        private String name;
        private int amount;
        ShoppingListItemClass(String name, int amount){
            name=name;
            amount=amount;
        }
    }

    ShoppingListItemClass[] shoppingList= new ShoppingListItemClass[0];
}
