import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Podaj wagę: ");

        double waga = getValue();

        System.out.print("Podaj wzrost: ");

        double wzrost = (getValue())/100;

        double BMI = waga / (wzrost*wzrost);
        
        System.out.println(""+BMI);

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
