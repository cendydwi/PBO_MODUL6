package praktikum;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Menu2 extends Komponen{
    public Menu2() {
        ButKubus.setBounds(5, 5, 280, 50);
        ButKubus.setBackground(Color.BLACK);
        ButKubus.setForeground(Color.WHITE);
        ButKubus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Kubus().setVisible(true);
            }
        });
        
        ButBalok.setBounds(5, 125, 280, 50);
        ButBalok.setBackground(Color.BLACK);
        ButBalok.setForeground(Color.WHITE);
        ButBalok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Balok().setVisible(true);
            }
        });
        
        panel.setFocusable(true);
        panel.setBackground(Color.BLACK);
        panel.setBorder(border);
        panel.add(ButKubus);
        panel.add(ButBalok);
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
    }
}
