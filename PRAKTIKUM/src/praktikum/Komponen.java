package praktikum;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.Border;

public class Komponen extends JFrame{
    Border border = BorderFactory.createLineBorder(Color.WHITE, 5);
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    
    JButton ButDatar = new JButton("Bangun Datar");
    JButton ButRuang = new JButton("Bangun Ruang");
    JButton ButKubus = new JButton("Kubus");
    JButton ButBalok = new JButton("Balok");
    
    JLabel LabBalok = new JLabel("Balok");
    JLabel LabPanjang = new JLabel("Panjang");
    JLabel LabLebar = new JLabel("Lebar");
    JLabel LabTinggi = new JLabel("Tinggi");
    
    JLabel LabKubus = new JLabel("Kubus");
    JLabel LabSisi = new JLabel("Sisi");
    
    JTextField TexPanjang = new JTextField();
    JTextField TexLebar = new JTextField();
    JTextField TexTinggi = new JTextField();
    
    JTextField TexSisi = new JTextField();
    
    JButton back = new JButton("Back");
    JButton calculate = new JButton("Calculate");
    
}
