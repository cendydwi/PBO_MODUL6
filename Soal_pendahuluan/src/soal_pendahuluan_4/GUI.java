package soal_pendahuluan_4;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

public class GUI extends Komponen{
    public GUI() {
        label.setBounds(130,10,500,40);
        label.setFont(new Font("Consolas", Font.BOLD, 30));        
        
        user.setBounds(30, 80, 100, 25);
        user.setFont(new Font("Consolas", Font.BOLD, 20));
        
        texUser.setBounds(150, 80, 250, 25);
        
        pass.setBounds(30, 140, 100, 25);
        pass.setFont(new Font("Consolas", Font.BOLD, 20));
        
        texPass.setBounds(150, 140, 250, 25);
        
        login.setBounds(170, 190, 100, 30);
        
        cancel.setBounds(300, 190, 100, 30);
        
        add(label);
        add(user);
        add(texUser);
        add(pass);
        add(texPass);
        add(login);
        add(cancel);
        setSize(500, 300);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
}
