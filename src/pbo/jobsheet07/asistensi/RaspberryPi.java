package pbo.jobsheet07.asistensi;

public class RaspberryPi extends Computer implements Wifi,Radio {
    private int numSocket;
    public RaspberryPi(String ipAddress, int cpuClock, int memory, int storage, int numSocket) {
        super(ipAddress, cpuClock, memory, storage);
        this.numSocket = numSocket;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Number of Sockets: " + numSocket);
    }

    @Override
    public void sendData() {
        System.out.println("Sending data from Raspberry Pi...");
        // Implementasi untuk mengirim data melalui Raspberry Pi
        // Misalnya, pengiriman data melalui jaringan atau perangkat lain.
    }

    @Override
    public void sendSignal() {
        System.out.println("Sending signal from Raspberry Pi...");
        // Implementasi untuk mengirim signal melalui Raspberry Pi
        // Misalnya, mengendalikan perangkat eksternal atau komunikasi nirkabel.
    }
}
