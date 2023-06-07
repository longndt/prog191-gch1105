package lab10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadDemo {
    public static void main(String[] args) throws FileNotFoundException {
        //1. khai báo file cần đọc dữ liệu
        File file = new File("student.txt");
        //2. khai báo scanner để đọc dữ liệu từ file
        Scanner scanner = new Scanner(file);
        //3. dùng vòng lặp while để hiển thị toàn bộ các dữ liệu trong file
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    }
}
