package EmployeeManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener{
    Splash(){

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(60,30,1200,60);
        heading.setFont(new Font("sans serif", Font.PLAIN, 60));
        heading.setForeground(Color.DARK_GRAY);
        add(heading);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50,100,1050,500);
        add(image);

        JButton clicker = new JButton("Click To Continue");
        clicker.setBounds(400,450,300,70);
        clicker.setBackground(Color.DARK_GRAY);
        clicker.setForeground(Color.WHITE);
        clicker.addActionListener(this);
        add(clicker);

        setSize(1170,600);
        setLocation(200,50);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {

        new Splash();
    }
}