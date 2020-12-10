
package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Customer_home {

	 JFrame frame;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_home obj=new Customer_home("waseem");
					obj.frame.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws SQLException 
	 * @wbp.parser.entryPoint
	 */
	public Customer_home(String name) throws SQLException {
		initialize(name);
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws SQLException 
	 */
	private void initialize(String name) throws SQLException {
		frame = new JFrame();
		frame.setBounds(100, 100, 695, 407);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		JButton btnNewButton = new JButton("Log out");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				customerlogin obj=new customerlogin();
				obj.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(558, 11, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JLabel lblItIsOur = new JLabel("It is our duty to serve you. Thank you for chosing us.");
		lblItIsOur.setForeground(Color.WHITE);
		lblItIsOur.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblItIsOur.setBounds(153, 314, 413, 23);
		frame.getContentPane().add(lblItIsOur);

		JLabel lblBookACab = new JLabel("Book A CAB");
		lblBookACab.setForeground(Color.WHITE);
		lblBookACab.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblBookACab.setBounds(261, 24, 167, 29);
		frame.getContentPane().add(lblBookACab);

		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Customer_home.class.getResource("/GUI/pictures/Webp.net-resizeimage12.png")));
		label_2.setBounds(57, 109, 100, 126);
		frame.getContentPane().add(label_2);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Customer_home.class.getResource("/GUI/pictures/Webp.net-resizeimage4.png")));
		label_1.setBounds(352, 89, 160, 150);
		frame.getContentPane().add(label_1);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Customer_home.class.getResource("/GUI/pictures/Webp.net-resizeimage 1.png")));
		label.setBounds(522, 115, 120, 120);
		frame.getContentPane().add(label);

		JButton btnReview = new JButton("Review");
		btnReview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				custemer_give_review obj=new custemer_give_review(name);
				obj.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnReview.setBounds(522, 246, 103, 23);
		frame.getContentPane().add(btnReview);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Customer_home.class.getResource("/GUI/pictures/Webp.net-resizeimage 3.png")));
		lblNewLabel_1.setBounds(167, 89, 160, 158);
		frame.getContentPane().add(lblNewLabel_1);

		JButton btnBill = new JButton("Bill");
		btnBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				customer_bill obj=new customer_bill(name);
				obj.frame.setVisible(true);
				
			}
		});
		btnBill.setBounds(374, 246, 103, 23);
		frame.getContentPane().add(btnBill);

		JButton btnBookARide = new JButton("Book A ride");
		btnBookARide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				booking obj=new booking(name);
				obj.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnBookARide.setBounds(214, 246, 103, 23);
		frame.getContentPane().add(btnBookARide);

		JButton btnSearchARide = new JButton("Search A ride");
		btnSearchARide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				customer_search_ride obj=new customer_search_ride(name);
				obj.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnSearchARide.setBounds(57, 246, 103, 23);
		frame.getContentPane().add(btnSearchARide);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Customer_home.class.getResource("/GUI/pictures/171786-dark-pink-fluid-gradient-geometric-abstract-background.jpg")));
		lblNewLabel.setBounds(0, 0, 679, 368);
		frame.getContentPane().add(lblNewLabel);
		String a="accepted";
		
	     conn c = new conn();
		String query="select * from booking where customer_name ='"+name+"'and status='"+a+"'";
		ResultSet rs=c.s.executeQuery(query);
		
		
		if(rs.next()) {
			JOptionPane.showMessageDialog(null,"requested accepte");
			String query2="UPDATE booking SET status='notified' WHERE customer_name = '"+name+"'";
			int rs1;
			
			
			 
			rs1 = c.s.executeUpdate(query2);
		}
		
	}

}
