package praktikum;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class Kubus extends Komponen{
    public Kubus() {
        LabKubus.setBounds(170, 0, 217, 50);
        LabKubus.setForeground(Color.WHITE);
        LabKubus.setFont(new Font("Arial", Font.BOLD, 20));
        
        LabSisi.setBounds(10, 150, 100, 50);
        LabSisi.setForeground(Color.WHITE);
        
        TexSisi.setBounds(10, 190, 370, 30);
        TexSisi.setBackground(Color.BLACK);
        TexSisi.setForeground(Color.WHITE);
        TexSisi.setFont(new Font("Arial", Font.PLAIN, 14));
        
        back.setBounds(10, 340, 70, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                kembali();
            }
        });
        
        calculate.setBounds(278, 340, 100, 30);
        calculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int s;
                s = Integer.parseInt(TexSisi.getText());
                
                double vol = s*s*s;
                
                JOptionPane.showMessageDialog(null, "Volume Kubus Adalah "+vol);
                
            }
        });
        calculate.setBackground(Color.BLACK);
        calculate.setForeground(Color.WHITE);
        
        panel.setFocusable(true);
        panel.setBackground(Color.BLACK);
        panel.setBorder(border);
        
        panel.add(LabKubus);
        panel.add(LabSisi);
        panel.add(TexSisi);
        panel.add(back);
        panel.add(calculate);
        panel.setBounds(5,5,390,400);
        
        panel2.add(panel);
        panel2.setBackground(Color.BLACK);
        panel2.setSize(400,410);
        panel.setLayout(null);
        panel2.setLayout(null);
        add(panel2);
        setUndecorated(true);
        setSize(400,410);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void kembali(){
        new Menu2().setVisible(true);
        this.setVisible(false);
    }
}
