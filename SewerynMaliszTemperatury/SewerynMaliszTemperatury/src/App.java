import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Wybierz typ konwersji.\n1. Celsiusz -> Fahrenheit\n2. Fahrenheit -> Celsjusz\n: ");

        switch (((int) getValue())) {
            case 1:
                System.out.print("Podaj temperaturę w stopniach Celsjusza: ");
                double Temperatura_Celsjusza = getValue();
                break;
        
            case 2:
                System.out.print("Podaj temperaturę w stopniach Fahrenheita: ");
                double Temperatura_Fahrenheita = getValue();
                break;
        
            default:
            System.out.println("Zły wybór");
                break;
        }

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
