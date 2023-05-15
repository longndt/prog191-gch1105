package lab03;

public class Country {
    private String name;
    private String capital;

    //default constructor
    //Java sẽ tự khai báo default constructor
    //nếu người dùng không khai báo nhưng
    //vẫn gọi ra ở hàm main
    public Country () {}

    //parameter: name, capital
    public Country (String name, String capital) {
        //this: trỏ về class name
//        Cách 1
//        this.name = name;
//        this.capital = capital;
//        Cách 2: dùng setter
          this.setName(name);
          this.setCapital(capital);
    }

    public void setName (String name) {
        this.name = name;
    }
    public void setCapital (String capital) {
        this.capital = capital;
    }

    public void showCountryInfo() {
        System.out.println("Name: " + name);
        System.out.println("Capital: " + capital);
    }
}
