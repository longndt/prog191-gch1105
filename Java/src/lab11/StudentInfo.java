package lab11;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;

public class StudentInfo extends JFrame {
    private JTextField txtName;
    private JLabel lblName;
    private JTextField txtAge;
    private JLabel lblAge;
    private JButton btnCreate;
    private JLabel lblTitle;
    private JPanel pnlStudent;
    private JButton btnClear;
    private JButton btnSave;
    StringBuffer student = new StringBuffer();

    public StudentInfo(){
        btnCreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //check empty
                if (txtName.getText().equals("") || txtAge.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "You must input data first !");
                } else {
                    //lấy dữ liệu từ text field
                    String name = txtName.getText();
                    int age = Integer.parseInt(txtAge.getText());

                    int currentYear = LocalDate.now().getYear();
                    int birthYear = currentYear - age;

                    //lưu dữ liệu vào String Buffer
                    //student = new StringBuffer();
                    student.append("Name: " + name + "\n");
                    student.append("Age: " + age + "\n");
                    student.append("Birth year: " + birthYear + "\n");
                    student.append("---------------------\n");

                    //show dữ liệu
                    System.out.println(student);
                    JOptionPane.showMessageDialog(null, student);
                }
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtName.setText("");
                txtAge.setText("");
            }
        });
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    saveToTextFile(student);
                    JOptionPane.showMessageDialog(null, "Save to file succeed  !");
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Save to file failed !");
                    throw new RuntimeException(ex);
                }
            }
        });
    }

    public static void main(String[] args) {
        StudentInfo form = new StudentInfo();
        form.setContentPane(form.pnlStudent);
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private static void saveToTextFile(StringBuffer student) throws FileNotFoundException {
        String filename = "student.txt";
        PrintWriter writer = new PrintWriter(filename);
        writer.println(student);
        writer.close();
    }
}
