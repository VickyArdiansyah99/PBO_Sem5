package pbo.jobsheet07.praktik.AbstractClass;

import pbo.jobsheet07.praktik.Interface.ChargeAble;

public class SmartPhone extends Phone implements ChargeAble {
    public String ipAddress;

    public void call(String callNumber) {
        System.out.println("SmartPhone melakukan panggilan ke: " + callNumber);
    }

    public void endCall() {
        System.out.println("SmartPhone mengakhiri panggilan");
    }

    public void connectToNeteork() {
        System.out.println("SmartPhone melakukan koneksi ke jaringan");
    }

    @Override
    public void doCharge() {
        System.out.println("Smartphone is charging.");
    }

    @Override
    public void stopCharge() {
        System.out.println("Smartphone has stopped charging.");
    }
}
