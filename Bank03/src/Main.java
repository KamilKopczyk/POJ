import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserDAO dao = new UserDAO();

        printBanner("ATM BANK SYSTEM");

        System.out.println("Podaj nazwę użytkownika:");
        String username = scanner.nextLine();

        System.out.println("Podaj PIN:");
        String pin = scanner.nextLine();

        try{

            if(dao.authenticateUser(username,pin,"admin")){

                System.out.println("Zalogowano jako administrator.");
                adminMenu(dao,scanner);

            } else if (dao.authenticateUser(username,pin,"user")) {

                System.out.println("Zalogowano jako użytkownik.");
                userMenu(dao,scanner,username);

            }else{

                System.out.println("Nieprawidłowe dane logowania.");


            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    private static void adminMenu(UserDAO dao, Scanner scanner) throws SQLException {

        while(true){
            printBanner("MENU ADMINA");
            System.out.println("1. Dodaj użytkownika");
            System.out.println("2. Wyloguj");

            System.out.println("Wybierz opcję:");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Podaj nazwę użytkownika:");
                    String username = scanner.nextLine();
                    System.out.println("Podaj PIN:");
                    String pin = scanner.nextLine();
                    dao.addUser(username, pin);
                    break;
                case 2:
                    System.out.println("Wylogowano.");
                    return;
                default:
                    System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
            }

            pressEnterToContinue(scanner);

        }


    }

    private static void userMenu(UserDAO dao, Scanner scanner, String usename) throws SQLException{

        while(true){

            printBanner("MENU UŻYTKOWNIKA");
            System.out.println("1. Wpłata");
            System.out.println("2. Wypłata");
            System.out.println("3. Zmień PIN");
            System.out.println("4. Sprawdź saldo");
            System.out.println("5. Wyloguj");

            System.out.println("Wybierz opcję:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Podaj kwotę wpłaty:");
                    double depositAmount = scanner.nextDouble();
                    dao.deposit(usename, depositAmount);
                    break;
                case 2:
                    System.out.println("Podaj kwotę wypłaty:");
                    double withdrawAmount = scanner.nextDouble();
                    dao.withdraw(usename, withdrawAmount);
                    break;
                case 3:
                    System.out.println("Podaj nowy PIN:");
                    String newPin = scanner.nextLine();
                    dao.changePin(usename, newPin);
                    break;
                case 4:
                    double balance = scanner.nextDouble();
                    System.out.println("Twoje saldo wynosi: " + balance);
                    break;
                case 5:
                    System.out.println("Wylogowano.");
                    return;
                default:
                    System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
            }

            pressEnterToContinue(scanner);

        }



    }

    private static void printBanner(String title){

        System.out.println("\n" + "=".repeat(40));
        System.out.println(" " + title);
        System.out.println("\n" + "=".repeat(40));

    }

    private static void pressEnterToContinue(Scanner scanner){

        System.out.println("Naciśnij Enter, aby kontynuować...");
        scanner.nextLine();

    }





}