package Geometria;

import static java.lang.Math.max;

public class Circle extends Figure {
    private  double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
   public double Area() {
        return 3.14 * radius * radius;
    }

    @Override
    public double Obwod() {
        return 2 * 3.14 * radius;
    }
}
