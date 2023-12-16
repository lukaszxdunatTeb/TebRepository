import java.util.Scanner;
import java.util.Arrays;
public class Main {
    //Program Lista zakupów
    public static void main(String[] args) {
        System.out.println("Program Lista zakupów");
        String[] products = new String[5];
        Scanner scanner = new Scanner(System.in);
        int chooseAction;

        while (true) {
            System.out.println(" ");
            System.out.println("Wybierz co chcesz zrobić:\n1-Dodaj produkt\n2-Usuń produkt\n3-Wyświetl listę zakupów" +
                               "\n4-Sprawdź produkt\n5-Zakończ program");
            chooseAction = scanner.nextInt();
            try {
                switch (chooseAction) {
                    case 1:
                        System.out.println("Dodawanie produktu \nPodaj nazwę produktu");
                        String addProduct = scanner.next();

                        // dodawanie produktu
                        addToProduct(products, addProduct);
                        System.out.println("Wprowadzony produkt " + products[0]);
                        break;
                    case 2:
                        System.out.println("Usuwanie produktu \nPodaj nazwę produktu");
                        String deleteProduct = scanner.next();

                        // usuwanie produktu
                        deleteProductInProducts(products, deleteProduct);
                        break;
                    case 3:
                        System.out.println("Wyświetl listę zakupów");

                        // wyświetlanie listy produktów
                        viewShoppingProducts(products);
                        break;
                    case 4:
                        System.out.println("Sprawdź produkt");

                        // sprawdzanie produktu
                        String checkProduct = scanner.next();
                        checkProducts(products, checkProduct);
                        break;
                    case 5:
                        System.out.println("Koniec programu.");
                        break;
                    default:
                        System.out.println("Nie wybrano żadnej opcji");
                        break;
                }

                if (chooseAction == 5) {
                    break;

                }
            }catch (NumberFormatException var10) {
                System.out.println("Nieprawidłowy format danych. Podaj liczbę");
                scanner.nextLine();
            }

        }
    }

    private static void addToProduct(String[] products, String product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                System.out.println("Dodano produkt: " + product);
                return;
            }
        }
        System.out.println("Nie można dodać więcej produktów. Lista produktów jest pełna.");
    }

    private static void viewShoppingProducts(String[] products) {
        System.out.println("Lista zakupów:");
        for (String product : products) {
            if (product != null) {
                System.out.println(product);
            }
        }
    }
    //Usuwanie produktu
    private static void deleteProductInProducts(String[] products, String product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].equals(product)) {
                System.out.println("Usunięto produkt: " + product);
                products[i] = null;
                return;
            }
        }
        System.out.println("Nie można usunąć produktu. Brak produktu w Liście");
    }

    //Sprawdza czy istnieje produkt
    private static void checkProducts(String[] produkty, String produkt) {
        for (int i = 0; i < produkty.length; i++) {
            if (produkty[i] != null && produkty[i].equals(produkt)) {
                System.out.println("Produkt znaleziony: " + produkt);
                produkty[i] = null;
                return;
            }

        }
        System.out.println("Brak produktu");
    }

}