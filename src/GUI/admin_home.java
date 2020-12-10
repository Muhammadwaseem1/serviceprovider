package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class admin_home {

	 JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin_home window = new admin_home();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public admin_home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Log out");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				adminlogin obj=new adminlogin();
				obj.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(476, 11, 84, 23);
		frame.getContentPane().add(btnNewButton);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(admin_home.class.getResource("/GUI/pictures/Webp.net-resizeimage 1.png")));
		lblNewLabel_2.setBounds(374, 142, 127, 103);
		frame.getContentPane().add(lblNewLabel_2);

		JButton btnCustomerReview = new JButton("customer review");
		btnCustomerReview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				customer_review obj=new customer_review();
				obj.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnCustomerReview.setBounds(374, 256, 114, 23);
		frame.getContentPane().add(btnCustomerReview);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(admin_home.class.getResource("/GUI/pictures/Webp.net-resizeimage.png")));
		lblNewLabel_1.setBounds(204, 100, 138, 163);
		frame.getContentPane().add(lblNewLabel_1);

		JButton btnDriverReviw = new JButton("Driver reviw");
		btnDriverReviw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				driver_review obj=new driver_review();
				obj.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnDriverReviw.setBounds(204, 256, 133, 23);
		frame.getContentPane().add(btnDriverReviw);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(admin_home.class.getResource("/GUI/pictures/satisfaction-icon-56.png")));
		label_1.setBounds(-232, 0, 402, 361);
		frame.getContentPane().add(label_1);

		JLabel lblNewLabel = new JLabel("Rent A Cab");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 31));
		lblNewLabel.setBounds(211, 41, 212, 37);
		frame.getContentPane().add(lblNewLabel);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(admin_home.class.getResource("/GUI/pictures/backgrpund.jpg")));
		label.setBackground(Color.WHITE);
		label.setBounds(0, 0, 584, 361);
		frame.getContentPane().add(label);
	}
}
