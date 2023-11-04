package pbo.jobsheet07.asistensi;

public class Desktop extends Computer implements Wifi {
    private int battCapacity;
    public Desktop(String ipAddress, int cpuClock, int memory, int storage, int battCapacity) {
        super(ipAddress, cpuClock, memory, storage);
        this.battCapacity = battCapacity;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Battery Capacity: " + battCapacity + " mah");
    }

    @Override
    public void sendData() {
        System.out.println("Sending data from Desktop...");
    }
}
