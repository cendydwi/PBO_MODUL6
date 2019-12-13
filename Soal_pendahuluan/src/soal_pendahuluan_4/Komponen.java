package soal_pendahuluan_4;

import javax.swing.*;

public class Komponen extends JFrame{
    
    JLabel label = new JLabel("Silahkan Login");
    JLabel user = new JLabel("Username");
    JLabel pass = new JLabel("Password");
    
    JTextField texUser = new JTextField();
    JTextField texPass = new JTextField();
    
    JButton login = new JButton("Login");
    JButton cancel = new JButton("Cancel");
    
}
