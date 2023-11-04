package pbo.jobsheet07.praktik.Interface;

public class USBCharger {
    public void charge(ChargeAble device) {
        device.doCharge();
    }

    public void stop(ChargeAble device) {
        device.stopCharge();
    }
}
