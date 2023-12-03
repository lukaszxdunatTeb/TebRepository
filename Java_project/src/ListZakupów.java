import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class ListZakupów
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("Apple");

        boolean continueProgram=true;

        while (continueProgram) {
//            System.out.println("Shopping List:");
//            printList(shoppingList);

            System.out.println("1. Add an item");
            System.out.println("2. Remove an item");
            System.out.println("3. Display shopping list");
            System.out.println("4. Check item");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the product to add: ");
                    String newItem = scanner.nextLine();
                    addItem(shoppingList, newItem);
                    break;
                case 2:
                    System.out.print("Enter the name of the product to remove: ");
                    String itemToRemove = scanner.nextLine();
                    removeItem(shoppingList, itemToRemove);
                    break;
                case 3:
                    System.out.println("Shopping List:");
                    printList(shoppingList);
                    break;
                case 4:
                    System.out.print("Enter the name of the product to check: ");
                    String productToCheck = scanner.nextLine();
                   if (isProductInList(shoppingList, productToCheck)) {
                        System.out.println("The product \"" + productToCheck + "\" is in the shopping list.");
                    } else {
                        System.out.println("The product \"" + productToCheck + "\" is not in the shopping list.");
                    }
                   break;
                case 5:
                    continueProgram = false;
                    break;
                default:
                    System.out.println("Please enter correct number");
            }
        }

        System.out.println("Program ended!");
        scanner.close();
    }

    // To add item to the list
    private static void addItem(ArrayList<String> list, String item) {
        if (!list.contains(item)) {
            list.add(item);
            System.out.println("Item \"" + item + "\" added to the list.");
        } else {
            System.out.println("Item \"" + item + "\" is already in the list. Can't add item.");
        }
    }

    // To remove item from the list
    private static void removeItem(ArrayList<String> list, String item) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String listItem = iterator.next();
            if (item.equals(listItem)) {
                iterator.remove();
                System.out.println("Item \"" + item + "\" removed from the list.");
                return;
            }
        }
        System.out.println("Item \"" + item + "\" not found in the list.");
    }

    // Display the shopping list
    private static void printList(ArrayList<String> list) {
        for (String Item : list) {
            System.out.println(Item);
        }
    }
    // To check product in the shopping list
    private static boolean isProductInList(ArrayList<String> list, String product) {
        return list.contains(product);
    }
}

