/*  Funkcje pobierania danych.
 * 
 * Stworozne w osobnym pliku dla zwiększenia czytelności kodu
 */

package Seweryn_Malisz_Zaliczenie;

import java.util.Scanner;

public class inputDataClass {
    public static double get_Value_Double() {
        do {
            try {
                Scanner consoleInput = new Scanner(System.in);
                
                return consoleInput.nextDouble();
            } catch (Exception e) {
                System.out.println("Podano złą wartość. Spróbuj jeszcze raz.");
            }
        } while(true);
    }

    public static int get_Value_Int() {
        do {
            try {
                Scanner consoleInput = new Scanner(System.in);
                
                return consoleInput.nextInt();
            } catch (Exception e) {
                System.out.println("Podano złą wartość. Spróbuj jeszcze raz.");
            }
        } while(true);
    }

    public static String get_Value_String() {
        Scanner consoleInput = new Scanner(System.in);
                
        return consoleInput.nextLine();
    }

}
