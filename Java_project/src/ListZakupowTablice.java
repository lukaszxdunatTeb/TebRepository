import java.util.Scanner;

public class ListZakupowTablice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] shoppingList = new String[1];

        boolean programRun = true;

        while (programRun) {
            System.out.println("1. Add an item");
            System.out.println("2. Remove an item");
            System.out.println("3. Check product is IN the list");
            System.out.println("4. Print the shopping list");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the adding product: ");
                    String newItem = scanner.nextLine();
                    //check and resize shopping List
                    String lastItem = shoppingList[shoppingList.length-1];
                    if(lastItem != null) {shoppingList = resizeArray(shoppingList, shoppingList.length+1);}
                    addItem(shoppingList, newItem);
                    break;
                case 2:
                    System.out.print("Enter the name of the removing product: ");
                    String removeItem = scanner.nextLine();
                    removeItem(shoppingList, removeItem);
                    //check and resize shopping List
                    lastItem = shoppingList[shoppingList.length-1];

                    if(lastItem == null) {shoppingList = resizeArray(shoppingList, shoppingList.length-1);}
                    break;
                case 3:
                    System.out.print("Enter the name product to check: ");
                    String checkItem = scanner.nextLine();

                    if (isProductInList(shoppingList, checkItem)) {
                        System.out.println("The product \"" + checkItem + "\" is in the shopping list.");
                    } else {
                        System.out.println("The product \"" + checkItem + "\" is not in the shopping list.");
                    }
                    break;
                case 4:
                    System.out.println("Shopping List:");
                    printList(shoppingList);
                    break;
                case 5:
                    programRun = false;
                    System.out.println("Program ended!");
                    break;
                default:
                    System.out.println("Please enter correct number.");
            }
        }

        scanner.close();
    }

    // Add item to the list
    private static void addItem(String[] list, String item) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                list[i] = item;
                System.out.println("Item \"" + item + "\" added to the list.");
                return;
            }
        }
        System.out.println("The list is full. Cannot add the item.");
    }
    private static String[] resizeArray(String[] list, int newSize) {
        if(list.length == 0) {
            return list;}
        else {
        String[] newList = new String[newSize];
        int length = Math.min(list.length, newSize);
        for (int i = 0; i < length; i++) {
            newList[i] = list[i];
            }
        return newList;
        }
    }

    //Remove item from the list
    private static void removeItem(String[] list, String item) {
        for (int i = 0; i < list.length; i++) {
            if (item.equals(list[i])) {
                    for (int j = i; j < list.length - 1; j++) {
                    list[j] = list[j + 1];
                }
                list[list.length - 1] = null;
                System.out.println("Item \"" + item + "\" removed from the list.");
                return;
            }
        }
        System.out.println("Item \"" + item + "\" not found in the list.");
    }

    //Check product is in the shopping list
    private static boolean isProductInList(String[] list, String product) {
        for (String listItem : list) {
            if (product.equals(listItem)) {
                return true;
            }
        }
        return false;
    }

    // Display the shopping list
    private static void printList(String[] list) {
        for (String listItem : list) {
            if (listItem != null) {
                System.out.println(listItem);
            }
        }
    }
}
