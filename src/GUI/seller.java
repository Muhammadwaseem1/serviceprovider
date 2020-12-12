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

public class seller {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					seller window = new seller();
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
	public seller() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 400);
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
		btnNewButton.setIcon(new ImageIcon(seller.class.getResource("/GUI/pictures/back.png")));
		btnNewButton.setBounds(10, 11, 52, 39);
		frame.getContentPane().add(btnNewButton);

		JLabel lblThankYouFor = new JLabel("Thank You for Trusting us");
		lblThankYouFor.setForeground(Color.WHITE);
		lblThankYouFor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblThankYouFor.setBounds(260, 51, 185, 29);
		frame.getContentPane().add(lblThankYouFor);

		JLabel label_1 = new JLabel("Book A CAB");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 27));
		label_1.setBounds(267, 11, 167, 29);
		frame.getContentPane().add(label_1);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(seller.class.getResource("/GUI/pictures/login-rounded-right.png")));
		label.setBounds(400, 101, 209, 156);
		frame.getContentPane().add(label);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(seller.class.getResource("/GUI/pictures/ok.png")));
		lblNewLabel_1.setBounds(95, 96, 209, 156);
		frame.getContentPane().add(lblNewLabel_1);

		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Driver_Signup obj=new Driver_Signup();
				obj.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnSignUp.setBounds(420, 263, 160, 23);
		frame.getContentPane().add(btnSignUp);

		JButton btnLogIn = new JButton("Log In");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Driver_login obj=new Driver_login();
				obj.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnLogIn.setBounds(114, 263, 160, 23);
		frame.getContentPane().add(btnLogIn);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(seller.class.getResource("/GUI/pictures/171786-dark-pink-fluid-gradient-geometric-abstract-background.jpg")));
		lblNewLabel.setBounds(0, 0, 684, 361);
		frame.getContentPane().add(lblNewLabel);
	}

}
