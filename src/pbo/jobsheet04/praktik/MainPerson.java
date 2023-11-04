package pbo.jobsheet04.praktik;

public class MainPerson {

    public static void main(String[] args) {

        Student anna = new Student();
        anna.getName();
        anna.setName("Abraham");
        anna.setAddress("Jogja");
        System.out.println(anna.name);

        anna.sebutIdentitas();

    }
}
