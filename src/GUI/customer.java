package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class customer {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customer window = new customer();
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
	public customer() {
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
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				welcome obj=new welcome();
				obj.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setIcon(new ImageIcon(customer.class.getResource("/GUI/pictures/back.png")));
		btnNewButton.setBounds(10, 11, 63, 39);
		frame.getContentPane().add(btnNewButton);

		JLabel lblReadyToServe = new JLabel("Ready to serve");
		lblReadyToServe.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 23));
		lblReadyToServe.setBounds(218, 52, 230, 31);
		frame.getContentPane().add(lblReadyToServe);

		JLabel lblRentACab = new JLabel("Rent A Cab");
		lblRentACab.setForeground(Color.DARK_GRAY);
		lblRentACab.setFont(new Font("Yu Gothic", Font.BOLD, 40));
		lblRentACab.setBounds(179, 0, 240, 97);
		frame.getContentPane().add(lblRentACab);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(customer.class.getResource("/GUI/pictures/login-rounded-right.png")));
		label.setBounds(318, 71, 200, 200);
		frame.getContentPane().add(label);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(customer.class.getResource("/GUI/pictures/lock.png")));
		label_1.setBounds(72, 71, 200, 200);
		frame.getContentPane().add(label_1);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				customerlogin obj=new customerlogin();
				obj.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnLogin.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		btnLogin.setBounds(122, 274, 105, 23);
		frame.getContentPane().add(btnLogin);

		JButton btnSignin = new JButton("sign in");
		btnSignin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				customer_signup obj=new customer_signup();
				obj.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnSignin.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		btnSignin.setBounds(376, 274, 105, 23);
		frame.getContentPane().add(btnSignin);

		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(customer.class.getResource("/GUI/pictures/backgrpund.jpg")));
		label_2.setBounds(0, 0, 584, 361);
		frame.getContentPane().add(label_2);
	}
}
