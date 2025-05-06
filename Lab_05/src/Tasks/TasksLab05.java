package Tasks;

public class TasksLab05 {


    public void Task001(){

        Person person1 = new Person();
        Person person2 = new Person("Kamil \n", "Kopczyk \n", 21);
        Person person3 = new Person("Paweł \n", 28);


        person1.viewData1();
        System.out.println("\n");
        person2.viewData1();
        System.out.println("\n");
        person3.viewData1();

    }

    public void Task002(){

        Student student1 = new Student(new Person(" Adam \n"," Wilk \n",19),134921,"Informatyka","Bazy danych",1 );

        Student student2 = new Student(new Person (),134901," Archeologia ","X do XII w",2);

        Student student3 = new Student(new Person(" Jan \n"," Kowal \n",25),134945,"Matematyka");

        Student student4 = new Student(new Person(" Anna \n"," Lak \n",21),"Masażysta","Fizjoterapia");


        student1.viewData2();
        System.out.println("\n");
        student2.viewData2();
        System.out.println("\n");
        student3.viewData2();
        System.out.println("\n");
        student4.viewData2();





    }

    public void Task003(){

        WprowadzStudenta nowy = new WprowadzStudenta();
        nowy.WprowadzRun();


    }

    public void Task004() {
        DzialaniazStudentami zarzadzanie = new DzialaniazStudentami();
        InputData input = new InputData();
        boolean dzialaj = true;

        while (dzialaj) {
            System.out.println("Co chcesz zrobić z studentami?");
            System.out.println("1. Wprowadź dane studenta");
            System.out.println("2. Edytuj dane studenta");
            System.out.println("3. Usuń dane studenta");
            System.out.println("4. Wyświetl dane studenta");
            System.out.println("5. Wyświetl wszystkich studentów");
            System.out.println("6. Wyświetl studentów w podanym zakresie");
            System.out.println("7. Wyjdź z programu");
            int choice = input.InputInt();

            switch (choice) {
                case 1:
                    System.out.println("Podaj indeks, pod którego chcesz dodać studenta:");
                    int index = input.InputInt();
                    zarzadzanie.wprowadzStudenta(index);
                    break;

                case 2:
                    System.out.println("Podaj indeks studenta, który chcesz edytować:");
                    int indexEdycja = input.InputInt();
                    if (indexEdycja >= 0 && indexEdycja < 100) {
                        System.out.println("Wprowadź nowe dane studenta:");
                        System.out.println("Podaj imię:");
                        input.input.nextLine(); // Czyszczenie bufora
                        String imie = input.InputString();
                        System.out.println("Podaj nazwisko:");
                        String nazwisko = input.InputString();
                        System.out.println("Podaj wiek:");
                        int wiek = input.InputInt();
                        System.out.println("Podaj kierunek:");
                        input.input.nextLine(); // Czyszczenie bufora
                        String kierunek = input.InputString();
                        System.out.println("Podaj specjalność:");
                        input.input.nextLine(); // Czyszczenie bufora
                        String specjalnosc = input.InputString();
                        System.out.println("Podaj rok studiów:");
                        int rokStudiow = input.InputInt();
                        zarzadzanie.edytujStudenta(imie, nazwisko, wiek, indexEdycja, specjalnosc, rokStudiow);
                    } else {
                        System.out.println("Błędny indeks.");
                    }
                    break;

                case 3:
                    System.out.println("Podaj indeks studenta, którego chcesz usunąć:");
                    int indexUsuniecia = input.InputInt();
                    zarzadzanie.usunStudenta(indexUsuniecia);
                    break;

                case 4:
                    System.out.println("Podaj indeks studenta, którego chcesz wyświetlić:");
                    int indexWyswietlania = input.InputInt();
                    zarzadzanie.wyswietlStudenta(indexWyswietlania);
                    break;

                case 5:
                    zarzadzanie.wyswietlWszystkichStudentow();
                    break;

                case 6:
                    System.out.println("Podaj początek zakresu:");
                    int poczatekZakresu = input.InputInt();
                    System.out.println("Podaj koniec zakresu:");
                    int koniecZakresu = input.InputInt();
                    zarzadzanie.wyswietlZakresStudentow(poczatekZakresu, koniecZakresu);
                    break;

                case 7:
                    System.out.println("Zamknięcie programu.");
                    dzialaj = false;
                    break;

                default:
                    System.out.println("Zły wybór. Spróbuj jeszcze raz.");
                    break;
            }
        }
    }

    public void CloseProgram(){

        System.out.println("Zamykanie programu");
        System.exit(0);


    }

}