package pbo.jobsheet07.asistensi;

public class Operator {
    public void wifiControl(Wifi wifi) {
        // Operator melakukan kontrol terhadap perangkat Wifi
        wifi.sendData(); // Contoh operasi yang dapat dilakukan oleh operator
    }

    public void radioControl(Radio radio) {
        // Operator melakukan kontrol terhadap perangkat Radio
        radio.sendSignal(); // Contoh operasi yang dapat dilakukan oleh operator pada Radio
    }
}
