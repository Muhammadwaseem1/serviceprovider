package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class booking {

	 JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public booking(String name) {
		initialize(name);
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String name) {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Customer_home obj;
				try {
					obj = new Customer_home(name);
					obj.frame.setVisible(true);
					frame.dispose();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		button.setIcon(new ImageIcon(booking.class.getResource("/GUI/pictures/back.png")));
		button.setBounds(10, 11, 47, 31);
		frame.getContentPane().add(button);

		JLabel lblThankYouFor = new JLabel("Thank You for selecting us.");
		lblThankYouFor.setForeground(Color.WHITE);
		lblThankYouFor.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblThankYouFor.setBounds(206, 287, 265, 23);
		frame.getContentPane().add(lblThankYouFor);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(booking.class.getResource("/GUI/pictures/Webp.net-resizeimage 3.png")));
		label_1.setBounds(364, 65, 188, 150);
		frame.getContentPane().add(label_1);

		JLabel lblEnterTheDetails = new JLabel("Enter the details");
		lblEnterTheDetails.setForeground(Color.WHITE);
		lblEnterTheDetails.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEnterTheDetails.setBounds(33, 83, 178, 31);
		frame.getContentPane().add(lblEnterTheDetails);

		JLabel lblBookTheRide = new JLabel("Book the Ride!");
		lblBookTheRide.setForeground(Color.WHITE);
		lblBookTheRide.setFont(new Font("Tw Cen MT", Font.PLAIN, 26));
		lblBookTheRide.setBounds(218, 11, 189, 38);
		frame.getContentPane().add(lblBookTheRide);

		JButton btnBook = new JButton("Book");
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				conn c = new conn();
				String id=textField.getText();
				String address=textField_1.getText();
				String query="insert into booking(customer_name,driver_id,address) values('"+name+"','"+id+"','"+address+"')";
				try {
					c.s.executeUpdate(query);
					JOptionPane.showMessageDialog(null,"Request sent");
					frame.setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnBook.setBounds(133, 234, 89, 23);
		frame.getContentPane().add(btnBook);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		lblAddress.setBounds(33, 185, 121, 14);
		frame.getContentPane().add(lblAddress);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(176, 182, 178, 20);
		frame.getContentPane().add(textField_1);

		textField = new JTextField();
		textField.setBounds(176, 138, 178, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblDriverNumber = new JLabel("Driver number");
		lblDriverNumber.setForeground(Color.WHITE);
		lblDriverNumber.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		lblDriverNumber.setBounds(33, 141, 121, 14);
		frame.getContentPane().add(lblDriverNumber);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(booking.class.getResource("/GUI/pictures/171786-dark-pink-fluid-gradient-geometric-abstract-background.jpg")));
		label.setBounds(0, 0, 584, 361);
		frame.getContentPane().add(label);
	}

}
