package soal_pendahuluan_2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Komponen extends JFrame{
    DefaultTableModel model = new DefaultTableModel();
    
    JLabel label = new JLabel("PEGAWAI");
    JLabel nama = new JLabel("Nama");
    JLabel nohp = new JLabel("No HP");
    JLabel pass = new JLabel("Password");
    
    JTextField texNama = new JTextField();
    JTextField texNohp = new JTextField();
    JTextField texPass = new JTextField();
    
    JButton insert = new JButton("Insert");
    JButton update = new JButton("Update");
    JButton delete = new JButton("Delete");
    
    JTable tabel = new JTable();
    JScrollPane scrool;
}
