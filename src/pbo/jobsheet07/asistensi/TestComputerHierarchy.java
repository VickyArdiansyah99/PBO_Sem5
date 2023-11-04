package pbo.jobsheet07.asistensi;

public class TestComputerHierarchy {

    public static void main(String[] args) {
	    // Membuat objek Desktop
        Desktop desktop = new Desktop("192.168.1.100", 3000, 8, 512, 5000);
        System.out.println("Desktop Informasi:");
        desktop.getInfo();
        desktop.sendData();
        System.out.println("------------------------");
        // Membuat objek Raspberry Pi
        RaspberryPi raspberryPi = new RaspberryPi("192.168.1.101", 1000, 1, 16, 4);
        System.out.println("Raspberry Pi Informasi:");
        raspberryPi.getInfo();
        raspberryPi.sendData();
        System.out.println("------------------------");
        // Membuat objek Drone
        Drone drone = new Drone(200, 100); // Menggunakan konstruktor yang sesuai
        System.out.println("Drone Informasi:");
        drone.getInfo();
        drone.sendData();
        System.out.println("-----Operator kontrol perangkat Wifi-----");
        // Membuat objek Operator
        Operator operator = new Operator();
        // Operator mengontrol perangkat-perangkat yang mengimplementasikan interface Wifi
        operator.wifiControl(desktop);
        operator.wifiControl(raspberryPi);
        operator.wifiControl(drone);
        System.out.println("-----Operator kontrol perangkat Radio-----");
        // Operator mengontrol perangkat-perangkat yang mengimplementasikan interface Radio
        operator.radioControl(raspberryPi); // Raspberry Pi tidak mengimlpementasikan interface Radio
        operator.radioControl(drone); // Drone tidak mengimlpementasikan interface Radio
    }
}
