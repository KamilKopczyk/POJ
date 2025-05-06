package Tasks;

import java.util.Scanner;

public class WprowadzStudenta {

    public Student newStudent;
    InputData input = new InputData();

    public void WprowadzRun() {

        System.out.println("Podaj imię :");
        String firstname = input.InputString();
        System.out.println("Podaj nazwisko: ");
        String lastname = input.InputString();
        System.out.println("Podaj wiek: ");
        int age = input.InputInt();
        System.out.println("Podaj nrAlbumu: ");
        int nrAlbumu = input.InputInt();
        input.input.nextLine();
        System.out.println("Podaj kierunek: ");
        String kierunek = input.InputString();
        System.out.println("Podaj specjalność");
        String specjalnosc = input.InputString();
        System.out.println("Podaj rok studiów");
        int rokStudiow = input.InputInt();

        newStudent = new Student(new Person(firstname ,lastname ,age ), nrAlbumu, kierunek, specjalnosc, rokStudiow);
        System.out.println("Dane wprowadzonego studenta: ");
        newStudent.viewData2();

    }

    public Student getNewStudent() {
        return newStudent;

    }
}




