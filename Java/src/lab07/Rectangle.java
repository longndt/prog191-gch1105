package lab07;

public class Rectangle implements Shape{
    @Override
    public double ChuVi(double a, double b) {
        double chu_vi = (a + b) * 2;
        return chu_vi;
    }

    @Override
    public double DienTich(double a, double b) {
        return (a*b);
    }
}
