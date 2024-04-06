package OOP.Lab_Exp;
import javax.swing.*;
import java.awt.event.*;

public class LoginGUI extends JFrame implements ActionListener {
    private JLabel userLabel, passwordLabel;
    private JTextField userTextField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginGUI() {
        setTitle("Login");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        userLabel = new JLabel("Username:");
        userLabel.setBounds(20, 20, 80, 25);
        add(userLabel);

        // userTextField = new JTextField();
        // userTextField.setBounds(100, 20, 160, 25);
        // add(userTextField);

        // passwordLabel = new JLabel("Password:");
        // passwordLabel.setBounds(20, 50, 80, 25);
        // add(passwordLabel);

        // passwordField = new JPasswordField();
        // passwordField.setBounds(100, 50, 160, 25);
        // add(passwordField);

        // loginButton = new JButton("Login");
        // loginButton.setBounds(100, 80, 80, 25);
        // loginButton.addActionListener(this);
        // add(loginButton);

        // setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String username = userTextField.getText();
        String password = new String(passwordField.getPassword());

        if (username.equals("admin") && password.equals("admin123")) {  
            JOptionPane.showMessageDialog(this, "Good Morning!");
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Username or Password!");
        }
    }

    public static void main(String[] args) {
        new LoginGUI();
    }
}



