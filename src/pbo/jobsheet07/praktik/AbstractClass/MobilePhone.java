package pbo.jobsheet07.praktik.AbstractClass;

import pbo.jobsheet07.praktik.Interface.ChargeAble;

public class MobilePhone extends Phone implements ChargeAble {
    public void call(String callNumber) {
        System.out.println("MobilePhone melakukan panggilan ke: " + callNumber);
    }

    public void endCall() {
        System.out.println("MobilePhone mengakhiri panggilan");
    }

    @Override
    public void doCharge() {
        System.out.println("MobilePhone is charging.");
    }

    @Override
    public void stopCharge() {
        System.out.println("MobilePhone has stopped charging.");
    }
}
