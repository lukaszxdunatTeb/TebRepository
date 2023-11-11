import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
 /*      W poprzednim commicie jest ten sam program lecz z wykorzystaniem pętli while.
        Do while w tym przypadku jest lepszym wyborem.*/
        String dane;
        do {
            System.out.print("Wprowadź dane (wpisz 'koniec' aby zakończyć): ");
            dane = scanner.nextLine();
            System.out.println("Wprowadziłeś: " + dane);
        } while (!dane.equals("koniec"));

        // Zawsze zamykaj scanner po użyciu.
        scanner.close();
    }
}