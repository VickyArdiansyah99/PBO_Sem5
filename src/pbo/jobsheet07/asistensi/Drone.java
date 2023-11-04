package pbo.jobsheet07.asistensi;

public class Drone implements Wifi,Radio {
    private int maxSpeed;
    private int maxAltitude;

    public Drone(int maxSpeed, int maxAltitude) {
        this.maxSpeed = maxSpeed;
        this.maxAltitude = maxAltitude;
    }
//    public Drone(String ipAddress, int cpuClock, int memory, int storage, int maxSpeed, int maxAltitude) {
//        super(ipAddress, cpuClock, memory, storage);
//        this.maxSpeed = maxSpeed;
//        this.maxAltitude = maxAltitude;
//    }

//    @Override
    public void getInfo() {
//        super.getInfo();
        System.out.println("Drone Information:");
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Max Altitude: " + maxAltitude + " meters");
    }

    @Override
    public void sendData() {
        System.out.println("Sending data from Drone...");
        // Implementasi untuk mengirim data dari drone
        // Misalnya, pengiriman data gambar atau sensor dari drone.
    }

    @Override
    public void sendSignal() {
        System.out.println("Sending signal from Drone...");
    }
}
