import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie1Form extends JFrame{
    private JPanel JPanel4;
    private JRadioButton linuxRadioButton;
    private JRadioButton windowsRadioButton;
    private JRadioButton macintoshRadioButton;
    private JButton backButton;
    private JButton okButton;
    private JButton closeButton;
    private JLabel iconview;

    private ImageIcon iconLinux = new ImageIcon(getClass().getResource("figures/icons8-linux-50.png"));
    private ImageIcon iconWindows = new ImageIcon(getClass().getResource("figures/icons8-windows-50.png"));
    private ImageIcon iconMac = new ImageIcon(getClass().getResource("figures/icons8-macos-50.png"));

    private static ImageIcon resize(ImageIcon src,int width, int height){
        return new ImageIcon(src.getImage().getScaledInstance(width,height, Image.SCALE_SMOOTH));

    }


    public Zadanie1Form(){

        super("Welcome form");
        this.setContentPane(this.JPanel4);
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

                //wiadomosc z wybranym systemem operacyjnym
                String message = "Wybrano: " ;
                if(linuxRadioButton.isSelected()){
                    message += "Linux";
                    JOptionPane.showMessageDialog(null, message, "System operacyjny", JOptionPane.INFORMATION_MESSAGE, resize(iconLinux, 50, 50));
                }else if(windowsRadioButton.isSelected()){
                    message += "Windows";
                    JOptionPane.showMessageDialog(null, message, "System operacyjny", JOptionPane.INFORMATION_MESSAGE, resize(iconWindows, 50, 50));
                }else if(macintoshRadioButton.isSelected()){
                    message += "Macintosh";
                    JOptionPane.showMessageDialog(null, message, "System operacyjny", JOptionPane.INFORMATION_MESSAGE, resize(iconMac, 50, 50));
                }


            }
        });
        linuxRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (linuxRadioButton.isSelected())
                    iconview.setIcon(resize(iconLinux,100,80));

            }
        });
        windowsRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (windowsRadioButton.isSelected())
                    iconview.setIcon(resize(iconWindows,100,80));
            }
        });
        macintoshRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (macintoshRadioButton.isSelected())
                    iconview.setIcon(resize(iconMac,100,80));
            }
        });
    }


}
