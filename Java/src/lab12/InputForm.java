package lab12;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class InputForm extends JFrame{
    private JTextField txtName;
    private JPanel pnlInput;
    private JTextField txtBrand;
    private JTextField txtPrice;
    private JTextField txtYear;
    private JButton btnCreate;
    private JLabel lblCreate;
    private JLabel lblName;
    private JLabel lblBrand;
    private JLabel lblPrice;
    private JLabel lblYear;

    public InputForm() {
        btnCreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    saveToFile(getMobile());
                    JOptionPane.showMessageDialog(null, "Save mobile succeed !");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Save mobile failed !");
                    throw new RuntimeException(ex);
                }
            }
        });
    }

    public static void main(String[] args) {
        InputForm inputForm = new InputForm();
        inputForm.setContentPane(inputForm.pnlInput);
        inputForm.setVisible(true);
        inputForm.pack();    //set size auto-fit inside components
        //inputForm.setSize(300,400);   //set custom size
        inputForm.setLocationRelativeTo(null);   //set location to center of screen
        //inputForm.setLocation(50, 80);      //set custom location with x (horizontal), y (vertical)
        inputForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private Mobile getMobile() {
        String name = txtName.getText();
        String brand = txtBrand.getText();
        double price = Double.parseDouble(txtPrice.getText());
        int year = Integer.parseInt(txtYear.getText());
        Mobile mobile = new Mobile(name, brand, price, year);
        return mobile;
    }

    private void saveToFile(Mobile mobile) throws IOException {
        String filename = "mobile.bin";
        File file = new File(filename);
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(mobile);
        fos.close();
        oos.close();
    }
}
