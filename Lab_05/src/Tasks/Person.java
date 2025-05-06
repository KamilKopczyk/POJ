package Tasks;

public class Person{

        private String firstname, lastname;
        private int age;



    public Person(String firstname, String lastname, int age) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;

    }

    public Person(String firstname,int age){

        this.firstname = firstname;
        this.lastname = "Nieznane \n";
        this.age = age;

    }

    public Person(){

        this.firstname = "Nieznane \n";
        this.lastname =  "Nieznane \n";
        this.age = 0;

    }

    public void viewData1(){

        System.out.println(" Imię: " +firstname+
                        " Nazwisko: "+lastname+
                        " Wiek: "+age
        );


    }


}
