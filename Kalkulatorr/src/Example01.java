import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example01 extends JFrame{
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton sumaButton;
    private JButton różnicaButton;
    private JButton wyjścieButton;
    private JPanel textInputLabel;
    private JLabel scoreInputLabel;

    public Example01(){
        super("Kalkulator");
        this.setContentPane(panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        int width = 500, height = 600;
        this.setSize(500, 600);

        double valueA, valueB, score;


        wyjścieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        dispose();
            }
        });
        sumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valueA = Double.parseDouble(textField1.getText());
                double valueB = Double.parseDouble(textField2.getText());
                double score = valueA + valueB;
                scoreInputLabel.setText("Suma: " + String.valueOf(valueA) + " + " + String.valueOf(valueB) + " = " + String.valueOf(score));
                textField1.setText("");
                textField2.setText("");

            }
        });
        różnicaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valueA = Double.parseDouble(textField1.getText());
                double valueB = Double.parseDouble(textField2.getText());
                double score = valueA - valueB;
                scoreInputLabel.setText("Różnica: " + String.valueOf(valueA) + " - " + String.valueOf(valueB) + " = " + String.valueOf(score));
                textField1.setText("");
                textField2.setText("");
            }
        });
    }


}
