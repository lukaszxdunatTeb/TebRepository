package Interface;

import Interface.Figura;

public class Prostokąt implements Figura {
    private final double a,b;

    public Prostokąt(double a , double b ) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double Obwód() {

        return  2*(a*b);

    }

    @Override
    public double PolePowierzchni() {
        return a*b;

    }



    }

