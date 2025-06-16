import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie2Form extends JFrame{
    private JCheckBox Javacheck;
    private JCheckBox ccheck;
    private JCheckBox CCcheck;
    private JCheckBox Pythoncheck;
    private JButton backButton;
    private JButton okButton;
    private JButton closeButton;
    private JPanel JPanel5;

    float price = 0;

    public Zadanie2Form(){

        super("Welcome form");
        this.setContentPane(this.JPanel5);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 500, height = 600;
        this.setSize(width,height);


        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();

            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();
                MenuForm menuForm = new MenuForm();
                menuForm.setVisible(true);

            }
        });


        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            //wiadomosc z wybranymi kursami bo mozna wybrac pare
                String message = "Wybrane kursy: \n";

                if (Javacheck.isSelected()) {
                    price += 3500;
                    message += "Java Cena: 3500 PLN\n";
                }
                if (ccheck.isSelected()) {
                    price += 3000;
                    message += "C# Cena: 3000 PLN\n";
                }
                if (CCcheck.isSelected()) {
                    price += 4000;
                    message += "C++ Cena: 4000 PLN\n";
                }
                if (Pythoncheck.isSelected()) {
                    price += 5000;
                    message += "Python Cena: 5000 PLN\n";
                }



                message += "\nŁączna cena: " + price + " PLN";

                JOptionPane.showMessageDialog(null, message);



            }
        });
    }
}
