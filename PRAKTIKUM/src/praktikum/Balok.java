package praktikum;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class Balok extends Komponen{
    public Balok() {
        LabBalok.setBounds(170, 0, 217, 50);
        LabBalok.setForeground(Color.WHITE);
        LabBalok.setFont(new Font("Arial", Font.BOLD, 20));
        
        LabPanjang.setBounds(10, 70, 100, 50);
        LabPanjang.setForeground(Color.WHITE);
        
        TexPanjang.setBounds(10, 110, 370, 30);
        TexPanjang.setBackground(Color.BLACK);
        TexPanjang.setForeground(Color.WHITE);
        TexPanjang.setFont(new Font("Arial", Font.PLAIN, 14));
        
        LabLebar.setBounds(10, 150, 100, 50);
        LabLebar.setForeground(Color.WHITE);
        
        TexLebar.setBounds(10, 190, 370, 30);
        TexLebar.setBackground(Color.BLACK);
        TexLebar.setForeground(Color.WHITE);
        TexLebar.setFont(new Font("Arial", Font.PLAIN, 14));
        
        LabTinggi.setBounds(10, 230, 100, 50);
        LabTinggi.setForeground(Color.WHITE);
        
        TexTinggi.setBounds(10, 270, 370, 30);
        TexTinggi.setBackground(Color.BLACK);
        TexTinggi.setForeground(Color.WHITE);
        TexTinggi.setFont(new Font("Arial", Font.PLAIN, 14));
        
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
                int p,l,t;
                p = Integer.parseInt(TexPanjang.getText());
                l = Integer.parseInt(TexLebar.getText());
                t = Integer.parseInt(TexTinggi.getText());
                
                double vol = p*l*t;
                
                JOptionPane.showMessageDialog(null, "Volume Balok Adalah "+vol);
                
            }
        });
        calculate.setBackground(Color.BLACK);
        calculate.setForeground(Color.WHITE);
        
        panel.setFocusable(true);
        panel.setBackground(Color.BLACK);
        panel.setBorder(border);
        
        panel.add(LabBalok);
        panel.add(LabPanjang);
        panel.add(TexPanjang);
        panel.add(LabLebar);
        panel.add(TexLebar);
        panel.add(LabTinggi);
        panel.add(TexTinggi);
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
