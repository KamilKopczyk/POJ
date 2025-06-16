package Zlekcji;


public abstract class Figura {

    protected String name;
    public void view(){

        System.out.println("Zlekcji.Figura: " + name);
        System.out.println("Pole: " + Pole());
        System.out.println("Obwod: " + Obwod());

    }

    public abstract double Pole();
    public abstract double Obwod();

    public Figura(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

}
