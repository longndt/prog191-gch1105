package lab12;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.io.*;

public class MobileDemo extends JFrame{
    private JPanel pnlOutput;
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
    private JTextField txtName;
    private JButton btnCreate;
    private JButton btnDelete;
    String filename = "mobile.bin";

    public MobileDemo() {
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
                    editData(loadData());
                    JOptionPane.showMessageDialog(null, "Edit mobile succeed !");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                } catch (ClassNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        btnCreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    createData();
                    JOptionPane.showMessageDialog(null, "Create mobile succeed !");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File file = new File(filename);
                FileOutputStream fos = null;
                try {
                    fos = new FileOutputStream(file);
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
                ObjectOutputStream oos = null;
                try {
                    oos = new ObjectOutputStream(fos);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    oos.reset();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }

    private void createData() throws IOException {
        String name = txtName.getText();
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

    private void editData(Mobile mobile) throws IOException {
        mobile.setName(txtName.getText());
        mobile.setBrand(txtBrand.getText());
        mobile.setPrice(Double.parseDouble(txtPrice.getText()));
        mobile.setYear(Integer.parseInt(txtYear.getText()));
        File file = new File(filename);
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(mobile);
        fos.close();
        oos.close();
    }

    public static void main(String[] args) {
        MobileDemo outputForm = new MobileDemo();
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
        Mobile mobile;
        if (ois != null) {
            mobile = (Mobile) ois.readObject();
        } else {
            mobile = new Mobile();
        }
        return mobile;
    }
}
