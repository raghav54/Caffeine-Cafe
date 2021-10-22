import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class login extends JFrame implements ActionListener {
	JTextField t1;
	JPasswordField t2, s;

	login() {
		Container con = getContentPane();
		setSize(1920, 1080);
		JLabel l1 = new JLabel("Login To Caffeine Café");
		l1.setFont(new Font("", Font.HANGING_BASELINE, 40));
		l1.setForeground(Color.WHITE);
		JLabel l2 = new JLabel("User id");
		l2.setFont(new Font("", Font.HANGING_BASELINE, 20));
		l2.setForeground(Color.WHITE);
		JLabel l3 = new JLabel("Password");
		l3.setFont(new Font("", Font.HANGING_BASELINE, 20));
		l3.setForeground(Color.WHITE);
		JButton b1 = new JButton("Login");
		JButton b2 = new JButton("Register");
		JButton b3 = new JButton("Exit");
		t1 = new JTextField("");
		t2 = new JPasswordField();
		s = new JPasswordField();
		ImageIcon i = new ImageIcon("image/coffee1.jpg");
		JLabel l = new JLabel(i);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		s.addActionListener(this);
		l.setLayout(null);
		l.setBounds(0, 0, 1920, 1080);

		l1.setBounds(770, 100, 500, 50);
		l2.setBounds(700, 200, 250, 50);
		l3.setBounds(700, 300, 250, 50);
		t1.setBounds(860, 200, 240, 50);
		t2.setBounds(860, 300, 240, 50);
		b1.setBounds(925, 400, 100, 40);
		b3.setBounds(925, 450, 100, 40);
		s.setBounds(880, 520, 190, 40);
		b2.setBounds(925, 580, 100, 40);
		con.add(l);
		l.add(l1);
		l.add(l2);
		l.add(l3);
		l.add(b1);
		l.add(s);
		l.add(b3);
		l.add(b2);
		l.add(t1);
		l.add(t2);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand() == "Exit")
			new welcome();

		else if (ae.getActionCommand() == "Register") {
			String x = s.getText();
			if (x.equals("allow")) {
				JOptionPane.showMessageDialog(this, "successful");
				new register();
				setVisible(false);
			} else {
				JOptionPane.showMessageDialog(this, "invalid code or please enter security code");

			}
		} else {
			try {
				String u, p;
				u = t1.getText();
				p = t2.getText();
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Caffeine", "root", "root");
				Statement stm = con.createStatement();
				ResultSet rs = stm.executeQuery(
						"Select Name, password from register where Name = '" + u + "' and password = '" + p + "'");
				if (rs.next()) {
					JOptionPane.showMessageDialog(this, "You have successfully Logged In!");

					new order();
				} else
					JOptionPane.showMessageDialog(this, "Sorry! Incorrect Username Or Password");
			} catch (Exception e) {
				System.out.println(e);
			}
			setVisible(false);
		}
	}
}
