package Tasks;

public class Student {

    Person person;
    private int nrAlbumu;
    private String kierunek;
    private String specjalnosc;
    private int rokStudiow;

    // pelne dane
    public Student(Person person, int nrAlbumu, String kierunek, String specjalnosc, int rokStudiow) {
        this.person = person;
        this.nrAlbumu = nrAlbumu;
        this.kierunek = kierunek;
        this.specjalnosc = specjalnosc;
        this.rokStudiow = rokStudiow;
    }
    //dane bez person
    public Student(int nrAlbumu, String kierunek, String specjalnosc, int rokStudiow) {

        this.nrAlbumu = nrAlbumu;
        this.kierunek = kierunek;
        this.specjalnosc = specjalnosc;
        this.rokStudiow = rokStudiow;
    }
    //dane bez specjalnosci i roku
    public Student(Person person, int nrAlbumu, String kierunek) {
        this.person = person;
        this.nrAlbumu = nrAlbumu;
        this.kierunek = kierunek;
        this.specjalnosc = "nieznana";
        this.rokStudiow = 1;
    }
    //dane bez nralbumu i roku
    public Student(Person person, String kierunek, String specjalnosc) {
        this.person = person;
        this.kierunek = kierunek;
        this.specjalnosc = specjalnosc;
        this.nrAlbumu = nrAlbumu ;
        this.rokStudiow = 1;
    }

    public void viewData2(){

        person.viewData1();

        System.out.println(" Nr albumu: "+nrAlbumu+
                " Kierunek: " +kierunek+
                " Specjaloność: " + specjalnosc +
                " Rok studiów: " + rokStudiow
        );


    }

}

