package pbo.jobsheet09.asistensi;

public class NestTry {
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42 / a;
            System.out.println("a = " + a);
            try { // blok try bersarang
                if (a==1) a = a/(a-a); // satu argumen baris perintah, pembagian gengan nol
                if (a==2) {
                    int c[] = {1};
                    c[42] = 99; // dua argumen baris perintah, pengecualian di luar batas
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index di luar batas: " + e);
            }
        }catch (ArithmeticException e) {
            System.out.println("Bagi dengan 0: " + e);
        }
    }
}
