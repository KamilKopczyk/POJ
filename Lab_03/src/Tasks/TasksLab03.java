package Tasks;

import java.util.Random;

public class TasksLab03 {

    public void Task001(int n01, double pkt01){

        double suma = 0;
        int i = 0;

        while (n01 > i) {
            System.out.print("Podaj liczbę punktów dla studenta " + (i + 1) + ": ");
            InputData inputData = new InputData();
            pkt01 = inputData.InputDouble();
            suma += pkt01;
            i++;
        }

        System.out.println("Suma pkt dla grupy wynosi: " + suma + " ");
        System.out.println("Średnia pkt dla grupy wynosi: " + (suma / n01) + " ");



    }



    public void Task002(){

        int ilosc_liczb_ujemnych = 0;
        int ilosc_liczb_dodatnich = 0;
        int suma_liczb_ujemnych = 0;
        int suma_liczb_dodatnich = 0;

        int i = 0;

        while (10 > i) {
            System.out.print("Podaj liczbę numer " + (i + 1) + ": ");
            InputData inputData = new InputData();
            int liczba = inputData.InputInt();
            if (liczba < 0) {
                ilosc_liczb_ujemnych++;
                suma_liczb_ujemnych += liczba;
            } else {
                ilosc_liczb_dodatnich++;
                suma_liczb_dodatnich += liczba;
            }
            i++;

        }

        System.out.println("Ilość liczb ujemnych wynosi: " + ilosc_liczb_ujemnych + " ");
        System.out.println("Suma liczb ujemnych wynosi: " + suma_liczb_ujemnych + " ");
        System.out.println("Ilość liczb dodatnich wynosi: " + ilosc_liczb_dodatnich + " ");
        System.out.println("Suma liczb dodatnich wynosi: " + suma_liczb_dodatnich + " ");

    }
    public void Task003(int n02){

        int i = 0;
        double suma = 0;
        while (n02 > 0) {

            System.out.println("Podaj " + (i + 1) + " wyraz ciągu liczbowego:");
            InputData inputData = new InputData();
            int liczba = inputData.InputInt();
            if (liczba % 2 == 0) {

                suma += liczba;
            }i++;n02--;
        }

        System.out.println("Suma liczb parzystych wynosi: " + suma + " ");

    }
    public void Task004(int n03){

        int i = 0;
        int suma = 0;

        Random rand = new Random();
        System.out.println(rand.nextInt(55)-10 );

        while (n03 > 0) {
            int liczba = rand.nextInt(55)-10;
            System.out.println("Wylosowana liczba to: " + liczba);
            if (liczba % 2 == 0) {
                suma += liczba;
            }
            i++;
            n03--;
        }

        System.out.println("Suma liczb parzystych wynosi: " + suma + " ");

    }

    protected String Task005(String slowo){

            int length = slowo.length();

            for (int i = 0; i < length / 2; i++) {
                if (slowo.charAt(i) != slowo.charAt(length - i - 1)) {
                    return "Podane słowo nie jest palindromem.";
                }
            }
            return "Podane słowo jest palindromem.";


    }

    public void CloseProgram(){

        System.out.println("Zamykanie programu");
        System.exit(0);


    }
}