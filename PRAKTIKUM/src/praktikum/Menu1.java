package praktikum;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Menu1 extends Komponen{
    public Menu1() {
        ButDatar.setBounds(5, 5, 280, 50);
        ButDatar.setBackground(Color.BLACK);
        ButDatar.setForeground(Color.WHITE);
        
        ButRuang.setBounds(5, 125, 280, 50);
        ButRuang.setBackground(Color.BLACK);
        ButRuang.setForeground(Color.WHITE);
        ButRuang.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Menu2().setVisible(true);
            }
        });
        
        panel.setFocusable(true);
        panel.setBackground(Color.BLACK);
        panel.setBorder(border);
        panel.add(ButDatar);
        panel.add(ButRuang);
        panel.setBounds(5,5,290,180);
        
        panel2.add(panel);
        panel2.setBackground(Color.BLACK);
        panel2.setSize(300,190);
        panel.setLayout(null);
        panel2.setLayout(null);
        add(panel2);
        
        setUndecorated(true);
        setSize(300,190);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
