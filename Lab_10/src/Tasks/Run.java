package Tasks;

import java.util.Scanner;

public class Run {

    //obiekt klasy tasks
    TasksLab10 tasksLab10 = new TasksLab10();
    // obiekt klasy Inputdata
    InputData inputData = new InputData();

    public void RunMain() {

        Menu();
    } // koniec metody runmain

    private void Menu() {
        System.out.println("1. Task 1");
        System.out.println("2. Task 2");
        System.out.println("3. Task 3");
        System.out.println("4. Exit");
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
                CloseProgramRun();
                break;


        default:
                System.out.println("Błedne dane. Wybierz ponownie");
                break;
        }

    }// koniec metody menu

//metoda uruchomieniowa do  task002

    private void Task001Run(){

        tasksLab10.Task001();

    }

    private void Task002Run(){

        System.out.println("Podaj liczbę: ");
        double value01 = inputData.InputDouble();
        System.out.println("Podaj liczbę: ");
        double value02 = inputData.InputDouble();
        tasksLab10.Task002(value01,value02);


    }

    private void Task003Run(){

        System.out.println("Podaj liczbę którą chcesz sprawdzić czy jest parzysta: ");
        int value03 = inputData.InputInt();
        tasksLab10.Task003(value03);
    }
    private void CloseProgramRun(){


        tasksLab10.CloseProgram();
    }

}// koniec klasy
