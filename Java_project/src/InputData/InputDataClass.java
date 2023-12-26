package InputData;

import java.util.Scanner;
public class InputDataClass {
    public static double getValueDouble() {
    do {
        try {
            Scanner consoleInput = new Scanner(System.in);

            return consoleInput.nextDouble();
        } catch (Exception e) {
            System.out.println("Podano złą wartość. Spróbuj jeszcze raz.");
        }
    } while(true);
}

    public static int getValueInt() {
        do {
            try {
                Scanner consoleInput = new Scanner(System.in);

                return consoleInput.nextInt();
            } catch (Exception e) {
                System.out.println("Podano złą wartość. Spróbuj jeszcze raz.");
            }
        } while(true);
    }

    public static String getValueString() {
        Scanner consoleInput = new Scanner(System.in);

        return consoleInput.nextLine();
    }
}
