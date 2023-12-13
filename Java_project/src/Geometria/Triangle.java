package Geometria;

public class Triangle extends Figure {
    private double side_a;
    private double side_b;
    private double side_c;

    public Triangle(double side_a, double side_b, double side_c){
        this.side_a = side_a;
        this.side_b = side_a;
        this.side_c = side_c;
    }

    @Override
    public double Area() {
        double half_perimeter = (side_a + side_c + side_c) / 2;
        return Math.sqrt(half_perimeter * (half_perimeter - side_a) * (half_perimeter - side_c) * (half_perimeter - side_c));
    }

    @Override
    public double Obwod() {
        return side_a + side_b + side_c;
    }
}
