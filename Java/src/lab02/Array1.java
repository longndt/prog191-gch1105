package lab02;

public class Array1 {
    public static void main(String[] args) {
        //khởi tạo mảng với các element được tạo sẵn
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        for (int i=0; i<a.length; i++) {
            //check xem a[i] có phải là last element hay không
            if (i == a.length - 1) {
                System.out.print(a[i] + ".");
            } else {
                System.out.print(a[i] + ", ");
            }
        }
    }
}
