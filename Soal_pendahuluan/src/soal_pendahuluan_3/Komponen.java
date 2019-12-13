package soal_pendahuluan_3;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Komponen extends JFrame{
    DefaultTableModel model = new DefaultTableModel();
    
    JLabel label = new JLabel("PELANGGAN");
    JLabel nama = new JLabel("Nama");
    JLabel nohp = new JLabel("No HP");
    
    JTextField texNama = new JTextField();
    JTextField texNohp = new JTextField();
    
    JButton insert = new JButton("Insert");
    JButton update = new JButton("Update");
    JButton delete = new JButton("Delete");
    
    JTable tabel = new JTable();
    JScrollPane scrool;
}
