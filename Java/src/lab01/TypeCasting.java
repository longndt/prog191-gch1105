package lab01;

public class TypeCasting {
    public static void main(String[] args) {
        int a = 3; //int
        //type casting: int => double
        double b = (double)a; //double, b = 3.0
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        double c = 7.999; //double
        int d = (int)c; //explicit type casting : manual
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        int x = 3;
        int y = 4;
        double z = x + y; //implicit type casting : automatic
        System.out.println("z = " + z);
    }
}
