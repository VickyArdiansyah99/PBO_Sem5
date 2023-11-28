package pbo.jobsheet11.praktikum3;

import java.io.*;
import java.util.ArrayList;

public class StudentManager implements Serializable {
    private ArrayList<Student> students;
    public StudentManager() {
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.dat"))) {
            oos.writeObject(students);
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    public void loadFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.dat"))) {
            students = (ArrayList<Student>) ois.readObject();
            System.out.println("Data loaded successfully");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
