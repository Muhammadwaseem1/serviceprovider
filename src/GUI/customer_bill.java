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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class customer_bill {

	JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customer_bill window = new customer_bill("customer");
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param name 
	 */
	public customer_bill(String name) {
		initialize(name);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String name) {
		int id;
		conn c = new conn();
	
		
		
		
	
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 563, 354);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Customer_home obj;
				try {
					obj = new Customer_home(null);
					obj.frame.setVisible(true);
					frame.dispose();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		button.setIcon(new ImageIcon(customer_bill.class.getResource("/GUI/pictures/back.png")));
		button.setBounds(10, 11, 33, 31);
		frame.getContentPane().add(button);
		
		JLabel lblYour = new JLabel("Your Bill is");
		lblYour.setForeground(Color.WHITE);
		lblYour.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblYour.setBounds(199, 57, 236, 31);
		frame.getContentPane().add(lblYour);
		
		JButton btnPay = new JButton("Pay");
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				String qur1="update booking set bill_status='paid' where customer_name='"+name+"' and bill_status='unpaid' ";
				
				
				
				
				
				try {
					int rs3=c.s.executeUpdate(qur1);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
				JOptionPane.showMessageDialog(null,"marked as paid");
				
				
				
			}
		});
		btnPay.setBounds(232, 230, 89, 23);
		frame.getContentPane().add(btnPay);
		
		JLabel lblBill = new JLabel("Bill");
		lblBill.setForeground(Color.WHITE);
		lblBill.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblBill.setBounds(137, 154, 48, 14);
		frame.getContentPane().add(lblBill);
		
		textField = new JTextField();
		textField.setBounds(252, 154, 183, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		String que2="select bill from booking where customer_name='"+name+"' and bill_status='unpaid' ";
		ResultSet rs1;
		try {
			rs1 = c.s.executeQuery(que2);
			rs1.next();
			int bill=rs1.getInt(1);
			 String str1 = Integer.toString(bill); 
			textField.setText(str1);
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		
		
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(customer_bill.class.getResource("/GUI/pictures/171786-dark-pink-fluid-gradient-geometric-abstract-background.jpg")));
		label.setBounds(0, 0, 547, 315);
		frame.getContentPane().add(label);
	}
}
