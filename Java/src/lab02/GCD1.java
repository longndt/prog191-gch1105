package lab02;

//GCD: Greatest Common Divisor (ước số chung lớn nhất)
public class GCD1 {
    public static void main(String[] args) {
        //assume m,n >=1
        int m = 50;
        int n = 20;
        int min, gcd = 0, i=1;

//        if (m <= n) {
//            min = m;
//        } else {
//            min = n;
//        }

        min = Math.min(m, n);
        while (i<= min) {
            if (m%i==0 && n%i==0) {
                gcd = i;
            }
            i++;
        }
        System.out.println("GCD of " + m  + " & " + n + " : " + gcd);
    }
}
