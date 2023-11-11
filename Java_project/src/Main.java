import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę elementów tablicy: ");
        int elementsNumber = scanner.nextInt();

        // Inicjalizacja tablicy o podanej liczbie elementów
        int[] myTable = new int[elementsNumber];

        // Wprowadzenie danych do tablicy
        insertElements(scanner, elementsNumber, myTable);

        // Obliczenia statystyczne
        int sum = 0;
        int min = myTable[0];
        int max = myTable[0];

        // Iteracja przez tablicę w celu obliczenia sumy, najmniejszej i największej wartości
        for (int number : myTable) {
            sum += number;

            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }
        }

        // Obliczenie średniej
        double average = getAverage(elementsNumber, sum);

        // Wyświetlenie wyników
        displayResult(sum, min, max, average);

        // Zawsze zamykaj scanner po użyciu, aby uniknąć wycieków pamięci.
        scanner.close();
    }

    private static void insertElements(Scanner scanner, int elementsNumber, int[] myTable) {
        for (int i = 0; i < elementsNumber; i++) {
            System.out.print("Podaj element nr " + (i + 1) + ": ");
            myTable[i] = scanner.nextInt();
        }
    }

    private static double getAverage(int liczbaElementow, double suma) {
        return suma / liczbaElementow;
//        Kod poniżej jest tożsamy
//        double srednia = suma / liczbaElementow;
//        return srednia;
    }

    private static void displayResult(int suma, int min, int max, double srednia) {
        System.out.println("Suma: " + suma);
        System.out.println("Średnia: " + srednia);
        System.out.println("Najmniejsza wartość: " + min);
        System.out.println("Największa wartość: " + max);
    }
}