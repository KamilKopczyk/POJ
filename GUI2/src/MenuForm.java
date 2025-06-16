import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuForm extends JFrame{
    private JPanel JPanel3;
    private JButton zadanie1Button;
    private JButton zadanie2Button;
    private JButton wylogujButton;
    private JButton closeButton;
    private JButton zadanie3Button;

    public MenuForm(){

        super("Menu form");
        this.setContentPane(this.JPanel3);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 500, height = 600;
        this.setSize(width,height);


        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();

            }
        });
        wylogujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                dispose();
                LoginForm loginForm = new LoginForm();
                loginForm.setVisible(true);


            }
        });


        zadanie1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();
                Zadanie1Form zadanie1Form = new Zadanie1Form();
                zadanie1Form.setVisible(true);

            }
        });
        zadanie2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();
                Zadanie2Form zadanie2Form = new Zadanie2Form();
                zadanie2Form.setVisible(true);

            }
        });
        zadanie3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();
                Zadanie3Form zadanie3Form = new Zadanie3Form();
                zadanie3Form.setVisible(true);

            }
        });
    }



}
