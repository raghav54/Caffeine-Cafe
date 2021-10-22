import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class b extends JFrame implements ActionListener {
	double[] Amount = new double[21];
	double Total = 0.00, Taxes = 0.00, GrandTotal = 0.00;
	JPanel jp;
	int x = 1;
	JButton b;
	JLabel lll;
	JTextField t2;
	String userid;

	b(int Products, int Bill[]) {
		Container con = getContentPane();

		ImageIcon ii = new ImageIcon("image/coffee1.jpg");
		lll = new JLabel(ii);
		lll.setBounds(0, 0, 1450, 815);
		con.add(lll);
		for (int i = 0; i < 21; i++)
			Amount[i] = 0.00;
		setSize(1920, 1080);
		con.setLayout(null);
		int p = 0;
		int[] Position = new int[21];
		for (int i = 0; i < 21; i++) {
			Position[i] = -1;
		}
		for (int j = 0; j < 21; j++) {
			if (Bill[j] != 0) {
				Position[p] = j;
				p++;
			}
		}
		JLabel L1, L2, L3, L4;
		L1 = new JLabel("Item");
		L1.setFont(new Font("", Font.HANGING_BASELINE, 15));
		L1.setForeground(Color.WHITE);
		L2 = new JLabel("Price");
		L2.setFont(new Font("", Font.HANGING_BASELINE, 15));
		L2.setForeground(Color.WHITE);
		L3 = new JLabel("Quantity");
		L3.setFont(new Font("", Font.HANGING_BASELINE, 15));
		L3.setForeground(Color.WHITE);
		L4 = new JLabel("Amount");
		L4.setFont(new Font("", Font.HANGING_BASELINE, 15));
		L4.setForeground(Color.WHITE);
		L1.setBounds(700, 10, 50, 50);
		L2.setBounds(870, 10, 50, 50);
		L3.setBounds(1040, 10, 100, 50);
		L4.setBounds(1190, 10, 100, 50);
		lll.add(L1);
		lll.add(L2);
		lll.add(L3);
		lll.add(L4);
		for (int i = 0; i < Products; i++) {
			Amount[Position[i]] = (getPrice(Position[i])) * (Bill[Position[i]]);
			JLabel l0, l1, l2, l3, l4;
			l0 = new JLabel(".");
			l0.setForeground(Color.green);
			l0.setFont(new Font("", Font.BOLD, 50));
			l1 = new JLabel(getName(Position[i]));
			l1.setFont(new Font("", Font.HANGING_BASELINE, 15));
			l1.setForeground(Color.WHITE);
			l2 = new JLabel("$" + getPrice(Position[i]));
			l2.setFont(new Font("", Font.HANGING_BASELINE, 15));
			l2.setForeground(Color.WHITE);
			l3 = new JLabel(Integer.toString(Bill[Position[i]]));
			l3.setFont(new Font("", Font.HANGING_BASELINE, 15));
			l3.setForeground(Color.WHITE);
			l4 = new JLabel("$" + Double.toString(Amount[Position[i]]));
			l4.setFont(new Font("", Font.HANGING_BASELINE, 15));
			l4.setForeground(Color.WHITE);
			l0.setBounds(680, 35 + (35 * i), 10, 50);
			l1.setBounds(700, 50 + (35 * i), 100, 50);
			l2.setBounds(870, 50 + (35 * i), 50, 50);
			l3.setBounds(1040, 50 + (35 * i), 50, 50);
			l4.setBounds(1190, 50 + (35 * i), 50, 50);
			lll.add(l0);
			lll.add(l1);
			lll.add(l2);
			lll.add(l3);
			lll.add(l4);
		}
		for (int i = 0; i < 21; i++) {
			Total = Total + Amount[i];

		}
		Taxes = (5.00 / 100.00) * Total;
		GrandTotal = Total + Taxes;
		JLabel l0, l1, l2, l3, l4, l5;
		JButton b1;
		JLabel t1 = new JLabel("User Id");
		t1.setFont(new Font("", Font.HANGING_BASELINE, 20));
		t1.setForeground(Color.WHITE);
		t2 = new JTextField("");
		t1.setBounds(100, 10, 100, 40);
		t2.setBounds(180, 15, 200, 30);
		lll.add(t1);
		lll.add(t2);

		l0 = new JLabel("Total");
		l0.setFont(new Font("", Font.HANGING_BASELINE, 15));
		l0.setForeground(Color.WHITE);
		l1 = new JLabel("$" +Double.toString(Total));
		l1.setFont(new Font("", Font.HANGING_BASELINE, 15));
		l1.setForeground(Color.WHITE);
		l2 = new JLabel("Taxes");
		l2.setFont(new Font("", Font.HANGING_BASELINE, 15));
		l2.setForeground(Color.WHITE);
		l3 = new JLabel("$" + Double.toString(Taxes));
		l3.setFont(new Font("", Font.HANGING_BASELINE, 15));
		l3.setForeground(Color.WHITE);
		l4 = new JLabel("Grand Total");
		l4.setFont(new Font("", Font.HANGING_BASELINE, 15));
		l4.setForeground(Color.WHITE);
		l5 = new JLabel("$" + Double.toString(GrandTotal));
		l5.setFont(new Font("", Font.HANGING_BASELINE, 15));
		l5.setForeground(Color.WHITE);
		b1 = new JButton("Pay");
		b1.setFont(new Font("", Font.HANGING_BASELINE, 20));
		b1.setForeground(Color.BLACK);
		b1.addActionListener(this);
		l0.setBounds(840, 50 + (35 * Products), 100, 50);
		l1.setBounds(1090, 50 + (35 * Products), 100, 50);
		l2.setBounds(840, 85 + (35 * Products), 100, 50);
		l3.setBounds(1090, 85 + (35 * Products), 100, 50);
		l4.setBounds(840, 115 + (35 * Products), 100, 50);
		l5.setBounds(1090, 115 + (35 * Products), 100, 50);
		b1.setBounds(1090, 180 + (35 * Products), 130, 40);
		lll.add(l0);
		lll.add(l1);
		lll.add(l2);
		lll.add(l3);
		lll.add(l4);
		lll.add(l5);
		lll.add(b1);
		setVisible(true);
	}

	private String toString(double d) {
		// TODO Auto-generated method stub
		return null;
	}

	private LayoutManager newGridLayout(int i, int j) {

		return null;
	}

	public String getName(int x) {
		switch (x) {
		case 0:
			return "Cold Coffee";
		case 1:
			return "Cappucino";
		case 2:
			return "Mocha";
		case 3:
			return "Hot Coffee";
		case 4:
			return "Latté";
		case 5:
			return "Frappe";
		case 6:
			return "Soft Drink";
		case 7:
			return "Smoothie";
		case 8:
			return "Ice Tea";
		case 9:
			return "Tea";
		case 10:
			return "Fruit Juice";
		case 11:
			return "Burger";
		case 12:
			return "Pizza";
		case 13:
			return "Pasta";
		case 14:
			return "Patty";
		case 15:
			return "Paneer Wrap";
		case 16:
			return "Cake";
		case 17:
			return "Pastry";
		case 18:
			return "Chocolate";
		case 19:
			return "Donuts";
		case 20:
			return "Sweets";
		default:
			return "";
		}
	}

	public double getPrice(int x) {
		switch (x) {
		case 0:
			return 4.00;
		case 1:
			return 5.00;
		case 2:
			return 5.00;
		case 3:
			return 4.00;
		case 4:
			return 5.00;
		case 5:
			return 6.00;
		case 6:
			return 2.00;
		case 7:
			return 4.00;
		case 8:
			return 3.00;
		case 9:
			return 3.00;
		case 10:
			return 3.00;
		case 11:
			return 7.00;
		case 12:
			return 10.00;
		case 13:
			return 7.00;
		case 14:
			return 5.00;
		case 15:
			return 7.00;
		case 16:
			return 20.00;
		case 17:
			return 5.00;
		case 18:
			return 3.00;
		case 19:
			return 5.00;
		case 20:
			return 4.00;
		default:
			return 0.00;

		}
	}

	public void actionPerformed(ActionEvent ae) {
		JOptionPane.showMessageDialog(this, "Payment Successful");
		double amount = 0.0;
		userid = t2.getText();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/caffeine", "root", "root");
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("Select Amount from amount where userid = '" + userid + "';");
			if (rs.next() == true) {
				amount = rs.getDouble("Amount");
				amount = amount + GrandTotal;
				Statement stm1 = con.createStatement();
				stm1.executeUpdate("Update amount set Amount = '" + amount + "' where userid = '" + userid + "';");
			} else {
				Statement stm2 = con.createStatement();
				amount = amount + GrandTotal;
				stm2.executeUpdate("Insert into amount values (null,'" + userid + "'," + amount + ",0);");
				JOptionPane.showMessageDialog(this, "New User Successfully registered!");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		new Final(userid, GrandTotal);
		setVisible(false);
	}
}
