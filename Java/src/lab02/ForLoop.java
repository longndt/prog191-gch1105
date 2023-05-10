package lab02;

public class ForLoop {
    public static void main(String[] args) {
        //Task 1: in ra tất cả các số từ 1 đến 20
        //int i;
        for (int i=1; i<=20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();  //new line
        //Task 1: in ra tất cả các số lẻ từ 1 đến 20
        //int i;
        for (int i=1; i<=20; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println();
        //infinite loop: lỗi vòng lặp vô tận (vòng lặp không bao giờ dừng)
        for (int i=1; i<=10 ; ) {
            //System.out.println(i);
        }
    }
}
