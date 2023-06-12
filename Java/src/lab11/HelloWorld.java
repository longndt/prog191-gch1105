package lab11;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorld extends JFrame{
    private JPanel pnlHello;
    private JButton btnClick;
    private JButton btnGreenwich;
    private JButton btnDelete;
    private JButton btnMessage;

    public HelloWorld() {
        //1. initialize panel
//        pnlHello = new JPanel();
//
//        //2. add components to panel
//        pnlHello.add(btnClick);
//        pnlHello.add(btnGreenwich);

        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              JOptionPane.showMessageDialog(null, "Hello world !");
            }
        });
        btnGreenwich.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Welcome to Greenwich Vietnam !");
            }
        });
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int choice = JOptionPane.showConfirmDialog(null, "Do you want to delete this item ?");
                if (choice == 0) {    // 0 : YES
                    JOptionPane.showMessageDialog(null, "Item has been deleted !");
                } else if (choice == 1) {   // 1 : NO
                    JOptionPane.showMessageDialog(null, "Item has not been deleted !");
                } else {  // 2 : CANCEL
                    JOptionPane.showMessageDialog(null, "Action has been cancelled !");
                }
            }
        });
        btnMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = JOptionPane.showInputDialog("Leave your message below: ");
                JOptionPane.showMessageDialog(null, message);
            }
        });
    }

    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        hello.setContentPane(hello.pnlHello);
        hello.setVisible(true);  // IMPORTANT
        //hello.setSize(300,200);
        hello.pack();  //set size fit with inside components
        //hello.setLocationRelativeTo(null); // set location to center of screen
        hello.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
