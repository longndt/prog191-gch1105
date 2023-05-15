package lab03;

public class CountryDemo {
    public static void main(String[] args) {
        //sử dụng default constructor
        Country country1 = new Country();
        country1.setName("Vietnam");
        country1.setCapital("Hanoi");

        //sử dụng parameterized constructor
        //argument: "Thailand", "Bangkok"
        /*
        Các nguyên tắc khi sử dụng parameterized constructor:
        1. số lượng argument phải giống với số lượng parameter
        2. data type của argument cũng phải giống với parameter
        3. thứ tự của argument cũng phải giống với parameter
         */
        Country country2 = new Country("Thailand", "Bangkok");

        /*chỉ có thể gọi (truy xuất) đến các method trong OOP class
        với điều kiện access modifier (scope) là public hoặc protected. nếu người dùng không khai báo modifier thì
         Java sẽ tự set modifier là public */
        country1.showCountryInfo();
        country2.showCountryInfo();
    }
}
