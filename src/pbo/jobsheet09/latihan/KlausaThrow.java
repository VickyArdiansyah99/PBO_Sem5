package pbo.jobsheet09.latihan;

public class KlausaThrow {
    // Melemparkan exception dengan klausa throw
    public static void main(String[] args) {
        String input = "Throw RuntimeException";
        System.out.println("\n****** MENGGUNAKAN KLAUSA THROW ******\n");
        try {
            if (input.equals("Throw RuntimeException")) {
                throw new RuntimeException("Melempar Exception");
            } else if (input == null) {
                throw new NullPointerException();
            } else {
                System.out.println("Imput adalah : " + input);
            }
            System.out.println("\nPernyataan dalam blok try setelah bebas ");
        } catch (ArithmeticException exc) {
            System.err.println("ArithmeticException menangkap exception");
            System.err.println("\nException yang ditangkap adalah: "+exc);
        }
    }
}
