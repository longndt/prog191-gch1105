package lab02;

public class DoWhile {
    /*
    sự khác biệt cơ bản giữa do...while và while:
    - while: check điều kiện ngay từ vòng lặp đầu tiên
      => thỏa mãn điều kiện => thực thi vòng lặp
         ngược lại nếu không thỏa mãn điều kiện => bỏ qua vòng lặp
    - do ... while: luôn thực thi vòng lặp cho dù có thỏa mãn điều kiện
    hay không và chỉ check điều kiện từ vòng lặp thứ 2
    => do...while thường được sử dụng để check input value
     */

    public static void main(String[] args) {
        //in ra tất cả các số từ 1 đến 10
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);
        System.out.println(); //xuống hàng

        //in ra tất cả các số lẻ từ 1 đến 10
        int j = 1;
        do {
//            System.out.print(j + " ");
//            j+=2;

            if (j%2==1) {
                System.out.print(j + " ");
            }
            j++;
        } while (j <= 10);
    }
}
