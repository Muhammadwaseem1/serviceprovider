package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class welcome {

JFrame frame;
	private final JLabel lblNewLabel_1 = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					welcome window = new welcome();
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
	public welcome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 739, 433);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(welcome.class.getResource("/GUI/pictures/ok.png")));
		lblNewLabel_3.setBounds(492, 121, 191, 151);
		frame.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(welcome.class.getResource("/GUI/pictures/login-rounded-right.png")));
		lblNewLabel_2.setBounds(257, 113, 184, 167);
		frame.getContentPane().add(lblNewLabel_2);
		lblNewLabel_1.setIcon(new ImageIcon(welcome.class.getResource("/GUI/pictures/admin-settings-male.png")));
		lblNewLabel_1.setBounds(0, 113, 199, 167);
		frame.getContentPane().add(lblNewLabel_1);

		JButton button = new JButton("Admin");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				admin obj=new admin();
				obj.frame.setVisible(true);
				frame.dispose();
			}
		});
		button.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 16));
		button.setBounds(36, 275, 132, 34);
		frame.getContentPane().add(button);

		JButton btnCustomer = new JButton("Customer");
		btnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				customer obj=new customer();
				obj.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnCustomer.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 16));
		btnCustomer.setBounds(292, 275, 132, 34);
		frame.getContentPane().add(btnCustomer);

		JButton btnDriver = new JButton("Driver");
		btnDriver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				Driver obj=new Driver();
				obj.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnDriver.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 16));
		btnDriver.setBounds(530, 275, 132, 34);
		frame.getContentPane().add(btnDriver);

		JLabel lblRentACab = new JLabel("Rent A Cab");
		lblRentACab.setForeground(Color.WHITE);
		lblRentACab.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 33));
		lblRentACab.setBounds(259, 32, 242, 40);
		frame.getContentPane().add(lblRentACab);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(welcome.class.getResource("/GUI/pictures/171786-dark-pink-fluid-gradient-geometric-abstract-background.jpg")));
		lblNewLabel.setBounds(0, 0, 723, 394);
		frame.getContentPane().add(lblNewLabel);

		JLabel label = new JLabel("");
		label.setBounds(69, 113, 199, 167);
		frame.getContentPane().add(label);
	}
}
