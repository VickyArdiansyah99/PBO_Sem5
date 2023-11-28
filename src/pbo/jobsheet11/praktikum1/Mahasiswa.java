package pbo.jobsheet11.praktikum1;

import java.io.Serializable;

public class Mahasiswa implements Serializable {
    private String nim;
    private String nama;
    private String jurusan;
    private String programStudi;
    private double ipk;

    public Mahasiswa(String nim, String nama, String jurusan, String programStudi, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.programStudi = programStudi;
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", jurusan=" + jurusan + ", programStudi=" + programStudi + ", ipk=" + ipk + '}';
    }
}
