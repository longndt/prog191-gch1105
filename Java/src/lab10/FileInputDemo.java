package lab10;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class FileInputDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filename = "demo.bin";
        File file = new File(filename);
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<String> names = (ArrayList<String>) ois.readObject();

        for (String name : names) {
            System.out.println(name);
        }
    }
}
