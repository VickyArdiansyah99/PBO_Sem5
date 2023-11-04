package pbo.jobsheet04.tugas.no1;

public class MainTruk {

    public static void main(String[] args) {

        Truk truk = new Truk();
        truk.getmerek();
        truk.setMerek("Volvo");
        truk.setPlatNomor("AA 1234 WSA");
        System.out.println(truk.merek);

        truk.sebutIdentitas();

    }

}
