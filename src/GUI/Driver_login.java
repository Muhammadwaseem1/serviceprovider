package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Driver_login {

	 JFrame frame;
	private JTextField textField_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Driver_login window = new Driver_login();
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
	public Driver_login() {
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
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Driver obj=new Driver();
				obj.frame.setVisible(true);
				frame.dispose();
			}
		});
		button_1.setIcon(new ImageIcon(Driver_login.class.getResource("/GUI/pictures/back.png")));
		button_1.setBounds(10, 11, 41, 29);
		frame.getContentPane().add(button_1);

		JLabel label_4 = new JLabel("Book A CAB");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 27));
		label_4.setBounds(264, 28, 167, 29);
		frame.getContentPane().add(label_4);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(161, 200, 143, 20);
		frame.getContentPane().add(textField_1);

		JLabel label = new JLabel("Password");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		label.setBounds(28, 197, 87, 22);
		frame.getContentPane().add(label);

		JLabel label_1 = new JLabel("Username");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		label_1.setBounds(28, 151, 106, 22);
		frame.getContentPane().add(label_1);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(161, 153, 143, 20);
		frame.getContentPane().add(textField);

		JLabel lblEnterLoginInfo = new JLabel("Enter login info");
		lblEnterLoginInfo.setForeground(Color.WHITE);
		lblEnterLoginInfo.setFont(new Font("Trebuchet MS", Font.PLAIN, 26));
		lblEnterLoginInfo.setBounds(28, 77, 278, 36);
		frame.getContentPane().add(lblEnterLoginInfo);

		JButton button = new JButton("login");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 conn c1 = new conn();
				 String name = textField.getText();
	                String s2 = textField_1.getText();
	                String sta=null;
	                
	                String query="select status from driver where name ='"+name+"'";
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
			    
	              
	               
	                String str = "select * from driverlogin where username = '"+name+"' and password = '"+s2+"'";
	                ResultSet rs = c1.s.executeQuery(str);
	                
	              
	                
						if(rs.next()){
							Driver_Home obj=new Driver_Home(name);
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
		button.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		button.setBounds(115, 256, 106, 23);
		frame.getContentPane().add(button);

		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Driver_login.class.getResource("/GUI/pictures/taxi_PNG73.png")));
		label_2.setBounds(316, 94, 349, 170);
		frame.getContentPane().add(label_2);

		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(Driver_login.class.getResource("/GUI/pictures/171786-dark-pink-fluid-gradient-geometric-abstract-background.jpg")));
		label_3.setBounds(0, 0, 684, 361);
		frame.getContentPane().add(label_3);
	}
}
