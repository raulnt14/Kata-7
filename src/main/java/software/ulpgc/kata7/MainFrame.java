package software.ulpgc.kata7;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MainFrame extends JFrame {
    private JPanel jPanel;
    private JButton jButton;
    private Random rand = new Random();
    private Color[] colors = new Color[]{Color.WHITE, Color.PINK, Color.ORANGE, Color.GREEN, Color.BLUE, Color.YELLOW, Color.RED};

    public MainFrame() throws HeadlessException {
        jPanel = new JPanel();
        jPanel.setBackground(colors[0]);

        jButton = new JButton("Get random color");
        jButton.setSize(200, 50);
        jButton.addActionListener(e -> jPanel.setBackground(colors[rand.nextInt(0, 6)]));

        this.setTitle("Color chooser");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.add(jButton);
        this.add(jPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
