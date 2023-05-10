package lab02;

import java.util.Scanner;

//in ra bảng cửu chương 1-10
public class ForLoop2 {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            for (int j=1; j<=10; j++) {
                System.out.println(i + " * " + j + " = " + (i*j));
            }
            System.out.println("----------");
        }
    }
}
