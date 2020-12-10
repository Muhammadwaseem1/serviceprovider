package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

public class customer_search_ride extends JFrame {

 JFrame frame;
 private JTable table;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public customer_search_ride(String name) {
		initialize(name);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String name) {
		frame = new JFrame();
		frame.setBounds(100, 100, 701, 449);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(10, 11, 54, 30);
		btnNewButton.addActionListener(new ActionListener() {
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
		frame.getContentPane().setLayout(null);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBounds(552, 234, 48, 14);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblContactNo = new JLabel("Contact No");
		lblContactNo.setForeground(Color.WHITE);
		lblContactNo.setBounds(432, 234, 66, 14);
		frame.getContentPane().add(lblContactNo);
		
		JLabel lblCarName = new JLabel("CAR Name");
		lblCarName.setForeground(Color.WHITE);
		lblCarName.setBounds(318, 234, 73, 14);
		frame.getContentPane().add(lblCarName);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(Color.WHITE);
		lblName.setBounds(208, 238, 48, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblDriverId = new JLabel("Driver ID");
		lblDriverId.setForeground(Color.WHITE);
		lblDriverId.setBounds(65, 234, 66, 22);
		frame.getContentPane().add(lblDriverId);
		

		table = new JTable();
		table.setBounds(54, 259, 576, 122);
		frame.getContentPane().add(table);
		
		btnNewButton.setIcon(new ImageIcon(customer_search_ride.class.getResource("/GUI/pictures/back.png")));
		frame.getContentPane().add(btnNewButton);

		


		JLabel label_1 = new JLabel("");
		label_1.setBounds(445, 49, 107, 135);
		label_1.setIcon(new ImageIcon(customer_search_ride.class.getResource("/GUI/pictures/Webp.net-resizeimage12.png")));
		frame.getContentPane().add(label_1);

		JLabel lblTo = new JLabel("TO");
		lblTo.setBounds(74, 142, 73, 14);
		lblTo.setForeground(Color.WHITE);
		lblTo.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		frame.getContentPane().add(lblTo);
		String[] items2 =  {"karachi","lahore","islamabad","peshawar","gilgit","quetta"};
		
		JComboBox comboBox_1 = new JComboBox(items2);
		comboBox_1.setBounds(189, 138, 107, 22);
		frame.getContentPane().add(comboBox_1);

		JLabel lblFrom = new JLabel("From");
		lblFrom.setBounds(74, 98, 73, 14);
		lblFrom.setForeground(Color.WHITE);
		lblFrom.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		frame.getContentPane().add(lblFrom);
		
		String[] items1 =  {"karachi","lahore","islamabad","peshawar","gilgit","quetta"};
		JComboBox comboBox = new JComboBox(items1);
		comboBox.setBounds(189, 94, 107, 22);
		frame.getContentPane().add(comboBox);

		JLabel lblSearchForRide = new JLabel("Search For Ride");
		lblSearchForRide.setBounds(222, 35, 231, 30);
		lblSearchForRide.setForeground(Color.WHITE);
		lblSearchForRide.setFont(new Font("Verdana", Font.PLAIN, 26));
		frame.getContentPane().add(lblSearchForRide);
		
		JButton btnSearch = new JButton("Search ");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    try{
                    String src  = (String) comboBox.getSelectedItem();
                    String dst  = (String) comboBox_1.getSelectedItem();
                    String ava="not available";
                   
                    conn c = new conn();
                   
                    String str = "select driverid,name,car_name,phone_no,email from driver where src = '"+src+"' and dst = '"+dst+"'and availability<>'"+ava+"'";
                    ResultSet rs=c.s.executeQuery(str);
                    table.setModel(DbUtils.resultSetToTableModel(rs)); 
                    if(rs.next()){
                    	table.setModel(DbUtils.resultSetToTableModel(rs)); 
                    }
                  
                   
        }catch(Exception e1){}
            }
				
				
			
		});
		btnSearch.setBounds(133, 181, 89, 23);
		frame.getContentPane().add(btnSearch);

		JLabel label = new JLabel("");
		label.setBounds(0, 0, 685, 422);
		label.setIcon(new ImageIcon(customer_search_ride.class.getResource("/GUI/pictures/171786-dark-pink-fluid-gradient-geometric-abstract-background.jpg")));
		frame.getContentPane().add(label);
		
	
	}
}
