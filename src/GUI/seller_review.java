
package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import java.awt.Component;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;

import net.proteanit.sql.DbUtils;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class driver_review {

 JFrame frame;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					driver_review window = new driver_review();
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
	public driver_review() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		conn c = new conn();
		frame = new JFrame();
		frame.setBounds(100, 100, 739, 472);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblDriverReview = new JLabel("Driver review");
		lblDriverReview.setForeground(Color.WHITE);
		lblDriverReview.setFont(new Font("Segoe UI Symbol", Font.BOLD, 17));
		lblDriverReview.setBounds(279, 24, 217, 25);
		frame.getContentPane().add(lblDriverReview);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(329, 379, 224, 20);
		frame.getContentPane().add(textField);

		JLabel lblDriverNumber = new JLabel("driver number");
		lblDriverNumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDriverNumber.setForeground(Color.WHITE);
		lblDriverNumber.setBounds(147, 375, 112, 25);
		frame.getContentPane().add(lblDriverNumber);

		JButton button = new JButton("Ban");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=textField.getText();
				int id = Integer.parseInt(str);
				
				String Query="UPDATE driver SET status = 'banned' WHERE driverid = '"+id+"'";
				try {
					int rs=c.s.executeUpdate(Query);
					JOptionPane.showMessageDialog(null,"Driver is banned");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button.setBounds(339, 410, 89, 23);
		frame.getContentPane().add(button);

		JScrollPane scrollPane = new JScrollPane((Component) null);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBounds(60, 60, 576, 303);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		try {
			String query="select a.driverid, c.name, avg(rating) as rating from drivers_reviews as c, driver as a where a.name=c.name group by name ";

		  ResultSet rs;
			
			
				rs = c.s.executeQuery(query);
			
			table.setModel(DbUtils.resultSetToTableModel(rs)); 
       if(rs.next()){
       	table.setModel(DbUtils.resultSetToTableModel(rs)); 
       }
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admin_home obj=new admin_home();
				obj.frame.setVisible(true);
				frame.dispose();
			}
		});
		button_1.setIcon(new ImageIcon(driver_review.class.getResource("/GUI/pictures/back.png")));
		button_1.setBounds(10, 11, 56, 38);
		frame.getContentPane().add(button_1);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(driver_review.class.getResource("/GUI/pictures/171786-dark-pink-fluid-gradient-geometric-abstract-background.jpg")));
		label.setBounds(0, 0, 723, 433);
		frame.getContentPane().add(label);
	}
}
