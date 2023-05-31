package lab08;

public class AssertionDemo {
    public static void main(String[] args) {
        addition(3, 5);
        subtraction(10, 7);
    }

    private static void addition (int a, int b) {
        int c = a - b;
        System.out.println("c : " + c);
        //Method 1: use "assert" keyword, need to config VM option first
        assert c >= a : "c must be greater or equal to a";
    }

    private static void subtraction (int a, int b) {
        int c = a - b;
        System.out.println("c : " + c);
        //Method 2: throw AssertionError, no need to config VM option
        if (c < a) throw new AssertionError("c must be smaller or equal to a");
    }
}
