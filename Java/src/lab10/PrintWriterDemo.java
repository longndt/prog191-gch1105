package lab10;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        String text = "Greenwich Vietnam";
        int year = 2023;
        double grade = 8.5;
        boolean pass = true;
        char c = 'o';

        String file_name = "hello.txt";
        String file_path = "D:/filedemo/hello.txt";
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(file_path);
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.err.println("Can not create file !");
        }
        printWriter.println(text);
        printWriter.println(year);
        printWriter.println(grade);
        printWriter.println(c);
        System.out.println("Save to text file successfully at " + file_path);

        //remember to close PrintWriter at the end of program
        printWriter.close();
    }
}
