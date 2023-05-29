package lab07;

public class Laptop extends PC{
    private String batteryLength;

    public Laptop(String CPU, String RAM, String HDD, String batteryLength) {
        super(CPU, RAM, HDD);
        this.batteryLength = batteryLength;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(super.toString());
        sb.append("batteryLength='" + batteryLength);
        String text = sb.toString();
        return text;
    }

    public String getBatteryLength() {
        return batteryLength;
    }

    public void setBatteryLength(String batteryLength) {
        this.batteryLength = batteryLength;
    }
}
