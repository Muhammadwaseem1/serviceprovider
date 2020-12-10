package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class customerlogin {

	 JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customerlogin window = new customerlogin();
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
	public customerlogin() {
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
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				customer obj=new customer();
				obj.frame.setVisible(true);
				frame.dispose();
			}
		});
		button.setIcon(new ImageIcon(customerlogin.class.getResource("/GUI/pictures/back.png")));
		button.setBounds(10, 11, 45, 40);
		frame.getContentPane().add(button);

		JLabel lblEnterYourInfo = new JLabel("Enter your info");
		lblEnterYourInfo.setFont(new Font("Trebuchet MS", Font.PLAIN, 26));
		lblEnterYourInfo.setBounds(35, 45, 278, 36);
		frame.getContentPane().add(lblEnterYourInfo);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(customerlogin.class.getResource("/GUI/pictures/taxi_PNG73.png")));
		label_1.setBounds(240, 145, 349, 170);
		frame.getContentPane().add(label_1);

		JButton btnLogin = new JButton("login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				conn c1 = new conn();
				
				
				 String s1 = textField.getText();
	                String s2 = textField_1.getText();
	                String sta=null;
	                
	                String query="select status from customer where name ='"+s1+"'";
	                try {
						ResultSet rs1 = c1.s.executeQuery(query);
						rs1.next();
						sta=rs1.getString("status");
						
					} catch (SQLException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
	          
			if(textField.getText().equals("")&&textField_1.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"Enter Credentials");
				frame.setVisible(true);
				
			}
			else if(textField.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Enter Username");
					frame.setVisible(true);
					
				}
				else if(textField_1.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"enter password");
					frame.setVisible(true);
				}
				else if(sta.equals("banned")) {
					JOptionPane.showMessageDialog(null,"You are banned");
					frame.setVisible(true);
				}
				
				else {
				try {
			     
	              
	               
	                String str = "select * from customerlogin where username = '"+s1+"' and password = '"+s2+"'";
	                ResultSet rs = c1.s.executeQuery(str);
	                
	              
	                
						if(rs.next()){
							Customer_home obj=new Customer_home(s1);
							obj.frame.setVisible(true);
						    frame.dispose();
						}else{
						    JOptionPane.showMessageDialog(null,"Invalid Login");
						    
						}
					} catch (HeadlessException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}}
			}
		});
		btnLogin.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		btnLogin.setBounds(124, 210, 106, 23);
		frame.getContentPane().add(btnLogin);

		textField_1 = new JTextField();
		textField_1.setBounds(170, 154, 143, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField = new JTextField();
		textField.setBounds(170, 107, 143, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblPassword.setBounds(37, 151, 87, 22);
		frame.getContentPane().add(lblPassword);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblUsername.setBounds(37, 105, 106, 22);
		frame.getContentPane().add(lblUsername);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(customerlogin.class.getResource("/GUI/pictures/backgrpund.jpg")));
		label.setBounds(0, 0, 584, 361);
		frame.getContentPane().add(label);
	}

}
