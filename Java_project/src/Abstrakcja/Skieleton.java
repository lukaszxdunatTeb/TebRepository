package Abstrakcja;

public class Skieleton extends Monster { // klasa dziedziczaca po klasie Monster (Posiada wszyskie metody i pola klasy Monster)

    private String weapon;
    public Skieleton(double HP, String name, String weapon) {
        super(HP, name); // to jest wywołanie konstruktora z klasy Monster
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
