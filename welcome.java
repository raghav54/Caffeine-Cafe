import java.awt.*;

import javax.swing.*;
import java.awt.event.*;

public class welcome extends JFrame implements ActionListener {
	public static void main(String[] args) {
		new welcome();
	}

	JLabel l1, l2;
	JButton b1;

	welcome() {

		Container con = getContentPane();
		con.setLayout(null);
		ImageIcon ii = new ImageIcon("image/coffee1.jpg");
		l1 = new JLabel(ii);
		l1.setBounds(0, 0, 1450, 815);
		con.add(l1);

		l2 = new JLabel("WELCOME TO CAFFEINE CAFE");

		b1 = new JButton("GO");

		l2.setFont(new Font("", Font.HANGING_BASELINE, 50));
		l2.setForeground(Color.WHITE);
		l2.setBounds(300, 100, 1000, 100);
		b1.setFont(new Font("", Font.ROMAN_BASELINE, 25));
		
		b1.setBounds(600, 300, 100, 35);

		l1.add(l2);
		l1.add(b1);

		b1.addActionListener(this);

		setSize(2000, 2000);
		addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent ae) {
				setVisible(false);
			}
		}

		);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent ae) {
		new login();
		setVisible(false);
	}

}
