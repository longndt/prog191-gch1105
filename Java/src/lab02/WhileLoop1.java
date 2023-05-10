package lab02;

public class WhileLoop1 {
    public static void main(String[] args) {
        int product=1, number=1, count=20, lastNumber;
        //default value of integer: 0

        lastNumber = 2 * count - 1;
        /* thứ tự ưu tiên của phép tính: từ trái sang phải
        và nhân chia trước, cộng trừ sau
        muốn thay đổi thứ tự ưu tiên: thêm dấu ngoặc vào
        biểu thức
         */

        //while (number <= lastNumber)
        while (lastNumber >= number)  {
            product *= number;
            number += 2;
            System.out.print("product: " + product + " ");
            System.out.print("number: " + number + " ");
            System.out.println();
        }
    }
}
