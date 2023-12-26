package ShoppingList;

class ShoppingListItemClass{
    private String name;
    private int amount;

    ShoppingListItemClass(String inputName, int inputAmount){
        name=inputName;
        amount=inputAmount;
    }

    //Funkcja aktualizacji ilości produktu
    public void updateProductAmount(int amountToUpdate){
        amount+=amountToUpdate;
    }

    public String returnItemName(){
        return name;
    }

    public int returnItemAmount(){
        return amount;
    }
}
