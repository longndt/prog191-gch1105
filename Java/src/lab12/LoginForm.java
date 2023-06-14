package lab12;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.TreeMap;

public class LoginForm extends JFrame {
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    private JLabel lblUsername;
    private JLabel lblPassword;
    private JLabel lblLoginForm;
    private JPanel pnlLogin;

    public LoginForm() {
        Map accountList = new TreeMap<String, String>();
        accountList.put("admin", "123456");
        accountList.put("manager", "666666");
        accountList.put("staff", "888888");
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = txtUsername.getText();
                String password = txtPassword.getText();
                if (accountList.containsKey(username) && (accountList.get(username).equals(password))) {
                    JOptionPane.showMessageDialog(null, "Login succeed !");
                    WelcomeForm welcomeForm = new WelcomeForm();
                    welcomeForm.setContentPane(welcomeForm.pnlWelcome);
                    welcomeForm.setVisible(true);
                    welcomeForm.pack();
                    welcomeForm.setLocationRelativeTo(null);
                    welcomeForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Login failed !");
                }
            }
        });
    }

    public static void main(String[] args) {
        LoginForm loginForm = new LoginForm();
        loginForm.setContentPane(loginForm.pnlLogin);
        loginForm.setVisible(true);
        loginForm.pack();
        loginForm.setLocationRelativeTo(null);
        loginForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
