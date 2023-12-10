import Abstrakcja.Dragon;
import Abstrakcja.Skieleton;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Skieleton skieleton = new Skieleton(100, "Szkielet nr. 1", "Sword"); // stworzenie szkieleta za pomoca konstrutkora parametrycznego
        skieleton.setHP(10);
        skieleton.move();
        out.println(skieleton.getWeapon());

        Dragon dragon = new Dragon(50, "Smok nr.1");
        out.println(dragon.getName());
        dragon.move();
    }
}