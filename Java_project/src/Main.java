import Interface.Dragon;
import Interface.Skieleton;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Skieleton skieleton = new Skieleton("Sword"); // Stworzenie szkieleta za pomoca konstruktora parametrycznego
        skieleton.attack();
        skieleton.displayDescription();

        Dragon dragon = new Dragon(50); // Stworzenie smoka za pomoca konstruktora parametrycznego
        out.println(dragon.getAge()); // pobranie wieku za pomoca gettera
        dragon.setName("Władek");  // ustawienie imienia za pomoca settera
        dragon.displayDescription();
    }
}