import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj górny zakres sumy (liczba całkowita): ");
        int gornyZakres = scanner.nextInt();

        int suma = 0;

        for (int i = 1; i <= gornyZakres; i++) {
            suma += i;
        }

        System.out.println("Suma liczb od 1 do " + gornyZakres + " wynosi: " + suma);

        // Zawsze zamykaj scanner po użyciu, aby uniknąć wycieków pamięci.
        scanner.close();
    }
}