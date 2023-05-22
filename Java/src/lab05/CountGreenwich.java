package lab05;

import java.util.Scanner;

/* Task: Đếm có bao nhiêu từ Greenwich được nhập vào.
Cho người dùng nhập đến khi gõ từ EXIT thì kết thúc
*/
public class CountGreenwich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        boolean repeat = true;
        final String EXIT_PROGRAM = "Exit";
        final String GREENWICH_UNIVERSITY = "Greenwich";
        while (repeat) {
            System.out.print("Enter a word: ");
            String word = sc.nextLine();
            if (word.equalsIgnoreCase(EXIT_PROGRAM)) {
                repeat = false; //no more repeat => exit program
            } else if (word.equalsIgnoreCase(GREENWICH_UNIVERSITY)){
                count++;
            }
        }
        System.out.println("Total Greenwich words: " + count);
        sc.close(); //optional but recommended
    }
}
