package lab07;

//abstract super class
public abstract class PC {
    private String CPU;
    private String RAM;
    private String HDD;

    public PC(String CPU, String RAM, String HDD) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    @Override
    public String toString() {
        return "PC{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", HDD='" + HDD + '\'' +
                '}';
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getHDD() {
        return HDD;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }
}
