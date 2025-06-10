package Latihan1;

import javax.swing.*;

public class HelloWorldForm1 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HelloWorldForm1() {
        JLabel label = new JLabel("HelloWorld!");
        add(label);

        setTitle("Form Hello World");
        setSize(300, 100);
        setVisible(true);
    }
}

