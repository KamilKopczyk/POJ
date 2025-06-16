public class Samochod extends Pojazd {

    public Samochod(String marka, String id) {
        super(marka, id);
    }

    public double ObliczCene(int liczbagodzin) {
        return liczbagodzin * 100;
    }


}
