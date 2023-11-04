package pbo.jobsheet04.tugas.no1;

public class Kendaraan {
    protected String merek;
    protected String platNomor;

    public Kendaraan() {
        System.out.println("Isi dari Kendaraan:Constructor");
        merek = "";
        platNomor = "";
    }

    public Kendaraan(String merek, String platNomor) {
        this.merek = merek;
        this.platNomor = platNomor;
    }

    public String getMerek() {
        System.out.println("Parent: getMerek");
        return merek;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setPlatNomor(String id) {
        this.platNomor = id;
    }

    public void sebutIdentitas() {
        System.out.println("Merek :" + merek);
        System.out.println("Nomor Kendaraan :" + platNomor);
    }
}
