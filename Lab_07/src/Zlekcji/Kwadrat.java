package Zlekcji;

public class Kwadrat extends Figura {

    double a = 2;


    public Kwadrat(String name){
        super(name);

    }

    @Override
    public double Pole() {
        return a*a;
    }

    @Override
    public double Obwod() {
        return 4*a;
    }

//    @Override
//    public void view() {
//        System.out.println("Zlekcji.Kwadrat o boku: " + a);
//        System.out.println("Pole: " + Pole());
//        System.out.println("Obwod: " + Obwod());
//    }



}
