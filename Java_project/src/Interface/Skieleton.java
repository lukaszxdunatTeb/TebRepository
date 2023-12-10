package Interface;

import static java.lang.System.out;

public class Skieleton implements Monster {

    private final String weapon; // to jest - this.weapon.  Zmienna nr. 1

    public Skieleton(String weapon) {
        System.out.println("To jest konstruktor");
        this.weapon = weapon; // Przypisuje do naszej zmiennej nr. 1 przypisuje wartość przekazaną podczas inicjalizacji(tworzenia) obiektu.
    }


    @Override
    public void attack() {
        System.out.println("Attack with: " + this.weapon);
    }

    @Override
    public void scream() {

    }

    @Override
    public void displayDescription() {
        out.println(getClass().getSimpleName() + " ma: " + this.weapon);
    }

}
