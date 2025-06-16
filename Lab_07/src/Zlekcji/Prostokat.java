package Zlekcji;

public class Prostokat extends Figura {

    double  a , b;


    public Prostokat(String name){
        super(name);

    }


    @Override
    public double Pole() {
        return a * b;
    }

    @Override
    public double Obwod() {
        return (2*a)+(2*b);
    }
}
