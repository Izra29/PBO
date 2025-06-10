package kasus2;

import javax.swing.*;
import java.awt.event.*;

public class PenjumlahanForm extends JFrame implements ActionListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField angka1Field, angka2Field;
    JButton jumlahButton;

    public PenjumlahanForm() {
        setTitle("Penjumlahan Dua Angka");
        setSize(300, 150);
        setLayout(null);

        JLabel label1 = new JLabel("Angka 1:");
        label1.setBounds(20, 20, 60, 25);
        add(label1);

        angka1Field = new JTextField();
        angka1Field.setBounds(100, 20, 150, 25);
        add(angka1Field);

        JLabel label2 = new JLabel("Angka 2:");
        label2.setBounds(20, 50, 60, 25);
        add(label2);

        angka2Field = new JTextField();
        angka2Field.setBounds(100, 50, 150, 25);
        add(angka2Field);

        jumlahButton = new JButton("Jumlahkan");
        jumlahButton.setBounds(80, 85, 120, 30);
        jumlahButton.addActionListener(this);
        add(jumlahButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int angka1 = Integer.parseInt(angka1Field.getText());
            int angka2 = Integer.parseInt(angka2Field.getText());
            int hasil = angka1 + angka2;

            JOptionPane.showMessageDialog(this, "Hasil: " + hasil);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan hanya angka!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new PenjumlahanForm();
    }
}

