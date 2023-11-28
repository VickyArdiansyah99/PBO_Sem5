package pbo.jobsheet11.praktikum2;

import java.io.Serializable;

public class MataKuliah implements Serializable {

    private static final long serialVersionUID = 1220474108575504886L;

    private String kodeMk;
    private transient String nama;
    private static byte sks;

    public MataKuliah(String kodeMk, String nama, byte sks) {
        this.kodeMk = kodeMk;
        this.nama = nama;
        this.sks = sks;
    }

    public String getKodeMk() {
        return kodeMk;
    }

    public void setKodeMk(String kodeMk) {
        this.kodeMk = kodeMk;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public static byte getSks() {
        return sks;
    }

    public void setSks(byte sks) {
        this.sks = sks;
    }

    @Override
    public String toString() {
        return "MataKuliah{" + "kodeMk=" + kodeMk + ", nama=" + nama + ", sks=" + sks + '}';
    }
}
