import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Final extends JFrame implements ActionListener {
	Final(String userid, double GrandTotal) {
		Container con = getContentPane();
		ImageIcon ii = new ImageIcon("image/coffee1.jpg");
		JLabel lll = new JLabel(ii);
		lll.setBounds(0, 0, 1450, 815);
		con.add(lll);
		setSize(1920, 1080);
		con.setLayout(null);
		JLabel l1, l2, l3, l4, l5;
		int temp = getRewardPoints(userid, GrandTotal);
		JButton b1 = new JButton("Exit");
		b1.addActionListener(this);
		l1 = new JLabel("Thank You :)");
		l2 = new JLabel("The Payment was Successful");
		l3 = new JLabel("Received ");
		l4 = new JLabel(Integer.toString(temp));
		l5 = new JLabel("Reward Points");
		l1.setBounds(600, 10, 900, 70);
		l1.setFont(new Font("", Font.HANGING_BASELINE, 50));
		l1.setForeground(Color.WHITE);
		l2.setBounds(450, 180, 1000, 70);
		l2.setFont(new Font("", Font.HANGING_BASELINE, 50));
		l2.setForeground(Color.WHITE);
		l3.setBounds(500, 310, 200, 70);
		l3.setFont(new Font("", Font.HANGING_BASELINE, 40));
		l3.setForeground(Color.WHITE);
		l4.setBounds(700, 310, 100, 70);
		l4.setFont(new Font("", Font.HANGING_BASELINE, 40));
		l4.setForeground(Color.WHITE);
		l5.setBounds(800, 310, 900, 70);
		l5.setFont(new Font("", Font.HANGING_BASELINE, 40));
		l5.setForeground(Color.WHITE);
		b1.setBounds(1000, 610, 150, 50);
		b1.setFont(new Font("", Font.TRUETYPE_FONT, 20));
		b1.setForeground(Color.BLACK);
		lll.add(l1);
		lll.add(l2);
		lll.add(l3);
		lll.add(l4);
		lll.add(l5);
		lll.add(b1);
		setVisible(true);
	}

	public int getRewardPoints(String userid, double Amount) {
		try {
			int points = 0;
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/caffeine", "root", "root");
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("Select Points from amount where userid = '" + userid + "';");
			while (rs.next())
			{
				points = rs.getInt("Points");
			}
			int newpoints = (int)(Amount / 100.00);
			points = points + newpoints;
			if (points == 100) {
				JOptionPane.showMessageDialog(this,
						"Congratulations! You have 100 points you can redeem them for discount of $100.00");
				points = points - 100;
			}
			Statement stm1 = con.createStatement();
			stm1.executeUpdate("Update amount set Points = " + points + " where userid = '" + userid + "';");
			return points;

		} catch (Exception e) {
			System.out.println(e);
			return -1;
		}

	}

	public void actionPerformed(ActionEvent ae) {
		new order();
		setVisible(false);
	}
}