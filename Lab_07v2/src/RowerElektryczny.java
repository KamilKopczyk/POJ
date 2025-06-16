public class RowerElektryczny extends Pojazd implements PojazdyElektryczne{

    private int poziomBaterii;

    public RowerElektryczny(String marka, String id) {
        super(marka, id);
        this.marka = marka;
        this.id = id;
    }


    @Override
    public int poziomBaterii() {
        return poziomBaterii;
    }

    @Override
    public void ladowanieBaterii() {

        poziomBaterii = 100;

    }


    public double ObliczCene(int liczbagodzin) {
        return liczbagodzin * 5;
    }
}
