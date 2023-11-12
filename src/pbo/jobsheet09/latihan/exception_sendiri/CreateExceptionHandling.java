package pbo.jobsheet09.latihan.exception_sendiri;

public class CreateExceptionHandling extends Exception{
    private int bilangan;
    CreateExceptionHandling() {

    }
    CreateExceptionHandling(String pesan) {
        super(pesan);
    }
    CreateExceptionHandling(String pesan, int nilai) {
        super(pesan);
        bilangan = nilai;
    }
    public int getBilangan() {
        return bilangan;
    }
}
