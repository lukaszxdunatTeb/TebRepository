import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Wybierz typ konwersji.\n1. Celsiusz -> Fahrenheit\n2. Fahrenheit -> Celsjusz\n: ");

        do{
            break;
        }while(true);

        System.out.println("Koniec");
    }

    public static double getValue() {
        do {
            try {
                Scanner consoleInput = new Scanner(System.in);
                
                return consoleInput.nextDouble();
            } catch (Exception e) {
                System.out.println("Podano złą wartość. Spróbuj jeszcze raz.");
            }
        } while(true);
    }
}
