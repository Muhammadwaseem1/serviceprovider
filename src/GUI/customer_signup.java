package GUI;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;



import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class customer_signup {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customer_signup window = new customer_signup();
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
	public customer_signup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 403);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				String email=textField_1.getText();
				String cont=textField_2.getText();
				String address=textField_3.getText();
				String pass=textField_4.getText();
				String pass2=textField_5.getText();
				if(pass.equals(pass2)) {
					 try {
					conn c = new conn();
					 String str = "INSERT INTO customer(name,email,phone_no,address) values('"+name+"','"+email+"','"+cont+"','"+address+"')";
					
						c.s.executeUpdate(str);
						String str1="insert into customerlogin(username,password) values('"+name+"','"+pass+"')";
						c.s.executeUpdate(str1);
						JOptionPane.showMessageDialog(null,"congragulation!");
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else {
					JOptionPane.showMessageDialog(null,"recheck password");
				}
				
				
			}
		});
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				customer obj=new customer();
				obj.frame.setVisible(true);
				frame.dispose();
			}
		});
		button.setIcon(new ImageIcon(customer_signup.class.getResource("/GUI/pictures/back.png")));
		button.setBounds(10, 11, 45, 27);
		frame.getContentPane().add(button);
		btnSignUp.setBackground(Color.WHITE);
		btnSignUp.setBounds(299, 298, 89, 23);
		frame.getContentPane().add(btnSignUp);

		JLabel lblConfirmPassword = new JLabel("Confirm password");
		lblConfirmPassword.setForeground(Color.WHITE);
		lblConfirmPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblConfirmPassword.setBounds(24, 240, 133, 14);
		frame.getContentPane().add(lblConfirmPassword);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(145, 239, 115, 20);
		frame.getContentPane().add(textField_5);

		JLabel lblPassword = new JLabel("password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(24, 208, 83, 14);
		frame.getContentPane().add(lblPassword);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(145, 208, 115, 20);
		frame.getContentPane().add(textField_4);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAddress.setBounds(24, 174, 83, 14);
		frame.getContentPane().add(lblAddress);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(145, 174, 115, 20);
		frame.getContentPane().add(textField_3);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(145, 143, 115, 20);
		frame.getContentPane().add(textField_2);

		JLabel lblPhoneNumber = new JLabel("phone number");
		lblPhoneNumber.setForeground(Color.WHITE);
		lblPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPhoneNumber.setBounds(24, 143, 104, 14);
		frame.getContentPane().add(lblPhoneNumber);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmail.setBounds(24, 112, 83, 14);
		frame.getContentPane().add(lblEmail);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(145, 112, 115, 20);
		frame.getContentPane().add(textField_1);

		textField = new JTextField();
		textField.setBounds(145, 81, 115, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblFirstName = new JLabel(" Name");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFirstName.setForeground(Color.WHITE);
		lblFirstName.setBounds(24, 81, 83, 14);
		frame.getContentPane().add(lblFirstName);

		JLabel lblEnterTheDetails = new JLabel("Enter the details to sign up");
		lblEnterTheDetails.setForeground(Color.WHITE);
		lblEnterTheDetails.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEnterTheDetails.setBounds(24, 43, 237, 27);
		frame.getContentPane().add(lblEnterTheDetails);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(customer_signup.class.getResource("/GUI/pictures/taxi_PNG73.png")));
		label_1.setBounds(312, 63, 362, 216);
		frame.getContentPane().add(label_1);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(customer_signup.class.getResource("/GUI/pictures/171786-dark-pink-fluid-gradient-geometric-abstract-background.jpg")));
		label.setBounds(0, 0, 694, 364);
		frame.getContentPane().add(label);
	}

}
