package pbo.jobsheet11.praktikum1;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Praktikum1 {
    private static void writeObject(Object o) throws Exception {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("mhs.obj"));
            oos.writeObject(o);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException ex) {
            throw ex;
        } catch (IOException ex) {
            throw ex;
        }
    }
    private static Object readObject() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("mhs.obj"));
        try {
            Object readObject = ois.readObject();
            ois.close();
            return readObject;
        } catch (ClassNotFoundException ex) {
            throw ex;
        }
    }

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("21MI0119","Vicky Ardiansyah","Ilmu Komputer","Manajemen Informatika",4.0);
        try {
            writeObject(mhs);
            Mahasiswa readObject = (Mahasiswa) readObject();
            System.out.println("" + readObject);
        } catch (Exception ex) {
            Logger.getLogger(Praktikum1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
