package lab01;

public class Operator {
    public static void main(String[] args) {
        int a = 3;
        int b = a + 1;
        int c = a - 2;
        int d = a * 3;
        int e = a / 3;
        //modulus: get the remainder of a division
        int x = 17 % 3;  //result = 2

        int n = 3;
        //n = n + 1;
        n += 1;  //shorthand
        //n = n * 3;
        n *= 3;

        int i = 5;
        //postfix operator
        int j = i++; //j=i=5 => i++=5+1=6
        //prefix operator
        int k = ++i; //++i=6+1=7 => k=7
        System.out.println("i = " + i);   // 7
        System.out.println("j = " + j);   // 5
        System.out.println("k = " + k);   // 7
    }
}
