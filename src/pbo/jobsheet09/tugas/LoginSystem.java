package pbo.jobsheet09.tugas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginSystem extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginSystem() {
        setTitle("Login System");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10,20));
        add(panel);
        placeComponents(panel);
        setVisible(true);
    }
    private void placeComponents(JPanel panel) {
        JLabel userLabel = new JLabel("Username:");
        panel.add(userLabel);
        usernameField = new JTextField(15);
        panel.add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        panel.add(passwordLabel);
        passwordField = new JPasswordField(15);
        panel.add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onLoginButtonClick();
            }
        });
        panel.add(loginButton);
    }
    private void onLoginButtonClick() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        // username dan password yang diizinkan
        String user = "admin";
        String pass = "1234";

        try {
            if (isValidCredential(username, password, user, pass)) {
                JOptionPane.showMessageDialog(this, "Login berhasil!");
            } else {
                throw new IllegalArgumentException("Username atau Password tidak valid");
            }

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Login Gagal. " + e.getMessage());
        }
    }
    private boolean isValidCredential(String username, String password, String user, String pass) {
        // Validasi sesuai ketentuan
        boolean validUsername = isValidString(username);
        boolean validPassword = isValidString(password);

        return validUsername && validPassword && username.equals(user) && password.equals(pass);
    }

    private boolean isValidString(String input) {
        return input.matches("[a-zA-Z0-9]+");
    }

    public static void main(String[] args) {
        LoginSystem frame = new LoginSystem();
    }
}
