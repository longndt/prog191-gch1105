package lab07;

public class Square implements Shape{
    @Override
    public double ChuVi(double a, double b) {
        return a*4;  //b*4
    }

    @Override
    public double DienTich(double a, double b) {
        return a*a;  //b*b
    }
}
