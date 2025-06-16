import java.security.KeyStore;

public abstract class Pojazd {

    protected String marka;
    protected String id;
    protected boolean Czydostepne;

    public Pojazd(String marka, String id) {
        this.marka = marka;
        this.id = id;
    }


    public void wypozyczPojazd() {

        Czydostepne = false;

    }


    public void zwrocPojazd() {

        Czydostepne = true;

    }

    public boolean Czyjestdostepny() {

        return Czydostepne;

    }

    public String getID() {

        return id;

    }

    public String getMarka(){

        return marka;

    }

    public double ObliczCene(int liczbagodzin) {

        return liczbagodzin * 100;

    }


}
