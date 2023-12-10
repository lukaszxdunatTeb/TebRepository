package Abstrakcja;

public class Dragon extends Monster {
    public Dragon(double HP, String name) {
        super(HP, name);
    }
    @Override
    public void move() { // metoda przeciązona - "nadpisana"
        super.move();  // zostanie wywołana metoda z klasy monster( klasa monster jest klasą nadrzedną) // super-wywołuje ... z klasy nadrzędnej.
        System.out.println("również może latać");
    }
}
