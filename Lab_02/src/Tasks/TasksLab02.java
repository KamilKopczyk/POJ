package Tasks;

public class TasksLab02 {

    public void Task001(double a01, double b01, double c01){

        if (a01 == 0) {

            System.out.println("Wartość a nie może wynosić 0");
            System.exit(0);
}
        System.out.println("Podane paramnetry to: " + a01 + " " + b01 + " " + c01);

        double delta = b01 * b01 - 4 * a01 * c01;

        if (delta > 0) {

            double pierwiastek1 = (-b01 + Math.sqrt(delta)) / (2 * a01);
            double pierwiastek2 = (-b01 - Math.sqrt(delta)) / (2 * a01);
            System.out.println("Równanie ma dwa rzeczywiste pierwiastki: " + pierwiastek1 + " i " + pierwiastek2);
        } else if (delta == 0) {

            double pierwiastek = -b01 / (2 * a01);
            System.out.println("Równanie ma jeden pierwiastek: " + pierwiastek);
        } else {

            double czescRzeczywista = -b01 / (2 * a01);
            double czescUrojona = Math.sqrt(-delta) / (2 * a01);
            System.out.println("Równanie ma dwa pierwiastki zespolone: " +
                    czescRzeczywista + " + " + czescUrojona + "i oraz " +
                    czescRzeczywista + " - " + czescUrojona + "i");
        }
    }



    public void Task002(double xa, double xb, double xc){

    if (xa == 0) {

        System.out.println("a("+xa+") == 0");
        
    } else if (xa > 0) {

        System.out.println("a("+xa+") = "+ 2 * + xa + " ");
        
    } else if (xa < 0) {

        System.out.println("a("+xa+") = "+ -3 * + xa + " ");

    }

        if (xb >= 0) {

            System.out.println("b("+xb+") = "+ Math.pow(xb,2) + " ");

        }else if (xb < 0) {

            System.out.println("b("+xb+") = "+ xb + " ");

        }

        if (xc == 2) {

            System.out.println("c("+xc+") == 8");

        } else if (xc > 2) {

            System.out.println("c("+xc+") = "+ (2 + xc) + " ");

        } else if (xc < 2) {

            System.out.println("a("+xa+") = "+ xa + -4 +" ");

        }

    }
    public void Task003(int x01, int y01 , int z01){

        System.out.println("Wartości podanych liczb to: " + x01 + " " + y01 + " " + z01);

        int [] sortowanie = {x01,y01,z01};

        java.util.Arrays.sort(sortowanie);

        System.out.println("Posortowane liczby to: " + sortowanie[0] + " " + sortowanie[1] + " " + sortowanie[2]);

    }
        public void Task004(int zdanie01, int zdanie02){

        if(zdanie01 == 1 && zdanie02 == 1){

            System.out.println("Weź parasol,Dostaniesz się na uczelnie");

        }else if(zdanie01 != 1  && zdanie02 == 1){

            System.out.println("Dostaniesz się na uczelnie, Miłego dnia i pięknej pogody");

        }else if(zdanie01 == 1 && zdanie02 != 1){

            System.out.println("Nie dostaniesz się na uczelnię");

        }else {

            System.out.println("Możesz wprowadzić tylko 1 i 0");

        }

    }

    public void Task005(int zdanie03, int zdanie04){

        if(zdanie03 == 1 || zdanie04 == 1){


            System.out.println("Możesz kupić samochód !");


        } else if (zdanie03 != 1 || zdanie04 != 1) {

            System.out.println("Zakup samochód trzeba odłożyć na później...\n" + "Zniżki na samochód nie ma");

        } else if (zdanie03 !=1 || zdanie04 == 1) {


            System.out.println("„Możesz kupić samochód ! \n Zniżki na samochód nie ma");
            
        }else {

            System.out.println("Możesz wprowadzić tylko 1 i 0");

        }

    }

    public void Task006(int choose01,double value03,double value04){

        switch (choose01) {
            case 1:

                    System.out.println(value03 + " + " + value04 + " = " + (value03 + value04) );

                break;
            case 2:

                System.out.println(value03 + " - " + value04 + " = " + (value03 - value04));

                break;

            case 3:

                System.out.println(value03 + " * " + value04 + " = " + (value03 * value04));

                break;

            case 4:

                System.out.println(value03 + " / " + value04 + " = " + (value03 / value04));

                break;

            case 5:

                System.out.println(value03 + " % " + value04 + " = " + (value03 % value04));

                break;

            default:
                System.out.println("Błedne dane. Wybierz ponownie");
                break;

        }
    }

    public void CloseProgram(){

        System.out.println("Zamykanie programu");
        System.exit(0);


    }
        }