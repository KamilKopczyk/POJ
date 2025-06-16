import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie3Form extends JFrame{
    private JComboBox comboBox1;
    private JButton backButton;
    private JButton okButton;
    private JButton closeButton;
    private JPanel JPanel6;
    private JLabel view;


    public Zadanie3Form() {

        super("Welcome form");
        this.setContentPane(this.JPanel6);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 500, height = 600;
        this.setSize(width, height);



            backButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    dispose();
                    MenuForm menuForm = new MenuForm();
                    menuForm.setVisible(true);

                }
            });
            closeButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    dispose();

                }
            });


        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //wybieranie jednego z 3 jezykow z combatboxa i wyswietlanie

                String selectedLanguage = (String) comboBox1.getSelectedItem();
                if (selectedLanguage != null) {
                    JOptionPane.showMessageDialog(null, "Wybrany język: " + selectedLanguage);
                } else {
                    JOptionPane.showMessageDialog(null, "Nie wybrano języka");
                }




            }
        });
    }
}
