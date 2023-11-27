import java.util.Scanner;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("### Witaj w konwenterze temperatury.   ###");
        System.out.println("### Aby zakończyć działanie programu,  ###");
        System.out.println("### w dowolnym momencie wpisz 'koniec' ###");
        while(true){
            System.out.println();
            System.out.printf("Proszę podaj temperaturę: ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("koniec"))
                return;
            float odczyttemp = Float.parseFloat(input);
            System.out.println(" 1.Fahrenheit na Celsiusz");
            System.out.println(" 2.Celsiusz na Fahrenheit");
            System.out.printf("Wybierz przelicznik: ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("koniec"))
                return;
            switch (Integer.parseInt(input)) {
                case 1:
                    System.out.println( "Stopnie Celsiusza: "  +  ((odczyttemp - 32) * 5/9));
                    break;
                case 2:
                    System.out.println( "Stopnie Fahrenheit: "  +  ((odczyttemp * 9/5) + 32));
                    break;
                default:
                    System.out.println( "Nie wybrano żadnego przelicznika" );
                    break;
            }
        }
    }
}