package Latihan2;

import javax.swing.*;

public class HelloWorldForm2 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HelloWorldForm2() {
        JLabel label = new JLabel("HelloWorld!");
        add(label);

        setTitle("Form Hello World");
        setSize(300, 100);
        // setVisible dipindahkan ke program utama
    }
}

