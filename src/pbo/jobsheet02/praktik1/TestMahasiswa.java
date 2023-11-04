package pbo.jobsheet02.praktik1;

public class TestMahasiswa {

    public static void main(String[] args) {
	    Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Lesteri";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();

	    Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 102;
        mhs2.nama = "siti";
        mhs2.alamat = "Jl. Merdeka No 5";
        mhs2.kelas = "1B";
        mhs2.tampilBiodata();

	    Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 102;
        mhs3.nama = "Ucup";
        mhs3.alamat = "Jl. Harapan No 10";
        mhs3.kelas = "1C";
        mhs3.tampilBiodata();
    }
}
