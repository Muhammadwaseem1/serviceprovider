package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.Component;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

import net.proteanit.sql.DbUtils;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class driver_request {

	JFrame frame;
	private JTextField textField;
	private JTable table;
	 int bookingid=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					driver_request window = new driver_request("ali");
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
	public driver_request(String name) {
		initialize(name);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String name) {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		 String str = Integer.toString(bookingid); 
		JButton button = new JButton(str);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Driver_Home obj=new Driver_Home(name);
				obj.frame.setVisible(true);
				frame.dispose();
			}
		});
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setBounds(518, 130, 48, 14);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblCustomerName = new JLabel("Customer Name");
		lblCustomerName.setForeground(Color.WHITE);
		lblCustomerName.setBounds(279, 130, 89, 14);
		frame.getContentPane().add(lblCustomerName);
		
		JLabel lblOrderNo = new JLabel("Order No");
		lblOrderNo.setForeground(Color.WHITE);
		lblOrderNo.setBounds(46, 130, 48, 14);
		frame.getContentPane().add(lblOrderNo);
		
		table = new JTable();
		table.setBounds(30, 155, 609, 145);
		frame.getContentPane().add(table);
		button.setIcon(new ImageIcon(driver_request.class.getResource("/GUI/pictures/back.png")));
		button.setBounds(10, 11, 45, 33);
		frame.getContentPane().add(button);
		
		JLabel lblRequests = new JLabel("Requests");
		lblRequests.setForeground(Color.WHITE);
		lblRequests.setFont(new Font("Tw Cen MT", Font.BOLD, 28));
		lblRequests.setBounds(71, 58, 237, 27);
		frame.getContentPane().add(lblRequests);
		
		JLabel lblYouHaveFollowing = new JLabel("You have following requests");
		lblYouHaveFollowing.setForeground(Color.WHITE);
		lblYouHaveFollowing.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblYouHaveFollowing.setBounds(71, 92, 294, 27);
		frame.getContentPane().add(lblYouHaveFollowing);
		
		JButton btnNewButton = new JButton("Accept");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				conn c = new conn();
				String data=textField.getText();
				int number=Integer.parseInt(data);
				bookingid=number;
				String query="UPDATE booking SET status= 'accepted' WHERE bookingid="+number;
				int rs1;
				
				
			
					rs1 = c.s.executeUpdate(query);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null,"request accepted");
			}
		});
		btnNewButton.setBounds(430, 322, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(245, 323, 163, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("Order No");
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblName.setBounds(129, 322, 106, 27);
		frame.getContentPane().add(lblName);
		
		JLabel lblRentACab = new JLabel("Rent A CAB");
		lblRentACab.setForeground(Color.WHITE);
		lblRentACab.setFont(new Font("Tw Cen MT", Font.BOLD, 30));
		lblRentACab.setBounds(266, 11, 237, 27);
		frame.getContentPane().add(lblRentACab);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(driver_request.class.getResource("/GUI/pictures/171786-dark-pink-fluid-gradient-geometric-abstract-background.jpg")));
		label.setBounds(0, 0, 684, 361);
		frame.getContentPane().add(label);
		try {
		 conn c = new conn();
		String query="select driverid from driver where name='"+name+"'";
		ResultSet rs1;
		
		rs1 = c.s.executeQuery(query);
		rs1.next();
		int id=rs1.getInt(1);
		System.out.println(id);
		
		
         
         String str1 = "select bookingid,customer_name,address from booking where driver_id='"+id+"'";
         ResultSet rs;
		
			rs = c.s.executeQuery(str1);
			table.setModel(DbUtils.resultSetToTableModel(rs)); 
         if(rs.next()){
         	table.setModel(DbUtils.resultSetToTableModel(rs)); 
         }
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	int get_bookingid() {
		return bookingid;
	}
}
