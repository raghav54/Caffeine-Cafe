import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class register extends JFrame implements ActionListener {
	JLabel l1, l2, l3, l4, l5, l6, l7, o, n;
	JTextField t1, t2, t3, t4, t5, t6;
	JButton b1;
	JPasswordField p;

	register() {
		setTitle("REGISTRATION FORM");

		Container con = getContentPane();
		con.setLayout(null);
		n = new JLabel("Sign Up");
		n.setFont(new Font("", Font.HANGING_BASELINE, 40));
		n.setForeground(Color.WHITE);
		n.setBounds(850, 100, 500, 50);
		ImageIcon ii = new ImageIcon("image/coffee1.jpg");
		o = new JLabel(ii);
		o.setBounds(0, 0, 1450, 815);
		con.add(o);

		l1 = new JLabel("Name");
		l1.setFont(new Font("", Font.HANGING_BASELINE, 30));
		l1.setForeground(Color.WHITE);
		l1.setBounds(700, 200, 200, 100);

		t1 = new JTextField(10);
		t1.setBounds(900, 210, 240, 50);

		l3 = new JLabel("Password");
		l3.setFont(new Font("", Font.HANGING_BASELINE, 30));
		l3.setForeground(Color.WHITE);
		l3.setBounds(700, 300, 200, 100);

		p = new JPasswordField("");
		p.setBounds(900, 310, 240, 50);

		l6 = new JLabel("Phone_no");
		l6.setFont(new Font("", Font.HANGING_BASELINE, 30));
		l6.setForeground(Color.WHITE);
		l6.setBounds(700, 390, 200, 100);

		t6 = new JTextField(50);
		t6.setBounds(900, 400, 240, 50);

		l5 = new JLabel("Email");
		l5.setFont(new Font("", Font.HANGING_BASELINE, 30));
		l5.setForeground(Color.WHITE);
		l5.setBounds(700, 480, 200, 100);

		t5 = new JTextField(10);
		t5.setBounds(900, 500, 240, 50);

		b1 = new JButton("Submit");

		b1.setBounds(880, 600, 100, 40);

		t1.addActionListener(this);

		p.addActionListener(this);

		t5.addActionListener(this);

		t6.addActionListener(this);

		b1.addActionListener(this);
		o.add(n);
		o.add(l1);
		o.add(t1);
		o.add(l5);
		o.add(t5);

		o.add(l6);
		o.add(t6);
		o.add(l3);
		o.add(p);

		o.add(b1);

		setSize(1455, 1000);
		setVisible(true);

		addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent ae) {
				setVisible(false);
			}
		}

		);
	}

	public void actionPerformed(ActionEvent me) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/caffeine", "root", "root");
			Statement st = con.createStatement();
			String Name = t1.getText();

			String Email = t5.getText();

			int Phone_no = Integer.parseInt(t6.getText());
			String Password = p.getText();

			st.executeUpdate("insert into register values(null,'" + Name + "','" + Password + "','" + Email + "','"
					+ Phone_no + "')");

			new login();
			setVisible(false);
		}

		catch (Exception e) {
			System.out.println(e);
		}

	}

}