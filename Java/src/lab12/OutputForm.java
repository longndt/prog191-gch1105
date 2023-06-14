package lab12;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.io.*;

public class OutputForm extends JFrame{
    private JPanel pnlOutput;
    private JTextField txtName;
    private JLabel lblOutput;
    private JLabel lblName;
    private JTextField txtBrand;
    private JTextField txtPrice;
    private JTextField txtYear;
    private JButton btnLoad;
    private JLabel lblBrand;
    private JLabel lblPrice;
    private JLabel lblYear;
    private JButton btnClear;
    private JButton btnEdit;
    String filename = "mobile.bin";

    public OutputForm() {
        btnLoad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Mobile mobile = null;
                try {
                    mobile = loadData();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                } catch (ClassNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
                showData(mobile);
            }
        });
        btnClear.addComponentListener(new ComponentAdapter() {
        });

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtName.setText("");
                txtBrand.setText("");
                txtPrice.setText("");
                txtYear.setText("");
            }
        });
        btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    editData();
                    JOptionPane.showMessageDialog(null, "Edit mobile succeed !");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }

    private void editData() throws IOException {
        String name = txtName.getName();
        String brand = txtBrand.getText();
        double price = Double.parseDouble(txtPrice.getText());
        int year = Integer.parseInt(txtYear.getText());
        Mobile mobile = new Mobile(name, brand, price, year);
        File file = new File(filename);
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(mobile);
        fos.close();
        oos.close();
    }

    public static void main(String[] args) {
        OutputForm outputForm = new OutputForm();
        outputForm.setContentPane(outputForm.pnlOutput);
        outputForm.setVisible(true);
        outputForm.pack();
        outputForm.setLocationRelativeTo(null);
        outputForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void showData(Mobile mobile) {
        txtName.setText(mobile.getName());
        txtBrand.setText(mobile.getBrand());
        String price = String.valueOf(mobile.getPrice());
        txtPrice.setText(price);
        String year = String.valueOf(mobile.getYear());
        txtYear.setText(year);
    }

    private Mobile loadData () throws IOException, ClassNotFoundException {
        File file = new File(filename);
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Mobile mobile = (Mobile) ois.readObject();
        return mobile;
    }
}
