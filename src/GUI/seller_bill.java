package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.util.*;
public class driver_bill {
	Scanner input=new Scanner(System.in);

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
					driver_bill window = new driver_bill();
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
	public driver_bill() {
		initialize();
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 552, 339);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSave = new JButton("save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				driver_request dr=new driver_request("");
				
				
			String book=textField_1.getText();
			int id = Integer.parseInt(book);
					
					 conn c1 = new conn();
		             String b=textField.getText();
		             int bill=Integer.parseInt(b);  
		              
		               System.out.println("i was here");
		                String str = "update booking set bill='"+bill+"' where bookingid='"+id+"'";
		                try { 
		            	int rs1;
						
						
					
							rs1 = c1.s.executeUpdate(str);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				
			
				
			}
		});
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Driver_Home obj=new Driver_Home(null);
				obj.frame.setVisible(true);
				frame.dispose();
			}
		});
		button.setIcon(new ImageIcon(driver_bill.class.getResource("/GUI/pictures/back.png")));
		button.setBounds(10, 11, 35, 29);
		frame.getContentPane().add(button);
		
		JLabel lblBookingId = new JLabel("Booking id");
		lblBookingId.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblBookingId.setForeground(Color.WHITE);
		lblBookingId.setBounds(98, 91, 99, 35);
		frame.getContentPane().add(lblBookingId);
		
		textField_1 = new JTextField();
		textField_1.setBounds(244, 101, 178, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		btnSave.setBounds(210, 202, 89, 23);
		frame.getContentPane().add(btnSave);
		
		JLabel lblAmmount = new JLabel("Ammount");
		lblAmmount.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblAmmount.setForeground(Color.WHITE);
		lblAmmount.setBounds(98, 150, 99, 17);
		frame.getContentPane().add(lblAmmount);
		
		textField = new JTextField();
		textField.setBounds(244, 151, 178, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterBill = new JLabel("Enter bill ");
		lblEnterBill.setForeground(Color.WHITE);
		lblEnterBill.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblEnterBill.setBounds(210, 30, 212, 21);
		frame.getContentPane().add(lblEnterBill);
		
		JLabel label = new JLabel("");
		label.setForeground(Color.WHITE);
		label.setIcon(new ImageIcon(driver_bill.class.getResource("/GUI/pictures/171786-dark-pink-fluid-gradient-geometric-abstract-background.jpg")));
		label.setBounds(0, 0, 536, 300);
		frame.getContentPane().add(label);
	}
}
