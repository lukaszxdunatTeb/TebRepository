import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Podaj wagę: ");

        double waga = getValue();

        System.out.print("Podaj wzrost: ");

        double wzrost = (getValue())/100;

        double BMI = waga / (wzrost*wzrost);
        
        System.out.print(""+BMI+" ");

        if(BMI>30){
            System.out.println("Otyłość");
        } else if (BMI>25) {
            System.out.println("Nadwaga");
        } else if (BMI>18.5) {
            System.out.println("Normalna waga");
        } else {
            System.out.println("Niedowaga");
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
