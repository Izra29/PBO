package Latihan3;

import javax.swing.*;
import java.awt.event.*;

public class HelloWorldForm3 extends JFrame implements ActionListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton tombol;

    public HelloWorldForm3() {
        JLabel label = new JLabel("HelloWorld!");
        add(label);

        tombol = new JButton("Klik Saya");
        add(tombol);

        tombol.addActionListener(this);

        setTitle("Form Hello World dengan Button");
        setLayout(new java.awt.FlowLayout());
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "Tombol telah diklik!");
    }
}
