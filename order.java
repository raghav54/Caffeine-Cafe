import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class order extends JFrame {
	int item = 0, Products = 0;
	int[] Bill = new int[21];
	JLabel l1, l2, l3, l4,l;

	order() {
		
		
	              
		
		for (int i = 0; i < 21; i++)
		Bill[i] = 0;
		l1 = new JLabel("Coffee");
		l1.setPreferredSize(new Dimension(250, 50));
		l2 = new JLabel("Beverages ");
		l2.setPreferredSize(new Dimension(250, 50));
		l3 = new JLabel("Dessert");
		l3.setPreferredSize(new Dimension(250, 50));
		l4 = new JLabel("Food");
		l4.setPreferredSize(new Dimension(250, 50));
		JTabbedPane tp = new JTabbedPane();
		Container con = getContentPane();
		tp.addTab("Coffee", new Coffee());
		tp.addTab("Beverages", new Beverages());
		tp.addTab("Dessert", new Dessert());
		tp.addTab("Food", new Food());
		tp.setTabComponentAt(0, l1);
		tp.setTabComponentAt(1, l2);
		tp.setTabComponentAt(2, l3);
		tp.setTabComponentAt(3, l4);
		con.add(tp);
		setSize(1920, 1080);
		setVisible(true);
	}
	public void or()
	{
		setVisible(false);
	}

	public static void main(String args[]) {
		new order();
	}

	public class Coffee extends JPanel implements ActionListener {
		JButton b11, b12, b21, b22, b31, b32, b41, b42, b51, b52, b61, b62, bcart;
		JLabel l11, l12, l13, l21, l22, l23, l31, l32, l33, l41, l42, l43, l51, l52, l53, l61, l62, l63;
		JLabel l14, l24, l34, l44, l54, l64;

		Coffee() {

			
			
			ImageIcon i= new ImageIcon("image/coffee2.jpg");
			l=new JLabel(i);
			l.setBounds(0,5,1450,815);
	                add(l);
	                
	        l12 = new JLabel("Cold Coffee");
			l22 = new JLabel("Cappucino");
			l32 = new JLabel("Mocha");
			l42 = new JLabel("Hot Coffee");
			l52 = new JLabel("Latté");
			l62 = new JLabel("Frappe");
			l14 = new JLabel("$4.00");
			l24 = new JLabel("$5.00");
			l34 = new JLabel("$5.00");
			l44 = new JLabel("$4.00");
			l54 = new JLabel("$5.00");
			l64 = new JLabel("$6.00");
			
			l12.setForeground(Color.white);
			l22.setForeground(Color.white);
			l32.setForeground(Color.white);
			l42.setForeground(Color.white);
			l52.setForeground(Color.white);
			l62.setForeground(Color.white);
			l14.setForeground(Color.white);
			l24.setForeground(Color.white);
			l34.setForeground(Color.white);
			l44.setForeground(Color.white);
			l54.setForeground(Color.white);
			l64.setForeground(Color.white);
			
			
					
			
			
			
			l11 = new JLabel(".");
			l11.setForeground(Color.WHITE);
			l11.setFont(new Font("", Font.BOLD, 50));
			l21 = new JLabel(".");
			l21.setForeground(Color.WHITE);
			l21.setFont(new Font("", Font.BOLD, 50));
			l31 = new JLabel(".");
			l31.setForeground(Color.WHITE);
			l31.setFont(new Font("", Font.BOLD, 50));
			l41 = new JLabel(".");
			l41.setForeground(Color.WHITE);
			l41.setFont(new Font("", Font.BOLD, 50));
			l51 = new JLabel(".");
			l51.setForeground(Color.WHITE);
			l51.setFont(new Font("", Font.BOLD, 50));
			l61 = new JLabel(".");
			l61.setForeground(Color.WHITE);
			l61.setFont(new Font("", Font.BOLD, 50));
			l13 = new JLabel("0");
			l23 = new JLabel("0");
			l33 = new JLabel("0");
			l43 = new JLabel("0");
			l53 = new JLabel("0");
			l63 = new JLabel("0");
			
			l13.setForeground(Color.white);
			l23.setForeground(Color.white);
			l33.setForeground(Color.white);
			l43.setForeground(Color.white);
			l53.setForeground(Color.white);
			l63.setForeground(Color.white);
		
			
			b11 = new JButton("-");
			b12 = new JButton("+");
			b21 = new JButton("-");
			b22 = new JButton("+");
			b31 = new JButton("-");
			b32 = new JButton("+");
			b41 = new JButton("-");
			b42 = new JButton("+");
			b51 = new JButton("-");
			b52 = new JButton("+");
			b61 = new JButton("-");
			b62 = new JButton("+");
			bcart = new JButton("My Cart (" + item + ")");
			
			bcart.addActionListener(this);
			b11.addActionListener(this);
			b12.addActionListener(this);
			b21.addActionListener(this);
			b22.addActionListener(this);
			b31.addActionListener(this);
			b32.addActionListener(this);
			b41.addActionListener(this);
			b42.addActionListener(this);
			b51.addActionListener(this);
			b52.addActionListener(this);
			b61.addActionListener(this);
			b62.addActionListener(this);
			
			bcart.setBounds(1000, 10, 150, 60);
			l11.setBounds(380, 85, 10, 40);
			l12.setBounds(400, 100, 100, 40);
			l14.setBounds(500, 100, 50, 40);
			b11.setBounds(580, 100, 100, 40);
			l13.setBounds(755, 100, 100, 40);
			b12.setBounds(840, 100, 100, 40);
			l21.setBounds(380, 155, 10, 40);
			l22.setBounds(400, 170, 100, 40);
			l24.setBounds(500, 170, 50, 40);
			b21.setBounds(580, 170, 100, 40);
			l23.setBounds(755, 170, 100, 40);
			b22.setBounds(840, 170, 100, 40);
			l31.setBounds(380, 225, 10, 40);
			l32.setBounds(400, 240, 100, 40);
			l34.setBounds(500, 240, 50, 40);
			b31.setBounds(580, 240, 100, 40);
			l33.setBounds(755, 240, 100, 40);
			b32.setBounds(840, 240, 100, 40);
			l41.setBounds(380, 295, 10, 40);
			l42.setBounds(400, 310, 100, 40);
			l44.setBounds(500, 310, 50, 40);
			b41.setBounds(580, 310, 100, 40);
			l43.setBounds(755, 310, 100, 40);
			b42.setBounds(840, 310, 100, 40);
			l51.setBounds(380, 365, 10, 40);
			l52.setBounds(400, 380, 100, 40);
			l54.setBounds(500, 380, 50, 40);
			b51.setBounds(580, 380, 100, 40);
			l53.setBounds(755, 380, 100, 40);
			b52.setBounds(840, 380, 100, 40);
			l61.setBounds(380, 435, 10, 40);
			l62.setBounds(400, 450, 100, 40);
			l64.setBounds(500, 450, 50, 40);
			b61.setBounds(580, 450, 100, 40);
			l63.setBounds(755, 450, 100, 40);
			b62.setBounds(840, 450, 100, 40);
			l.add(l11);
			l.add(l12);
			l.add(l13);
			l.add(b11);
			l.add(b12);
			l.add(l21);
			l.add(l22);
			l.add(l23);
			l.add(b21);
			l.add(b22);
			l.add(l31);
			l.add(l32);
			l.add(l33);
			l.add(b31);
			l.add(b32);
			l.add(l41);
			l.add(l42);
			l.add(l43);
			l.add(b41);
		    l.add(b42);
			l.add(l51);
			l.add(l52);
			l.add(l53);
			l.add(b51);
			l.add(b52);
			l.add(l61);
			l.add(l62);
			l.add(l63);
			l.add(b61);
			l.add(b62);
			l.add(l14);
			l.add(l24);
	     	l.add(l34);
			l.add(l44);
			l.add(l54);
			l.add(l64);
			l.add(bcart);
			setVisible(true);
			setSize(1920, 1080);
			setLayout(null);
		}

		public void actionPerformed(ActionEvent ae) {
			if (ae.getSource() == b11) {
				int a = Integer.parseInt(l13.getText());
				if (a == 0)
					;
				else {
					a--;
					String s = Integer.toString(a);
					l13.setText(s);
					if (item != 0)
						item--;
					if (Bill[0] != 0)
						Bill[0]--;
					if (Bill[0] == 0)
						Products--;
					bcart.setText("My Cart (" + item + ")");
				}
			} else if (ae.getSource() == b12) {
				int a = Integer.parseInt(l13.getText());
				a++;
				String s = Integer.toString(a);
				l13.setText(s);
				item++;
				Bill[0]++;
				if (Bill[0] == 1)
					Products++;
				bcart.setText("My Cart (" + item + ")");
			} else if (ae.getSource() == b21) {
				int a = Integer.parseInt(l23.getText());
				if (a == 0)
					;
				else {
					a--;
					String s = Integer.toString(a);
					l23.setText(s);
					if (item != 0)
						item--;
					if (Bill[1] != 0)
						Bill[1]--;
					bcart.setText("My Cart (" + item + ")");
					if (Bill[1] == 0)
						Products--;
				}
			} else if (ae.getSource() == b22) {
				int a = Integer.parseInt(l23.getText());
				a++;
				String s = Integer.toString(a);
				l23.setText(s);
				item++;
				Bill[1]++;
				if (Bill[1] == 1)
					Products++;
				bcart.setText("My Cart (" + item + ")");
			} else if (ae.getSource() == b31) {
				int a = Integer.parseInt(l33.getText());
				if (a == 0)
					;
				else {
					a--;
					String s = Integer.toString(a);
					l33.setText(s);
					if (item != 0)
						item--;
					if (Bill[2] != 0)
						Bill[2]--;
					bcart.setText("My Cart (" + item + ")");
					if (Bill[2] == 0)
						Products--;
				}
			} else if (ae.getSource() == b32) {
				int a = Integer.parseInt(l33.getText());
				a++;
				String s = Integer.toString(a);
				l33.setText(s);
				item++;
				Bill[2]++;
				if (Bill[2] == 1)
					Products++;
				bcart.setText("My Cart (" + item + ")");
			} else if (ae.getSource() == b41) {
				int a = Integer.parseInt(l43.getText());
				if (a == 0)
					;
				else {
					a--;
					String s = Integer.toString(a);
					l43.setText(s);
					if (item != 0)
						item--;
					if (Bill[3] != 0)
						Bill[3]--;
					if (Bill[3] == 0)
						Products--;
					bcart.setText("My Cart (" + item + ")");
				}
			} else if (ae.getSource() == b42) {
				int a = Integer.parseInt(l43.getText());
				a++;
				String s = Integer.toString(a);
				l43.setText(s);
				item++;
				Bill[3]++;
				if (Bill[3] == 1)
					Products++;
				bcart.setText("My Cart (" + item + ")");
			} else if (ae.getSource() == b51) {
				int a = Integer.parseInt(l53.getText());
				if (a == 0)
					;
				else {
					a--;
					String s = Integer.toString(a);
					l53.setText(s);
					if (item != 0)
						item--;
					if (Bill[4] != 0)
						Bill[4]--;
					if (Bill[4] == 0)
						Products--;
					bcart.setText("My Cart (" + item + ")");
				}
			} else if (ae.getSource() == b52) {
				int a = Integer.parseInt(l53.getText());
				a++;
				String s = Integer.toString(a);
				l53.setText(s);
				item++;
				Bill[4]++;
				if (Bill[4] == 1)
					Products++;
				bcart.setText("My Cart (" + item + ")");
			} else if (ae.getSource() == b61) {
				int a = Integer.parseInt(l63.getText());
				if (a == 0)
					;
				else {
					a--;
					String s = Integer.toString(a);
					l63.setText(s);
					if (item != 0)
						item--;
					if (Bill[5] != 0)
						Bill[5]--;
					if (Bill[5] == 0)
						Products--;
					bcart.setText("My Cart (" + item + ")");
				}
			} else if (ae.getSource() == b62) {
				int a = Integer.parseInt(l63.getText());
				a++;
				String s = Integer.toString(a);
				l63.setText(s);
				item++;
				Bill[5]++;
				if (Bill[5] == 1)
					Products++;
				bcart.setText("My Cart (" + item + ")");
			} else if (ae.getSource() == bcart) {
				new b(Products, Bill);
			
			or();
		}
		}
	}

	public class Beverages extends JPanel implements ActionListener {
		JButton b11, b12, b21, b22, b31, b32, b41, b42, b51, b52, bcart;
		JLabel l11, l12, l13, l21, l22, l23, l31, l32, l33, l41, l42, l43, l51, l52, l53;
		JLabel l14, l24, l34, l44, l54;

		Beverages() {
			
			ImageIcon i= new ImageIcon("image/coffee2.jpg");
			l=new JLabel(i);
			l.setBounds(0,5,1450,815);
	                add(l);
			l12 = new JLabel("Soft Drink");
			l22 = new JLabel("Smoothie");
			l32 = new JLabel("Ice Tea");
			l42 = new JLabel("Hot Tea");
			l52 = new JLabel("Fruit Juice");
			l14 = new JLabel("$2.00");
			l24 = new JLabel("$4.00");
			l34 = new JLabel("$3.00");
			l44 = new JLabel("$3.00");
			l54 = new JLabel("$3.00");
			l11 = new JLabel(".");


			
			l12.setForeground(Color.white);
			l22.setForeground(Color.white);
			l32.setForeground(Color.white);
			l42.setForeground(Color.white);
			l52.setForeground(Color.white);
			l14.setForeground(Color.white);
			l24.setForeground(Color.white);
			l34.setForeground(Color.white);
			l44.setForeground(Color.white);
			l54.setForeground(Color.white);
			
			
			l11.setForeground(Color.WHITE);
			l11.setFont(new Font("", Font.BOLD, 50));
			l21 = new JLabel(".");
			l21.setForeground(Color.WHITE);
			l21.setFont(new Font("", Font.BOLD, 50));
			l31 = new JLabel(".");
			l31.setForeground(Color.WHITE);
			l31.setFont(new Font("", Font.BOLD, 50));
			l41 = new JLabel(".");
			l41.setForeground(Color.WHITE);
			l41.setFont(new Font("", Font.BOLD, 50));
			l51 = new JLabel(".");
			l51.setForeground(Color.WHITE);
			l51.setFont(new Font("", Font.BOLD, 50));
			l13 = new JLabel("0");
			l23 = new JLabel("0");
			l33 = new JLabel("0");
			l43 = new JLabel("0");
			l53 = new JLabel("0");
			
			l13.setForeground(Color.white);
			l23.setForeground(Color.white);
			l33.setForeground(Color.white);
			l43.setForeground(Color.white);
			l53.setForeground(Color.white);
			
		
			
			b11 = new JButton("-");
			b12 = new JButton("+");
			b21 = new JButton("-");
			b22 = new JButton("+");
			b31 = new JButton("-");
			b32 = new JButton("+");
			b41 = new JButton("-");
			b42 = new JButton("+");
			b51 = new JButton("-");
			b52 = new JButton("+");
			bcart = new JButton("My Cart (" + item + ")");
			bcart.addActionListener(this);
			b11.addActionListener(this);
			b12.addActionListener(this);
			b21.addActionListener(this);
			b22.addActionListener(this);
			b31.addActionListener(this);
			b32.addActionListener(this);
			b41.addActionListener(this);
			b42.addActionListener(this);
			b51.addActionListener(this);
			b52.addActionListener(this);
			setSize(1920, 1080);
			setLayout(null);
			bcart.setBounds(1000, 10, 150, 60);
			l11.setBounds(380, 85, 10, 40);
			l12.setBounds(400, 100, 100, 40);
			l14.setBounds(500, 100, 50, 40);
			b11.setBounds(580, 100, 100, 40);
			l13.setBounds(755, 100, 100, 40);
			b12.setBounds(840, 100, 100, 40);
			l21.setBounds(380, 155, 10, 40);
			l22.setBounds(400, 170, 100, 40);
			l24.setBounds(500, 170, 50, 40);
			b21.setBounds(580, 170, 100, 40);
			l23.setBounds(755, 170, 100, 40);
			b22.setBounds(840, 170, 100, 40);
			l31.setBounds(380, 225, 10, 40);
			l32.setBounds(400, 240, 100, 40);
			l34.setBounds(500, 240, 50, 40);
			b31.setBounds(580, 240, 100, 40);
			l33.setBounds(755, 240, 100, 40);
			b32.setBounds(840, 240, 100, 40);
			l41.setBounds(380, 295, 10, 40);
			l42.setBounds(400, 310, 100, 40);
			l44.setBounds(500, 310, 50, 40);
			b41.setBounds(580, 310, 100, 40);
			l43.setBounds(755, 310, 100, 40);
			b42.setBounds(840, 310, 100, 40);
			l51.setBounds(380, 365, 10, 40);
			l52.setBounds(400, 380, 100, 40);
			l54.setBounds(500, 380, 50, 40);
			b51.setBounds(580, 380, 100, 40);
			l53.setBounds(755, 380, 100, 40);
			b52.setBounds(840, 380, 100, 40);
			l.add(l11);
			l.add(l12);
			l.add(l13);
			l.add(b11);
			l.add(b12);
			l.add(l21);
			l.add(l22);
			l.add(l23);
			l.add(b21);
			l.add(b22);
			l.add(l31);
			l.add(l32);
			l.add(l33);
			l.add(b31);
			l.add(b32);
			l.add(l41);
			l.add(l42);
			l.add(l43);
			l.add(b41);
			l.add(b42);
			l.add(l51);
			l.add(l52);
			l.add(l53);
			l.add(b51);
			l.add(b52);
			l.add(l14);
			l.add(l24);
			l.add(l34);
			l.add(l44);
			l.add(l54);
			l.add(bcart);
			setVisible(true);
		}

		public void actionPerformed(ActionEvent ae) {
			if (ae.getSource() == b11) {
				int a = Integer.parseInt(l13.getText());
				if (a == 0)
					;
				else {
					a--;
					String s = Integer.toString(a);
					l13.setText(s);
					if (item != 0)
						item--;
					if (Bill[6] != 0)
						Bill[6]--;
					if (Bill[6] == 0)
						Products--;
					bcart.setText("My Cart (" + item + ")");
				}
			} else if (ae.getSource() == b12) {
				int a = Integer.parseInt(l13.getText());
				a++;
				String s = Integer.toString(a);
				l13.setText(s);
				item++;
				Bill[6]++;
				if (Bill[6] == 1)
					Products++;
				bcart.setText("My Cart (" + item + ")");
			} else if (ae.getSource() == b21) {
				int a = Integer.parseInt(l23.getText());
				if (a == 0)
					;
				else {
					a--;
					String s = Integer.toString(a);
					l23.setText(s);
					if (item != 0)
						item--;
					if (Bill[7] != 0)
						Bill[7]--;
					if (Bill[7] == 0)
						Products--;
					bcart.setText("My Cart (" + item + ")");
				}
			} else if (ae.getSource() == b22) {
				int a = Integer.parseInt(l23.getText());
				a++;
				String s = Integer.toString(a);
				l23.setText(s);
				item++;
				Bill[7]++;
				if (Bill[7] == 1)
					Products++;
				bcart.setText("My Cart (" + item + ")");
			} else if (ae.getSource() == b31) {
				int a = Integer.parseInt(l33.getText());
				if (a == 0)
					;
				else {
					a--;
					String s = Integer.toString(a);
					l33.setText(s);
					if (item != 0)
						item--;
					if (Bill[8] != 0)
						Bill[8]--;
					if (Bill[8] == 0)
						Products--;
					bcart.setText("My Cart (" + item + ")");
				}
			} else if (ae.getSource() == b32) {
				int a = Integer.parseInt(l33.getText());
				a++;
				String s = Integer.toString(a);
				l33.setText(s);
				item++;
				Bill[8]++;
				if (Bill[8] == 1)
					Products++;
				bcart.setText("My Cart (" + item + ")");
			} else if (ae.getSource() == b41) {
				int a = Integer.parseInt(l43.getText());
				if (a == 0)
					;
				else {
					a--;
					String s = Integer.toString(a);
					l43.setText(s);
					if (item != 0)
						item--;
					if (Bill[9] != 0)
						Bill[9]--;
					if (Bill[9] == 0)
						Products--;
					bcart.setText("My Cart (" + item + ")");
				}
			} else if (ae.getSource() == b42) {
				int a = Integer.parseInt(l43.getText());
				a++;
				String s = Integer.toString(a);
				l43.setText(s);
				item++;
				Bill[9]++;
				if (Bill[9] == 1)
					Products++;
				bcart.setText("My Cart (" + item + ")");
			} else if (ae.getSource() == b51) {
				int a = Integer.parseInt(l53.getText());
				if (a == 0)
					;
				else {
					a--;
					String s = Integer.toString(a);
					l53.setText(s);
					if (item != 0)
						item--;
					if (Bill[10] != 0)
						Bill[10]--;
					if (Bill[10] == 0)
						Products--;
					bcart.setText("My Cart (" + item + ")");
				}
			} else if (ae.getSource() == b52) {
				int a = Integer.parseInt(l53.getText());
				a++;
				String s = Integer.toString(a);
				l53.setText(s);
				item++;
				Bill[10]++;
				if (Bill[10] == 1)
					Products++;
				bcart.setText("My Cart (" + item + ")");
			} else if (ae.getSource() == bcart) {
				new b(Products, Bill);
				or();
			}
		}
	}

	public class Dessert extends JPanel implements ActionListener {
		JButton b11, b12, b21, b22, b31, b32, b41, b42, b51, b52, bcart;
		JLabel l11, l12, l13, l21, l22, l23, l31, l32, l33, l41, l42, l43, l51, l52, l53;
		JLabel l14, l24, l34, l44, l54;

		Dessert() {
			
			
			ImageIcon i= new ImageIcon("image/coffee2.jpg");
			l=new JLabel(i);
			l.setBounds(0,5,1450,815);
	                add(l);
	                
			l12 = new JLabel("Cake");
			l22 = new JLabel("Pastry");
			l32 = new JLabel("Chocolate");
			l42 = new JLabel("Donuts");
			l52 = new JLabel("Sweets");
			l14 = new JLabel("$20.00");
			l24 = new JLabel("$5.00");
			l34 = new JLabel("$3.00");
			l44 = new JLabel("$5.00");
			l54 = new JLabel("$4.00");
			l11 = new JLabel(".");
			l12.setForeground(Color.white);
			l22.setForeground(Color.white);
			l32.setForeground(Color.white);
			l42.setForeground(Color.white);
			l52.setForeground(Color.white);
			l14.setForeground(Color.white);
			l24.setForeground(Color.white);
			l34.setForeground(Color.white);
			l44.setForeground(Color.white);
			l54.setForeground(Color.white);
		
         
			l11.setForeground(Color.WHITE);
			l11.setFont(new Font("", Font.BOLD, 50));
			l21 = new JLabel(".");
			l21.setForeground(Color.WHITE);
			l21.setFont(new Font("", Font.BOLD, 50));
			l31 = new JLabel(".");
			l31.setForeground(Color.WHITE);
			l31.setFont(new Font("", Font.BOLD, 50));
			l41 = new JLabel(".");
			l41.setForeground(Color.WHITE);
			l41.setFont(new Font("", Font.BOLD, 50));
			l51 = new JLabel(".");
			l51.setForeground(Color.WHITE);
			l51.setFont(new Font("", Font.BOLD, 50));
			l13 = new JLabel("0");
			l23 = new JLabel("0");
			l33 = new JLabel("0");
			l43 = new JLabel("0");
			l53 = new JLabel("0");
			
			l13.setForeground(Color.white);
			l23.setForeground(Color.white);
			l33.setForeground(Color.white);
			l43.setForeground(Color.white);
			l53.setForeground(Color.white);
		
		
			
			b11 = new JButton("-");
			b12 = new JButton("+");
			b21 = new JButton("-");
			b22 = new JButton("+");
			b31 = new JButton("-");
			b32 = new JButton("+");
			b41 = new JButton("-");
			b42 = new JButton("+");
			b51 = new JButton("-");
			b52 = new JButton("+");
			bcart = new JButton("My Cart (" + item + ")");
			bcart.addActionListener(this);
			b11.addActionListener(this);
			b12.addActionListener(this);
			b21.addActionListener(this);
			b22.addActionListener(this);
			b31.addActionListener(this);
			b32.addActionListener(this);
			b41.addActionListener(this);
			b42.addActionListener(this);
			b51.addActionListener(this);
			b52.addActionListener(this);
			setSize(1920, 1080);
			setLayout(null);
			bcart.setBounds(1000, 10, 150, 60);
			l11.setBounds(380, 85, 10, 40);
			l12.setBounds(400, 100, 100, 40);
			l14.setBounds(500, 100, 50, 40);
			b11.setBounds(580, 100, 100, 40);
			l13.setBounds(755, 100, 100, 40);
			b12.setBounds(840, 100, 100, 40);
			l21.setBounds(380, 155, 10, 40);
			l22.setBounds(400, 170, 100, 40);
			l24.setBounds(500, 170, 50, 40);
			b21.setBounds(580, 170, 100, 40);
			l23.setBounds(755, 170, 100, 40);
			b22.setBounds(840, 170, 100, 40);
			l31.setBounds(380, 225, 10, 40);
			l32.setBounds(400, 240, 100, 40);
			l34.setBounds(500, 240, 50, 40);
			b31.setBounds(580, 240, 100, 40);
			l33.setBounds(755, 240, 100, 40);
			b32.setBounds(840, 240, 100, 40);
			l41.setBounds(380, 295, 10, 40);
			l42.setBounds(400, 310, 100, 40);
			l44.setBounds(500, 310, 50, 40);
			b41.setBounds(580, 310, 100, 40);
			l43.setBounds(755, 310, 100, 40);
			b42.setBounds(840, 310, 100, 40);
			l51.setBounds(380, 365, 10, 40);
			l52.setBounds(400, 380, 100, 40);
			l54.setBounds(500, 380, 50, 40);
			b51.setBounds(580, 380, 100, 40);
			l53.setBounds(755, 380, 100, 40);
			b52.setBounds(840, 380, 100, 40);
			l.add(l11);
			l.add(l12);
			l.add(l13);
			l.add(b11);
			l.add(b12);
			l.add(l21);
			l.add(l22);
			l.add(l23);
			l.add(b21);
			l.add(b22);
			l.add(l31);
			l.add(l32);
			l.add(l33);
			l.add(b31);
			l.add(b32);
			l.add(l41);
			l.add(l42);
			l.add(l43);
			l.add(b41);
			l.add(b42);
			l.add(l51);
			l.add(l52);
			l.add(l53);
			l.add(b51);
			l.add(b52);
			l.add(l14);
			l.add(l24);
			l.add(l34);
			l.add(l44);
			l.add(l54);
			l.add(bcart);
			setVisible(true);
		}

		public void actionPerformed(ActionEvent ae) {
			if (ae.getSource() == b11) {
				int a = Integer.parseInt(l13.getText());
				if (a == 0)
					;
				else {
					a--;
					String s = Integer.toString(a);
					l13.setText(s);
					if (item != 0)
						item--;
					if (Bill[11] != 0)
						Bill[11]--;
					if (Bill[11] == 0)
						Products--;
					bcart.setText("My Cart (" + item + ")");
				}
			} else if (ae.getSource() == b12) {
				int a = Integer.parseInt(l13.getText());
				a++;
				String s = Integer.toString(a);
				l13.setText(s);
				item++;
				Bill[11]++;
				if (Bill[11] == 1)
					Products++;
				bcart.setText("My Cart (" + item + ")");
			} else if (ae.getSource() == b21) {
				int a = Integer.parseInt(l23.getText());
				if (a == 0)
					;
				else {
					a--;
					String s = Integer.toString(a);
					l23.setText(s);
					if (item != 0)
						item--;
					if (Bill[12] != 0)
						Bill[12]--;
					if (Bill[12] == 0)
						Products--;
					bcart.setText("My Cart (" + item + ")");
				}
			} else if (ae.getSource() == b22) {
				int a = Integer.parseInt(l23.getText());
				a++;
				String s = Integer.toString(a);
				l23.setText(s);
				item++;
				Bill[12]++;
				if (Bill[12] == 1)
					Products++;
				bcart.setText("My Cart (" + item + ")");
			} else if (ae.getSource() == b31) {
				int a = Integer.parseInt(l33.getText());
				if (a == 0)
					;
				else {
					a--;
					String s = Integer.toString(a);
					l33.setText(s);
					if (item != 0)
						item--;
					if (Bill[13] != 0)
						Bill[13]--;
					if (Bill[13] == 0)
						Products--;
					bcart.setText("My Cart (" + item + ")");
				}
			} else if (ae.getSource() == b32) {
				int a = Integer.parseInt(l33.getText());
				a++;
				String s = Integer.toString(a);
				l33.setText(s);
				item++;
				Bill[13]++;
				if (Bill[13] == 1)
					Products++;
				bcart.setText("My Cart (" + item + ")");
			} else if (ae.getSource() == b41) {
				int a = Integer.parseInt(l43.getText());
				if (a == 0)
					;
				else {
					a--;
					String s = Integer.toString(a);
					l43.setText(s);
					if (item != 0)
						item--;
					if (Bill[14] != 0)
						Bill[14]--;
					if (Bill[14] == 0)
						Products--;
					bcart.setText("My Cart (" + item + ")");
				}
			} else if (ae.getSource() == b42) {
				int a = Integer.parseInt(l43.getText());
				a++;
				String s = Integer.toString(a);
				l43.setText(s);
				item++;
				Bill[14]++;
				if (Bill[14] == 1)
					Products++;
				bcart.setText("My Cart (" + item + ")");
			} else if (ae.getSource() == b51) {
				int a = Integer.parseInt(l53.getText());
				if (a == 0)
					;
				else {
					a--;
					String s = Integer.toString(a);
					l53.setText(s);
					if (item != 0)
						item--;
					if (Bill[15] != 0)
						Bill[15]--;
					if (Bill[15] == 0)
						Products--;
					bcart.setText("My Cart (" + item + ")");
				}
			} else if (ae.getSource() == b52) {
				int a = Integer.parseInt(l53.getText());
				a++;
				String s = Integer.toString(a);
				l53.setText(s);
				item++;
				Bill[15]++;
				if (Bill[15] == 1)
					Products++;
				bcart.setText("My Cart (" + item + ")");
			} else if (ae.getSource() == bcart) {
				new b(Products, Bill);
				or();
			}
		}
	}

	public class Food extends JPanel implements ActionListener {
		JButton b11, b12, b21, b22, b31, b32, b41, b42, b51, b52, bcart;
		JLabel l11, l12, l13, l21, l22, l23, l31, l32, l33, l41, l42, l43, l51, l52, l53;
		JLabel l14, l24, l34, l44, l54;

		Food() {
			
			ImageIcon i= new ImageIcon("image/coffee2.jpg");
			l=new JLabel(i);
			l.setBounds(0,5,1450,815);
	                add(l);
	                
			l12 = new JLabel("Burger");
			l22 = new JLabel("Pizza");
			l32 = new JLabel("Pasta");
			l42 = new JLabel("Patty");
			l52 = new JLabel("Paneer Wrap");
			l14 = new JLabel("$7.00");
			l24 = new JLabel("$10.00");
			l34 = new JLabel("$7.00");
			l44 = new JLabel("$5.00");
			l54 = new JLabel("$7.00");
			l11 = new JLabel(".");
			
			l12.setForeground(Color.white);
			l22.setForeground(Color.white);
			l32.setForeground(Color.white);
			l42.setForeground(Color.white);
			l52.setForeground(Color.white);
			l14.setForeground(Color.white);
			l24.setForeground(Color.white);
			l34.setForeground(Color.white);
			l44.setForeground(Color.white);
			l54.setForeground(Color.white);
			
			
			l11.setForeground(Color.WHITE);
			l11.setFont(new Font("", Font.BOLD, 50));
			l21 = new JLabel(".");
			l21.setForeground(Color.WHITE);
			l21.setFont(new Font("", Font.BOLD, 50));
			l31 = new JLabel(".");
			l31.setForeground(Color.WHITE);
			l31.setFont(new Font("", Font.BOLD, 50));
			l41 = new JLabel(".");
			l41.setForeground(Color.WHITE);
			l41.setFont(new Font("", Font.BOLD, 50));
			l51 = new JLabel(".");
			l51.setForeground(Color.WHITE);
			l51.setFont(new Font("", Font.BOLD, 50));
			l13 = new JLabel("0");
			l23 = new JLabel("0");
			l33 = new JLabel("0");
			l43 = new JLabel("0");
			l53 = new JLabel("0");
			
			
			l13.setForeground(Color.white);
			l23.setForeground(Color.white);
			l33.setForeground(Color.white);
			l43.setForeground(Color.white);
			l53.setForeground(Color.white);
			
			b11 = new JButton("-");
			b12 = new JButton("+");
			b21 = new JButton("-");
			b22 = new JButton("+");
			b31 = new JButton("-");
			b32 = new JButton("+");
			b41 = new JButton("-");
			b42 = new JButton("+");
			b51 = new JButton("-");
			b52 = new JButton("+");
			bcart = new JButton("My Cart (" + item + ")");
			bcart.addActionListener(this);
			b11.addActionListener(this);
			b12.addActionListener(this);
			b21.addActionListener(this);
			b22.addActionListener(this);
			b31.addActionListener(this);
			b32.addActionListener(this);
			b41.addActionListener(this);
			b42.addActionListener(this);
			b51.addActionListener(this);
			b52.addActionListener(this);
			setSize(1920, 1080);
			setLayout(null);
			bcart.setBounds(1000, 10, 150, 60);
			l11.setBounds(380, 85, 10, 40);
			l12.setBounds(400, 100, 100, 40);
			l14.setBounds(500, 100, 50, 40);
			b11.setBounds(580, 100, 100, 40);
			l13.setBounds(755, 100, 100, 40);
			b12.setBounds(840, 100, 100, 40);
			l21.setBounds(380, 155, 10, 40);
			l22.setBounds(400, 170, 100, 40);
			l24.setBounds(500, 170, 50, 40);
			b21.setBounds(580, 170, 100, 40);
			l23.setBounds(755, 170, 100, 40);
			b22.setBounds(840, 170, 100, 40);
			l31.setBounds(380, 225, 10, 40);
			l32.setBounds(400, 240, 100, 40);
			l34.setBounds(500, 240, 50, 40);
			b31.setBounds(580, 240, 100, 40);
			l33.setBounds(755, 240, 100, 40);
			b32.setBounds(840, 240, 100, 40);
			l41.setBounds(380, 295, 10, 40);
			l42.setBounds(400, 310, 100, 40);
			l44.setBounds(500, 310, 50, 40);
			b41.setBounds(580, 310, 100, 40);
			l43.setBounds(755, 310, 100, 40);
			b42.setBounds(840, 310, 100, 40);
			l51.setBounds(380, 365, 10, 40);
			l52.setBounds(400, 380, 100, 40);
			l54.setBounds(500, 380, 50, 40);
			b51.setBounds(580, 380, 100, 40);
			l53.setBounds(755, 380, 100, 40);
			b52.setBounds(840, 380, 100, 40);
			l.add(l11);
			l.add(l12);
			l.add(l13);
			l.add(b11);
			l.add(b12);
			l.add(l21);
			l.add(l22);
			l.add(l23);
			l.add(b21);
			l.add(b22);
			l.add(l31);
			l.add(l32);
			l.add(l33);
			l.add(b31);
			l.add(b32);
			l.add(l41);
			l.add(l42);
			l.add(l43);
			l.add(b41);
			l.add(b42);
			l.add(l51);
			l.add(l52);
			l.add(l53);
			l.add(b51);
			l.add(b52);
			l.add(l14);
			l.add(l24);
			l.add(l34);
			l.add(l44);
			l.add(l54);
			l.add(bcart);
			setVisible(true);
		}

		public void actionPerformed(ActionEvent ae) {
			if (ae.getSource() == b11) {
				int a = Integer.parseInt(l13.getText());
				if (a == 0)
					;
				else {
					a--;
					String s = Integer.toString(a);
					l13.setText(s);
					if (item != 0)
						item--;
					if (Bill[16] != 0)
						Bill[16]--;
					if (Bill[16] == 0)
						Products--;
					bcart.setText("My Cart (" + item + ")");
				}
			} else if (ae.getSource() == b12) {
				int a = Integer.parseInt(l13.getText());
				a++;
				String s = Integer.toString(a);
				l13.setText(s);
				item++;
				Bill[16]++;
				if (Bill[16] == 1)
					Products++;
				bcart.setText("My Cart (" + item + ")");
			} else if (ae.getSource() == b21) {
				int a = Integer.parseInt(l23.getText());
				if (a == 0)
					;
				else {
					a--;
					String s = Integer.toString(a);
					l23.setText(s);
					if (item != 0)
						item--;
					if (Bill[17] != 0)
						Bill[17]--;
					if (Bill[17] == 0)
						Products--;
					bcart.setText("My Cart (" + item + ")");
				}
			} else if (ae.getSource() == b22) {
				int a = Integer.parseInt(l23.getText());
				a++;
				String s = Integer.toString(a);
				l23.setText(s);
				item++;
				Bill[17]++;
				if (Bill[17] == 1)
					Products++;
				bcart.setText("My Cart (" + item + ")");
			} else if (ae.getSource() == b31) {
				int a = Integer.parseInt(l33.getText());
				if (a == 0)
					;
				else {
					a--;
					String s = Integer.toString(a);
					l33.setText(s);
					if (item != 0)
						item--;
					if (Bill[18] != 0)
						Bill[18]--;
					if (Bill[18] == 0)
						Products--;
					bcart.setText("My Cart (" + item + ")");
				}
			} else if (ae.getSource() == b32) {
				int a = Integer.parseInt(l33.getText());
				a++;
				String s = Integer.toString(a);
				l33.setText(s);
				item++;
				Bill[18]++;
				if (Bill[18] == 1)
					Products++;
				bcart.setText("My Cart (" + item + ")");
			} else if (ae.getSource() == b41) {
				int a = Integer.parseInt(l43.getText());
				if (a == 0)
					;
				else {
					a--;
					String s = Integer.toString(a);
					l43.setText(s);
					if (item != 0)
						item--;
					if (Bill[19] != 0)
						Bill[19]--;
					if (Bill[19] == 0)
						Products--;
					bcart.setText("My Cart (" + item + ")");
				}
			} else if (ae.getSource() == b42) {
				int a = Integer.parseInt(l43.getText());
				a++;
				String s = Integer.toString(a);
				l43.setText(s);
				item++;
				Bill[19]++;
				if (Bill[19] == 1)
					Products++;
				bcart.setText("My Cart (" + item + ")");
			} else if (ae.getSource() == b51) {
				int a = Integer.parseInt(l53.getText());
				if (a == 0)
					;
				else {
					a--;
					String s = Integer.toString(a);
					l53.setText(s);
					if (item != 0)
						item--;
					if (Bill[20] != 0)
						Bill[20]--;
					if (Bill[20] == 0)
						Products--;
					bcart.setText("My Cart (" + item + ")");
				}
			} else if (ae.getSource() == b52) {
				int a = Integer.parseInt(l53.getText());
				a++;
				String s = Integer.toString(a);
				l53.setText(s);
				item++;
				Bill[20]++;
				if (Bill[20] == 1)
					Products++;
				bcart.setText("My Cart (" + item + ")");
			} else if (ae.getSource() == bcart) {
				new b(Products, Bill);
				or();
			}
		}
	}
}