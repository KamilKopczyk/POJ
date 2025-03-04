package Tasks;

import java.util.Random;

public class TasksLab01 {

    protected String Task001(String name,int age){
        return "Imię: " + name + "Wiek: " + age;
    }

    public void Task002(double value01, double value02){
      double sum = value01 + value02;
      double diff = value01 - value02;
      double product = value01 * value02;
      double quotient = 1;
      if (value02 != 0) {

          quotient = (value01 / value02);
          System.out.println("Iloraz: " + quotient);

      }else{

          System.out.println("Nie można dzielić przez zero");

      }

    System.out.println("Suma: " + sum);
      System.out.println("Różnica: " + diff);
      System.out.println("Iloczyn: " + product);





    }
    public void Task003(int value03){

        System.out.println("Podana liczba to: " + value03);



        System.out.println(value03 % 2 == 0 );



    }
    public void Task004(int value04){

        System.out.println("Podana liczba to: " + value04);


            System.out.println(value04 % 3 == 0 && value04 % 5 == 0);


    }
    public void Task005(int value05){

        System.out.println("Podana liczba to: " + value05);
        int power01 = (int) Math.pow(value05, 3);
        System.out.println("Podana liczba podniesiona do 3 potęgi:  " + power01);

    }
    public void Task006(double value06){

        System.out.println("Podana liczba to: " + value06);
        double power02 = Math.sqrt(value06);
        System.out.println("Pierwiastek kwadratowy podanej liczby: " + power02);

    }
    public void Task007(int a, int b){

        System.out.println("Podane zakresy to: " + a + " - " + b);

        Random random = new Random();
        int randomNumber01 = random.nextInt(b - a + 1) + a;
        System.out.println("Wylosowana liczba z zakresu: " + randomNumber01);
        int randomNumber02 = random.nextInt(b - a + 1) + a;
        System.out.println("Wylosowana liczba z zakresu: " + randomNumber02);
        int randomNumber03 = random.nextInt(b - a + 1) + a;
        System.out.println("Wylosowana liczba z zakresu: " + randomNumber03);

        System.out.println("Sprawdzenie czy z wylosowanych liczb można utworzyć trójkąt prostokątny ");

        System.out.println(randomNumber01 != randomNumber02 && randomNumber02 != randomNumber03 && randomNumber01 != randomNumber03);

    }
    public void CloseProgram(){

        System.out.println("Zamykanie programu");
        System.exit(0);


    }

}
