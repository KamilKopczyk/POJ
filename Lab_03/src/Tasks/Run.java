package Tasks;

import java.util.Scanner;

public class Run {


    TasksLab03 tasksLab03 = new TasksLab03();

    InputData inputData = new InputData();

    public void RunMain() {

        Menu();
    }

    private void Menu() {
        System.out.println("1. Task 1");
        System.out.println("2. Task 2");
        System.out.println("3. Task 3");
        System.out.println("4. Task 4");
        System.out.println("5. Task 5");
        System.out.println("6. Exit");
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
                CloseProgramRun();
                break;


            default:
                System.out.println("Błedne dane. Wybierz ponownie");
                break;
        }

    }



    private void Task001Run(){

        System.out.println("Podaj liczbę studentów: ");
        int n01 = inputData.InputInt();
        tasksLab03.Task001(n01,0);

    }

    private void Task002Run(){

        tasksLab03.Task002();

    }

    private void Task003Run(){

        System.out.println("Podaj długość ciągu: ");
        int n02 = inputData.InputInt();
        tasksLab03.Task003(n02);}


        private void Task004Run(){


            System.out.println("Podaj ilość liczb jaką chcesz wylosować: ");
            int n03 = inputData.InputInt();
            tasksLab03.Task004(n03);


    }

    private void Task005Run(){

        inputData.input.nextLine();
        System.out.println("Podaj jakie słowo chcesz sprawdzic pod względem bycia palindromem: ");
        String slowo = inputData.InputString();
        String wynik = tasksLab03.Task005(slowo);
        System.out.println(wynik);

    }

    private void CloseProgramRun(){


        tasksLab03.CloseProgram();
    }

}
