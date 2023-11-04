package pbo.jobsheet07.asistensi;

public class Computer {
    protected String ipAddress;
    protected int cpuClock;
    protected int memory;
    protected int storage;

    public Computer(String ipAddress, int cpuClock, int memory, int storage) {
        this.ipAddress = ipAddress;
        this.cpuClock = cpuClock;
        this.memory = memory;
        this.storage = storage;
    }

    public void getInfo() {
        System.out.println("Computer Info:");
        System.out.println("IP Address: " + ipAddress);
        System.out.println("CPU Clock: " + cpuClock + "MHz");
        System.out.println("Memory: " + memory + "GB");
        System.out.println("Storage: " + storage + "GB");
    }
}
