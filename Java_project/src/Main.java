import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dane = "";

        while (!dane.equals("koniec")) {
            System.out.print("Wprowadź dane (wpisz 'koniec' aby zakończyć): ");
            dane = scanner.nextLine();
            System.out.println("Wprowadziłeś: " + dane);
        }

        // Zawsze zamykaj scanner po użyciu.
        scanner.close();
    }
}