package lab07;

public class Desktop extends PC{
    public int totalMonitor;


    public Desktop(String CPU, String RAM, String HDD, int totalMonitor) {
        super(CPU, RAM, HDD);
        this.totalMonitor = totalMonitor;
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "totalMonitor=" + totalMonitor +
                '}';
    }

    public int getTotalMonitor() {
        return totalMonitor;
    }

    public void setTotalMonitor(int totalMonitor) {
        this.totalMonitor = totalMonitor;
    }
}
