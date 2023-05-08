package lab01;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter fan's speed: ");
        int speed = scan.nextInt();
        switch (speed) {
            case 0 :  //if
                System.out.println("Fan is stopped");
                break;
            case 1 :   //else if
                System.out.println("Fan speed is 1");
                break;
            case 2 :   //else if
                System.out.println("Fan speed is 2");
               break;
            case 3 :   //else if
                System.out.println("Fan speed is 3");
                break;
            default :  //else
                System.out.println("Invalid speed");
                break;
        }
    }
}
