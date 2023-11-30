package pbo.jobsheet11.tugas;

import pbo.jobsheet11.praktikum1.Mahasiswa;

import java.io.*;
import java.util.ArrayList;

public class MahasiswaManager implements Serializable {
    private ArrayList<Mahasiswa> daftarMahasiswa;
    public MahasiswaManager() {
        this.daftarMahasiswa = new ArrayList<>();
    }
//    public void simpanMahasiswa(Mahasiswa mahasiswa) {
//        daftarMahasiswa.add(mahasiswa);
//    }
    public void updateMahasiswa(int index, Mahasiswa mahasiswa) {
        if (index >= 0 && index < daftarMahasiswa.size()) {
            daftarMahasiswa.set(index, mahasiswa);
        }
    }
    public void deleteMahasiswa(int index) {
        if (index >= 0 && index < daftarMahasiswa.size()) {
            daftarMahasiswa.remove(index);
        }
    }
//    public void clearMahasiswa() {
//        daftarMahasiswa.clear();
//    }
    public ArrayList<Mahasiswa> getDaftarMahasiswa() {
        return daftarMahasiswa;
    }
    public void simpanKeFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("mahasiswa.dat"))) {
            oos.writeObject(daftarMahasiswa);
            System.out.println("Data mahasiswa berhasil disimpan.");
        } catch (IOException e) {
            System.err.println("Gagal menyimpan data mahasiswa: " + e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    public void muatDariFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("mahasiswa.dat"))) {
            daftarMahasiswa = (ArrayList<Mahasiswa>) ois.readObject();
            System.out.println("Data mahasiswa berhasil dimuat. Jumlah data: " + daftarMahasiswa.size());
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Gagal memuat data mahasiswa: " + e.getMessage());
        }
    }
}
