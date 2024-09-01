package EmployeeManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{

    JTextField textField_username, textField_password;

    Login() {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel label_username = new JLabel("Username");
        label_username.setBounds(40, 20, 100, 30);
        add(label_username);

        textField_username = new JTextField();
        textField_username.setBounds(150, 20, 150, 30);
        add(textField_username);

        JLabel label_password = new JLabel("Password");
        label_password.setBounds(40, 70, 100, 30);
        add(label_password);

        textField_password = new JTextField();
        textField_password.setBounds(150, 70, 150, 30);
        add(textField_password);

        JButton login = new JButton("LOGIN");
        login.setBounds(150, 140, 150, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
        add(image);

        setSize(600, 300);
        setLocation(450, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            String username = textField_username.getText();
            String password = textField_password.getText();

            MySQLConnection c = new MySQLConnection();
            String query = "select * from login where username = '"+username+"' and password = '"+password+"'";

            ResultSet rs = c.s.executeQuery(query);
            if (rs.next()) {
                setVisible(false);
                new Home();
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password");
                setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}