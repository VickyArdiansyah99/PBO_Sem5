package pbo.jobsheet03.praktik;

public class Pertemuan3Lat5 {

    public static void main(String[] args) {

        new Pertemuan3Lat5() .GradeNilai();
        new Pertemuan3Lat5() .Score();

    }

    void GradeNilai() {
        String status = "";
        int grade = 80;

        status = (grade >= 60) ?"Passed":"Failed"; //mendapatkan status pelajar
        System.out.println(status); //print status

        // Bisa juga dengan script berikut
//        int grade=68;
//        if (grade>60) {
//            System.out.println("Passed!");
//        } else {
//            System.out.println("Failed");
//        }
    }

    void Score() {
        int skor = 0;
        char jawaban = 'a';
        skor = (jawaban=='a')?10:0;
        System.out.println("Score = " + skor);
    }

}
