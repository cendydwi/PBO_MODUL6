package soal_pendahuluan_2;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

public class GUI extends Komponen{
    public GUI() {
        label.setBounds(140,30,500,40);
        label.setFont(new Font("Consolas", Font.BOLD, 45));
        
        nama.setBounds(30, 110, 100, 30);
        texNama.setBounds(130, 110, 250, 30);
        
        nohp.setBounds(30, 150, 100, 30);
        texNohp.setBounds(130, 150, 250, 30);
        
        pass.setBounds(30, 190, 100, 30);
        texPass.setBounds(130, 190, 250, 30);
        
        insert.setBounds(30, 260, 100, 30);
        update.setBounds(165, 260, 100, 30);
        delete.setBounds(300, 260, 100, 30);
        
        tabel = new JTable();
        model.addColumn("Nama");
        model.addColumn("No HP");
        model.addColumn("Password");
        
        tabel.setModel(model);
        
        scrool = new JScrollPane(tabel);
        scrool.setBounds(30, 300, 360, 200);
        
        add(label);
        add(nama);
        add(texNama);
        add(nohp);
        add(texNohp);
        add(pass);
        add(texPass);
        add(insert);
        add(update);
        add(delete);
        add(scrool);
        setSize(450, 600);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
}
