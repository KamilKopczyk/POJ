package Zlekcji;

public class Figura2D implements FiguraGeometryczna {
    private String name;

    double a;

    @Override
    public double Pole() {
        return a*a;
    }

    @Override
    public double Obwod() {
        return 4*a;
    }

}
