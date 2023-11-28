package pbo.jobsheet11.praktikum3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentApp {
    private static StudentManager studentManager;

    public static void main(String[] args) {
        studentManager = new StudentManager();
        JFrame frame = new JFrame("Student Management App");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }
    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(10,20,80,25);
        panel.add(nameLabel);
        JTextField nameText = new JTextField(20);
        nameText.setBounds(100,20,165,25);
        panel.add(nameText);
        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(10,50,80,25);
        panel.add(ageLabel);
        JTextField ageText = new JTextField(20);
        ageText.setBounds(100,50,165,25);
        panel.add(ageText);
        JButton addButton = new JButton("Add");
        addButton.setBounds(10,80,80,25);
        panel.add(addButton);
        JButton saveButton = new JButton("Save");
        saveButton.setBounds(100,80,80,25);
        panel.add(saveButton);
        JButton loadButton = new JButton("Load");
        loadButton.setBounds(190,80,80,25);
        panel.add(loadButton);
        JTextArea resultArea = new JTextArea();
        resultArea.setBounds(10,110,350,100);
        panel.add(resultArea);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameText.getText();
                int age = Integer.parseInt(ageText.getText());
                Student student = new Student(name, age);
                studentManager.addStudent(student);
                updateResultArea(resultArea);
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentManager.saveToFile();
            }
        });
        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentManager.loadFromFile();
                updateResultArea(resultArea);
            }
        });
    }
    private static void updateResultArea(JTextArea resultArea) {
        resultArea.setText("");
        for (Student student : studentManager.getStudents()) {
            resultArea.append("Nama: " + student.getName() + ", Umur: " + student.getAge()+ "\n");
        }
    }
}
