import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        double number1 = scanner.nextDouble();

        System.out.println("Podaj drugą liczbę");
        double number2 = scanner.nextDouble();

        System.out.println("Wybierz operacje (1 - dodawanie, 2 - odejmowanie, 3 - mnożenie, 4 - dzielenie): ");
        int operation = scanner.nextInt();

        double result = 0;

        switch (operation) {
            case 1:
                result = addition(number1, number2);
                break;
            case 2:
                result = subtraction(number1, number2);
                break;
            case 3:
                result = multiplication(number1, number2);
                break;
            case 4:
                result = division(number1, number2);
                break;
            default:
                System.out.println("Nieprawidłowy wybór operacji.");
                break;
        }

        System.out.println("Wynik: " + result);
    }

    private static double addition(double a, double b) {
        return a + b;
    }

    private static double subtraction(double a, double b) {
        return a - b;
    }

    private static double multiplication(double a, double b) {
        return a * b;
    }

    private static double division(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Nie można dzielić przez zero.");
            return 0;
        }
    }
}