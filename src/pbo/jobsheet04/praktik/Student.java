package pbo.jobsheet04.praktik;

public class Student extends Person {

    public Student() {
        System.out.println("Isi dari Student:Constructor");
        //beberapa kode di sini

        //pemanggilan induknya
        super.name = "somename";
        super.address = "some address";
    }

    public String getName() {
        System.out.println("Studen: getName baru tidak sama denan Class Person");
        return name;
    }

}
