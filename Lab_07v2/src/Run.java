public class Run {

    public void RunMain() {

        Pojazd samochod = new Samochod("Toyota", "S001");
        Pojazd rower = new RowerElektryczny("Giant", "RE001");
        Pojazd hulajnoga = new HulajnogaElektryczna("Xiaomi", "HE001");

        Menu();

    }
    void Menu() {

        System.out.println("==========Menu==========");
        System.out.println("Wypożycz pojazd");
        System.out.println("Zwróc pojazd");
        System.out.println("Oblicz koszt wynajmu");
        System.out.println("Sprawdz dostępne pojazdy");
        System.out.println("==========Exit==========");
        int choose = inputData.InputInt();
        switch (choose) {
            case 1:

                break;
            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            case 5:

                break;
        }


    private void wypozycz(Pojazd pojazd) {
        System.out.println("Wypożyczono pojazd: " + pojazd.marka + " " + pojazd.id);
    }

    private void zwroc(Pojazd pojazd) {
        System.out.println("Zwrócono pojazd: " + pojazd.marka + " " + pojazd.id);
    }

    private void obliczCene(Pojazd pojazd, int liczbagodzin) {
        System.out.println("Cena za wypożyczenie: " + pojazd.ObliczCene(liczbagodzin));
    }







}
