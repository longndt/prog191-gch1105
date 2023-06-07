package lab10;

import java.io.*;
import java.util.ArrayList;

public class FileOutputDemo {
    public static void main(String[] args) throws IOException {
        //1. create data
        ArrayList<String> names = new ArrayList<>();
        names.add("Phuong");
        names.add("Tuan");
        names.add("Khanh");

        //2. save data
        String fileName = "demo.bin";  //bin: binary format
        File file = new File(fileName);
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(names);
        System.out.println("Save data to file " + fileName + " succeed !");
        fos.close();
        oos.close();
    }
}
