package lab02;

public class InfiniteLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i *= 1000;
            System.out.println(i);
        }
    }
}
