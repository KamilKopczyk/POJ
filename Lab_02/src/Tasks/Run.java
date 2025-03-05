package Tasks;

import java.util.Scanner;

public class Run {

    //obiekt klasy tasks
    TasksLab02 tasksLab02 = new TasksLab02();
    // obiekt klasy Inputdata
    InputData inputData = new InputData();

    public void RunMain() {

        Menu();
    } // koniec metody runmain

    private void Menu() {
        System.out.println("1. Task 1");
        System.out.println("2. Task 2");
        System.out.println("3. Task 3");
        System.out.println("4. Task 4");
        System.out.println("5. Task 5");
        System.out.println("6. Task 6");
        System.out.println("7. Exit");
        System.out.println("Select a task: ");
        int choose = inputData.InputInt();
        switch (choose){
            case 1:
                Task001Run();
                break;
            case 2:
                Task002Run();
                break;

            case 3:
                Task003Run();
                break;

            case 4:
                Task004Run();
                break;

            case 5:
                Task005Run();
                break;

            case 6:
                Task006Run();
                break;

            case 7:
                CloseProgramRun();
                break;


            default:
                System.out.println("Błedne dane. Wybierz ponownie");
                break;
        }

    }// koniec metody menu

//metoda uruchomieniowa do  task002

    private void Task001Run(){

        inputData.input.nextLine();
        System.out.println("Podaj wartość a:  ");
        double a01 = inputData.InputDouble();
        System.out.println("Podaj wartość b:  ");
        double b01 = inputData.InputDouble();
        System.out.println("Podaj wartość c:  ");
        double c01 = inputData.InputDouble();
        tasksLab02.Task001(a01,b01,c01);
    }

    private void Task002Run(){

        System.out.println("Podaj wartość x dla funkcji a(x): ");
        double xa = inputData.InputDouble();
        System.out.println("Podaj wartość x dla funkcji b(x): ");
        double xb = inputData.InputDouble();
        System.out.println("Podaj wartość x dla funkcji c(x): ");
        double xc = inputData.InputDouble();
        tasksLab02.Task002(xa,xb,xc);


    }

    private void Task003Run(){

        System.out.println("Podaj wartość x: ");
        int x01 = inputData.InputInt();
        System.out.println("Podaj wartość y: ");
        int y01 = inputData.InputInt();
        System.out.println("Podaj wartość z: ");
        int z01 = inputData.InputInt();
        tasksLab02.Task003(x01,y01,z01);}


    private void Task004Run(){

        System.out.println("Czy pada deszcz jeśli tak to wprowadz 1 jeśli nie to wprowadz 0: ");
        int zdanie01 = inputData.InputInt();
        System.out.println("Jeśli jest autobus to wprowadz 1 jęsli nie to wprowadz 0: ");
        int zdanie02 = inputData.InputInt();
        tasksLab02.Task004(zdanie01,zdanie02);
    }

    private void Task005Run(){

        System.out.println("Jeśli jest zniżka na samochód to wprowadz 1 jesli nie to wprowadz 0: ");
        int zdanie03 = inputData.InputInt();
        System.out.println("Jeśli otrzymałeś premię to wprowadz 1 jesli nie to wprowadz 0:");
        int zdanie04 = inputData.InputInt();
        tasksLab02.Task005(zdanie03,zdanie04);

    }

    private void Task006Run(){

        System.out.println("Podaj pierwszą liczbę: ");
        double value03 = inputData.InputDouble();
        System.out.println("Podaj drugą liczbę: ");
        double value04 = inputData.InputDouble();
        System.out.println("1.Dodawanie");
        System.out.println("2.Odejmowanie");
        System.out.println("3.Iloczyn");
        System.out.println("4.Iloraz");
        System.out.println("5.Reszta z dzielenia");
        System.out.println("Podaj jakie działanie matematyczne chcesz wykonać: ");
        int choose01 = inputData.InputInt();
        tasksLab02.Task006(choose01,value03,value04);

    }

    private void CloseProgramRun(){


        tasksLab02.CloseProgram();
    }

}// koniec klasy
