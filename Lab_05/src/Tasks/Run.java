package Tasks;

import java.util.Scanner;

public class Run {

    //obiekt klasy tasks
    TasksLab05 tasksLab05 = new TasksLab05();
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
        System.out.println("5. Exit");
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
                tasksLab05.Task004();
                break;

            case 5:
                CloseProgramRun();
                break;


            default:
                System.out.println("Błedne dane. Wybierz ponownie");
                break;
        }

    }// koniec metody menu


    private void Task001Run(){

        tasksLab05.Task001();


    }

    private void Task002Run(){

        tasksLab05.Task002();

    }

    private void Task003Run(){

        tasksLab05.Task003();

    }

    private void Task004Run(){


    }
    private void CloseProgramRun(){

        tasksLab05.CloseProgram();

    }

}// koniec klasy
