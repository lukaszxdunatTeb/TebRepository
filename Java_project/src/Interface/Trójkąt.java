package Interface;
import Interface.Figura;



public class Trójkąt implements Figura
{
    private final double a,b,c;       /// długość boków a,b,c

    public Trójkąt(double a , double b , double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }




    @Override
    public double Obwód() {


        return a+b+c ;
    }


    @Override
    public double PolePowierzchni() {
        double pole=(a+b+c)/2;
        System.out.println(" Pole Powierzchni to :"+ pole);
         return Math.sqrt(pole*(pole*a)*(pole*b)*(pole*c));

    }




}
