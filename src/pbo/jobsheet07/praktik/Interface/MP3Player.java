package pbo.jobsheet07.praktik.Interface;

public class MP3Player implements ChargeAble{
    public int storageCapacity;

    public void playMusic(String fileName) {
        System.out.println("Playing music: " + fileName);
    }

    public void doCharge() {
        System.out.println("MP3Player is charging.");
    }

    @Override
    public void stopCharge() {
        System.out.println("MP3Player has stopped charging.");
    }
}
