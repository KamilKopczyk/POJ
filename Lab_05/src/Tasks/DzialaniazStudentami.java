package Tasks;

public class DzialaniazStudentami {

    private Student[] studenci = new Student[100];

    public DzialaniazStudentami(){
        for (int i = 0; i < studenci.length; i++) {
            studenci[i] = new Student(new Person("","",0),0,"","",0);
        }

    }

    private Student newStudent;

    public Student getNewStudent() {
        return newStudent;
    }

    public void WprowadzRun() {
        // Implementation for student data input
        // This should populate the newStudent field
        newStudent = new Student(new Person("Nowy", "Student", 20), 0, "Informatyka", "Dzienne", 1);
    }

    public void wprowadzStudenta(int index) {
        if (index >= 0 && index < studenci.length) {
            DzialaniazStudentami dzialania = new DzialaniazStudentami();
            dzialania.WprowadzRun();
            studenci[index] = dzialania.getNewStudent();
            System.out.println("Dane studenta zostały wprowadzone i znajdują się pod indexem: " + index);
        } else {
            System.out.println("Nieprawidłowy index studenta");
        }
    }

    public void edytujStudenta (String firstname, String lastname, int age, int index, String specjalnosc, int rokStudiow) {
        if (index >= 0 && index < studenci.length) {
            studenci[index] = new Student(new Person(firstname, lastname, age), index, "", specjalnosc, rokStudiow);
            System.out.println("Dane studenta zostały zaktualizowane pod indexem: " + index);
        } else {
            System.out.println("Nieprawidłowy index studenta");
        }
    }

    public void usunStudenta(int index){
        if(index >= 0 && index < studenci.length){
            studenci[index] = new Student(new Person("","",0),0,"","",0);
            System.out.println("Student został usunięty pod indexem: "+index);
        } else{
            System.out.println("Nieprawidłowy index studenta");
        }
    }

    public void wyswietlStudenta(int index){
        if(index >= 0 && index < studenci.length){
            System.out.println("Student pod indexem: "+index);
            studenci[index].viewData2();
        } else{
            System.out.println("Nieprawidłowy index studenta");
        }
    }

    public void wyswietlWszystkichStudentow(){
        System.out.println("Lista wszystkich studentów:");
        for (int i = 0; i < studenci.length; i++) {
            System.out.println("Indeks "+i+": ");
            studenci[i].viewData2();
        }
    }

    public void wyswietlZakresStudentow(int start, int end) {
        if (start >= 0 && end < studenci.length && start <= end) {
            System.out.println("Studentow w zakresie od indeksu " + start + " do " + end + ":");
            for (int i = start; i <= end; i++) {
                System.out.println("Indeks " + i + ": ");
                studenci[i].viewData2();
            }
        } else {
            System.out.println("Nieprawidłowy zakres studentów");
        }
    }


}