package Interface;

import Interface.Figura;

public class Okrąg implements Figura
{
    private final double promień;

    public Okrąg(double promień) {
        this.promień = promień;
    }

    @Override
    public double Obwód() {
        return Math.PI * Math.pow(promień, 2);

    }

    @Override
    public double PolePowierzchni() {
        return Math.PI *Math.pow(promień , 2);
    }


    }

