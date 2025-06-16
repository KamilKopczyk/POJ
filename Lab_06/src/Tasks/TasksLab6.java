package Tasks;

import Tasks.Figury.*;
import Tasks.Vehicles.*;
import Tasks.Biblio.*;

public class TasksLab6 {
    Punkt punkt = new Punkt(5,8);
    Punkt punkt1 = new Punkt(3,6);
    Punkt punkt2 = new Punkt(8,11);


    public void Task01(){

        punkt.opis();
        punkt1.opis();
        punkt2.opis();

        System.out.println("----------");
        punkt.przesuniecie(3,1);
        punkt1.przesuniecie(1,2);
        punkt2.przesuniecie(-2,-3);
        punkt.opis();
        punkt1.opis();
        punkt2.opis();

        System.out.println("\n9. Figura");
        Figura figura = new Figura("zolty");
        System.out.println(figura.opis());

        System.out.println("\n9. Prostokat");
        Prostokat prostokat = new Prostokat(3,4);
        System.out.println("Powierzchnia: "+prostokat.getPowierzchnia());

        System.out.println("\n9. Trojkat");
        Trojkat trojkat = new Trojkat(2,4);
        System.out.println("Wysokosc: "+trojkat.wys);
        System.out.println("Podstawa: "+trojkat.podst);

        System.out.println("\n15. Prostokat");
        Prostokat prostokat1 = new Prostokat(3,4);
        prostokat1.przesun(2,4);
        System.out.println("Lokalizacja po przesunieciu: ["+punkt.getX() + ", " + punkt.getY()+"]");

        System.out.println("\n17. Kwadrat");
        Kwadrat kwadrat = new Kwadrat(6);
        System.out.println("Bok kwadratu: "+kwadrat.getBok());
        System.out.println("Powierzchnia kwadratu: "+kwadrat.getPowierzchnia());

        System.out.println("\n19.");
        System.out.println(kwadrat.opis());
        System.out.println(trojkat.opis());
        System.out.println(prostokat.opis());
        System.out.println(figura.opis());

        Okrag okrag = new Okrag();
        okrag.setPromien(6);
        System.out.println("\nPole powierzchni okregu: "+ okrag.getPowierzchnia());
    }

    public void Task02(){

        Samochod samochod1 = new Samochod("BMW", "M5", "C", "Czarny", 2014, 120000);
        samochod1.opis();
        System.out.println("-------");
        Samochod samochod2 = new Samochod("Toyota", "Supra", "D", "Biały", 2006, 110000);
        samochod2.opis();
        System.out.println("-------");
        Samochod samochod3 = new SamochodOsobowy("Mercedes", "SLS", "A", "Czerwony", 2019, 1000000, 2.2f, 0.9f, 4);
        samochod3.opis();
    }

    public void Task03(){
        Ksiegarnia ksiegarnia = new Ksiegarnia("Ksiegarnia");

        Ksiazka powiesc1 = new Powiesc("HOBBIT czyli tam i z powrotem","J.R.R. Tolkien", 20.99, "Fantasy");
        Ksiazka podrecznik1 = new Podrecznik("Java podstawy","<AUTOR>", 39.99, "Informatyka");

        ksiegarnia.dodajKsiazke(powiesc1);
        ksiegarnia.dodajKsiazke(podrecznik1);

        ksiegarnia.dodajKlienta(new Klient("Adam", "Lampa"));
        ksiegarnia.dodajKlienta(new Klient("Kamil", "Kowalski"));

        ksiegarnia.opisKsiegarnia();
    }
}