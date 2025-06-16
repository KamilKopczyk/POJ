import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TowerOFHanoi extends JFrame {
    private JPanel panel1;
    private JSlider slider1; // Adjust number of discs
    private JSlider slider2; // Adjust animation speed
    private JButton startButton;
    private JButton krokButton;
    private JButton stopButton;
    private JLabel pillar0;
    private JLabel pillar1;
    private JLabel pillar2;

    private Canvas canvas; // Canvas for drawing the Tower of Hanoi

    public TowerOFHanoi() {
        setTitle("Tower of Hanoi");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new BorderLayout());

        // Initialize Canvas
        canvas = new Canvas();
        panel1.setLayout(new BorderLayout());
        panel1.add(canvas, BorderLayout.CENTER);

        // Add event listeners
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                canvas.runHanoi();
            }
        });

        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                canvas.stopHanoi();
            }
        });

        krokButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                canvas.stepHanoi();
            }
        });

        slider1.addChangeListener(e -> {
            int discs = slider1.getValue();
            canvas.setDiscsAmount(discs);
        });

        slider2.addChangeListener(e -> {
            int speed = slider2.getValue();
            canvas.setSpeed(speed);
        });

        add(panel1, BorderLayout.CENTER);
    }
}





