package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Driver_Home {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
			
		});
	}

	/**
	 * Create the application.
	 * @param name 
	 * @wbp.parser.entryPoint
	 */
	public Driver_Home(String name) {
		initialize(name);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String name) {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnLogOut = new JButton("Log out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Driver_login obj=new Driver_login();
				obj.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnLogOut.setBounds(585, 11, 89, 23);
		frame.getContentPane().add(btnLogOut);

		JLabel label_5 = new JLabel("It is our duty to serve you. Thank you for chosing us.");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_5.setBounds(140, 297, 413, 23);
		frame.getContentPane().add(label_5);

		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(Driver_Home.class.getResource("/GUI/pictures/Webp.net-resizeimage41.png")));
		label_4.setBounds(183, 91, 158, 151);
		frame.getContentPane().add(label_4);

		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(Driver_Home.class.getResource("/GUI/pictures/Webp.net-resizeimage4.png")));
		label_3.setBounds(340, 91, 158, 151);
		frame.getContentPane().add(label_3);

		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Driver_Home.class.getResource("/GUI/pictures/Webp.net-resizeimage12.png")));
		label_2.setBounds(45, 111, 120, 120);
		frame.getContentPane().add(label_2);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Driver_Home.class.getResource("/GUI/pictures/Webp.net-resizeimage 1.png")));
		label_1.setBounds(525, 111, 120, 120);
		frame.getContentPane().add(label_1);

		JButton btnReviewCustomer = new JButton("Review Customer");
		btnReviewCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Driver_gives_review obj=new Driver_gives_review(name);
				obj.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnReviewCustomer.setBounds(525, 242, 116, 23);
		frame.getContentPane().add(btnReviewCustomer);

		JButton btnBill = new JButton("Bill");
		btnBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				driver_bill bill=new driver_bill();
				bill.frame.setVisible(true);
			}
		});
		btnBill.setBounds(360, 242, 116, 23);
		frame.getContentPane().add(btnBill);

		JButton btnSetAvalibility = new JButton("Set Avalibility");
		btnSetAvalibility.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Driver_Avalibility obj=new Driver_Avalibility(name);
				obj.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnSetAvalibility.setBounds(197, 242, 116, 23);
		frame.getContentPane().add(btnSetAvalibility);

		JButton btnCheckRequests = new JButton("Check Requests");
		btnCheckRequests.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				driver_request obj=new driver_request(name);
				obj.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnCheckRequests.setBounds(45, 242, 116, 23);
		frame.getContentPane().add(btnCheckRequests);

		JLabel label = new JLabel("Book A CAB");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 27));
		label.setBounds(254, 40, 167, 29);
		frame.getContentPane().add(label);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Driver_Home.class.getResource("/GUI/pictures/171786-dark-pink-fluid-gradient-geometric-abstract-background.jpg")));
		lblNewLabel.setBounds(0, 0, 684, 361);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(244, 53, 48, 14);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
