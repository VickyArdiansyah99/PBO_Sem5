package pbo.jobsheet07.praktik.AbstractClass;

abstract class Phone {
    protected String phoneNumber;

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    abstract void call(String callNumber);
    abstract void endCall();
}
