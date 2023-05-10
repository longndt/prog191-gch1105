package lab02;

public class Array {
    public static void main(String[] args) {
        //khai báo mảng có kích thước cố định
        int[] a = new int[10]; //size(length) = 10
        //gán giá trị cho từng phần tử (element) cho mảng (array)
        a[0] = 1;
        a[1] = 5;
        a[2] = 10;
       // a[10] = 20; // error (index out of max => last index = 10 - 1 = 9
        a[3] = 15;
        a[1] = 6;  //override value
        System.out.println("a[0] = " + a[0]);
        System.out.println("a[1] = " + a[1]);
        System.out.println("a[5] = " + a[5]);
        System.out.println("--------------");
        //sử dụng for để in ra toàn bộ phần tử trong mảng
        for (int i=0; i<a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
        System.out.println("-----------");
        //sử dụng foreach để in ra mảng
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}
