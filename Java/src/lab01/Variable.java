package lab01;

public class Variable {
    public static void main(String[] args) {
        //1st: declare and initialize variable
        int x = 5;
        //2nd: declare variable first
        int y;
        //2nd: initialize for variable later
        y = 3;
        //declare & initialize multiple variables
        int a = 1, b = 1, c = 1;
        //comment or uncomment: CTRL + /
//        a = 1;
//        b = 1;
//        c = 1;
//        double a1 = 7.8;
//        int b1 = 6;
//        float c1 = (float)9.3;
        //WRONG
  //      double a1 = 7.9, int b1 = 6, float c1 = (float)9.3;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        //integer : int
        int i1 = 1;
        //double : double
        double j = 2.5;
        //float : float
        float k = (float)6.7;
        //string : String (a collection of many characters - character array)
        String o = "hello greenwich";
        //character : char (only 1 character)
        char t = '*';
        //boolean : boolean (logic value: true or false)
        boolean p = true;
        //array
        int year[] = new int[3];
        year[0] = 2023;  //1st index in array is always 0
        year[1] = 2024;
        year[2] = 2025;
//        for (int i=0; i< year.length; i++) {
//            System.out.println(year[i]);
//        }
        for (int s : year) {
            System.out.println(s);
        }

        //variable value can be changed/updated
        int n = 1;
        n = 2;
        n = 3;

        //constant: value will not change
        final double PI_NUMBER = 3.14;
    }
}
