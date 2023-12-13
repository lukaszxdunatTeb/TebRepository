package Geometria;

public class Rectangle extends Figure {
    private double side_a;
    private double side_b;
    public Rectangle(double side_a, double side_b){
        this.side_a = side_a;
        this.side_b = side_b;
    }

    @Override
    public double Area() {
        return side_b * side_a;
    }

    @Override
   public double Obwod() {
        return 2*(side_a + side_b);
    }
}
