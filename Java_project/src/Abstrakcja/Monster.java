package Abstrakcja;

import static java.lang.System.out;
public abstract class Monster {  // klasa abstrakcyjna - nie jest mozliwe utworzenie obiektu typu Monster

    public Monster(double HP, String name) {
        this.HP = HP;
        this.name = name;
    }

    public double getHP() {
        return HP;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected double HP;
    protected String name;

    public void attack() {
        out.println("Metoda atakuj");
    }

    public void move() {
        out.println(this.getClass().getSimpleName() + " chodzi.");
    }
}
