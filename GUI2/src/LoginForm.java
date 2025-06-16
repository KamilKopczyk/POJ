import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame{
    private JTextField LoginLabel;
    private JPasswordField passwordField1;
    private JButton closeButton;
    private JButton loginButton;
    private JPanel JPanel2;

    String user = "admin";
    String password = "admin";


    public LoginForm(){
        super("Welcome form");
        this.setContentPane(this.JPanel2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 500, height = 600;
        this.setSize(width,height);



        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();

            }
        });

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String userInput = LoginLabel.getText();
                String passwordInput = new String(passwordField1.getPassword());

                if(userInput.equals(user) && passwordInput.equals(password)){

                //otarcie nowego okna
                    dispose();
                    MenuForm menuForm = new MenuForm();
                    menuForm.setVisible(true);



            }else {
                    JOptionPane.showMessageDialog(null, "Invalid login or password");
                }

            }




        });
    }





}
