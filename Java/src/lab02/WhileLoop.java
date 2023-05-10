package lab02;

public class WhileLoop {
    public static void main(String[] args) {
        //example 1 : in ra tất cả các số từ 1 đến 10
        int i = 1;  //khai báo và khởi tạo biến cùng lúc
        while (i <= 10) {
            System.out.println(i);
            i++;  // i = i + 1 ; i+=1
        }

        //example 2 : in ra tất cả các số chẵn từ 2 đến 20
        int j;  //khai báo biến trước
        j = 1;  //khởi tạo biến sau (gán giá trị đầu tiên cho biến)
        j = 2;  //override giá trị của biến
        //cách 1: sử dụng if
        while (j <= 20) {
            if (j%2==0) {
                System.out.print(j + " - ");
            }
            j+=1;
        }
        System.out.println();  //xuống hàng
        j = 2; //cần reset lại giá trị của j về 2 để chạy vòng lặp while thứ 2 hoặc comment/xóa đi code của vòng lặp
        // while thứ 1
        //cách 2: tăng j lên 2 đơn vị sau mỗi vòng lặp
        while (j <= 20) {
            System.out.print(j + ", ");
            j+=2;
        }
    }
}
