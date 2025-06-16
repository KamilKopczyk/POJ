package Tasks.Figury;

public class Figura {


    Punkt punkt;
    String kolor = "bialy";


    Figura(){
        punkt = new Punkt(0,0);
    }
    public Figura(String kolor){
        this.kolor=kolor;
    }
    Figura(Punkt punkt){
        this.punkt=punkt;
    }
    String getKolor(){
        return kolor;
    }
    public String opis(){
        return "Klasa Figura. Kolor obiektu: "+kolor;
    }


}