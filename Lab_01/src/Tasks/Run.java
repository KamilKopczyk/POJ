package Tasks;

import java.util.Scanner;

public class Run {

    //obiekt klasy tasks
    TasksLab01 tasksLab01 = new TasksLab01();
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
        System.out.println("7. Task 7");
        System.out.println("8. Exit");
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
                Task007Run();
                break;

        case 8:
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
        System.out.println("Podaj swoje imie ");
        String name = inputData.InputString();
        System.out.println("Podaj swój wiek ");
        int age = inputData.InputInt();
        tasksLab01.Task001(name,age);
        String result = tasksLab01.Task001(name,age);
        System.out.println(result);

    }

    private void Task002Run(){

        System.out.println("Podaj liczbę: ");
        double value01 = inputData.InputDouble();
        System.out.println("Podaj liczbę: ");
        double value02 = inputData.InputDouble();
        tasksLab01.Task002(value01,value02);


    }

    private void Task003Run(){

        System.out.println("Podaj liczbę którą chcesz sprawdzić czy jest parzysta: ");
        int value03 = inputData.InputInt();
        tasksLab01.Task003(value03);
    }

    private void Task004Run(){

        System.out.println("Podaj liczbę którą chcesz sprawdzić czy jest podzielna przez 3 i 5: ");
        int value04 = inputData.InputInt();
        tasksLab01.Task004(value04);

    }

    private void Task005Run(){

        System.out.println("Podaj liczbę którą chcesz podnieść do potęgi 3: ");
        int value05 = inputData.InputInt();
        tasksLab01.Task005(value05);

    }

    private void Task006Run(){

        System.out.println("Podaj liczbę której chcesz wyciagnąć pierwiastek kwadratowy: ");
        double value06 = inputData.InputDouble();
        tasksLab01.Task006(value06);

    }

    private void Task007Run(){

        System.out.println("Podaj dolny limit zakresu liczb z którego program ma wylosować 3 wartości żeby stworzyć trójkąt prostokątny: ");
        int a = inputData.InputInt();
        System.out.println("Podaj górny limit zakresu liczb z którego program ma wylosować 3 wartości żeby stworzyć trójkąt prostokątny: ");
        int b = inputData.InputInt();
        tasksLab01.Task007(a,b);

    }

    private void CloseProgramRun(){


        tasksLab01.CloseProgram();
    }

}// koniec klasy
