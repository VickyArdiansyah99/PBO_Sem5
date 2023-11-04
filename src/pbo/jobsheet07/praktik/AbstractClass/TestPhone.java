package pbo.jobsheet07.praktik.AbstractClass;

import pbo.jobsheet07.praktik.Interface.MP3Player;
import pbo.jobsheet07.praktik.Interface.USBCharger;

public class TestPhone {
    public static void main(String[] args) {
        MobilePhone noqia = new MobilePhone();
        SmartPhone samsunk = new SmartPhone();
        MP3Player iphod = new MP3Player();
        USBCharger charger = new USBCharger();
//        Phone sonny = new Phone();

//        noqia.setPhoneNumber("081234567");
//        samsunk.setPhoneNumber("082297654210");

//        noqia.call("0833445566");
//        noqia.endCall();

//        checkPhoneNumber(samsunk);

        charger.charge(noqia);
        charger.charge(samsunk);
        charger.charge(iphod);

        charger.stop(noqia);
        charger.stop(samsunk);
        charger.stop(iphod);
    }

//    public static void checkPhoneNumber(Phone phone) {
//        System.out.println("Nomor dari telepon ini adalah: " + phone.getPhoneNumber());
//    }
}
