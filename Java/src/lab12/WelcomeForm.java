package lab12;

import javax.swing.*;
import java.awt.*;

public class WelcomeForm extends JFrame{
    JPanel pnlWelcome;
    private JLabel lblWelcome;

    public WelcomeForm() {
        this.setContentPane(this.pnlWelcome);
        this.setVisible(true);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
