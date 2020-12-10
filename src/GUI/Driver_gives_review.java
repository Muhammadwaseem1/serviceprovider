package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Driver_gives_review {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Driver_gives_review window = new Driver_gives_review("ustad");
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
	public Driver_gives_review(String name) {
		initialize(name);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String name) {
		frame = new JFrame();
		frame.setBounds(100, 100, 807, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Driver_Home obj=new Driver_Home(name);
				obj.frame.setVisible(true);
				frame.dispose(); 
			}
		});
		
		JLabel lblCustomerId = new JLabel("Customer\r\n Name");
		lblCustomerId.setForeground(Color.WHITE);
		lblCustomerId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCustomerId.setBounds(24, 85, 208, 47);
		frame.getContentPane().add(lblCustomerId);
		
		textField_2 = new JTextField();
		textField_2.setBounds(243, 102, 96, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		button_1.setIcon(new ImageIcon(Driver_gives_review.class.getResource("/GUI/pictures/back.png")));
		button_1.setBounds(10, 11, 46, 25);
		frame.getContentPane().add(button_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(24, 304, 413, 111);
		frame.getContentPane().add(textField);
		
		JButton button = new JButton("Submit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				conn c = new conn();
				String name=textField_2.getText();
				String rating= textField_1.getText();
				String reviews=textField.getText();
				int rate=Integer.parseInt(rating);
				
				
				String query="insert into customer_reviews values('"+name+"','"+rate+"','"+reviews+"')";
				
				try {
					c.s.executeUpdate(query);
					JOptionPane.showMessageDialog(null,"Review Submitted");
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		button.setBounds(539, 348, 89, 23);
		frame.getContentPane().add(button);
		
		JLabel label = new JLabel("how to improve our services");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(24, 236, 258, 47);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Rate us out of 5");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_1.setBounds(23, 178, 129, 47);
		frame.getContentPane().add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(177, 186, 31, 36);
		frame.getContentPane().add(textField_1);
		
		JLabel label_2 = new JLabel("How was our services?\r\n");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_2.setBounds(24, 130, 258, 47);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Please give Review of our Services.");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_3.setBounds(15, 47, 422, 27);
		frame.getContentPane().add(label_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Driver_gives_review.class.getResource("/GUI/pictures/171786-dark-pink-fluid-gradient-geometric-abstract-background.jpg")));
		lblNewLabel.setBounds(0, 0, 836, 441);
		frame.getContentPane().add(lblNewLabel);
	}
}
