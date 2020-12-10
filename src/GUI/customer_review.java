package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.Component;
import java.awt.Color;
import javax.swing.JTextField;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class customer_review {

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
					customer_review window = new customer_review();
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
	public customer_review() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		conn c = new conn();
		frame = new JFrame();
		frame.setBounds(100, 100, 738, 464);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admin_home obj=new admin_home();
				obj.frame.setVisible(true);
				frame.dispose();
			}
		});
		button.setIcon(new ImageIcon(customer_review.class.getResource("/GUI/pictures/back.png")));
		button.setBounds(10, 11, 53, 32);
		frame.getContentPane().add(button);

		JLabel lblCustomerReview = new JLabel("Customer review");
		lblCustomerReview.setForeground(Color.WHITE);
		lblCustomerReview.setFont(new Font("Segoe UI Symbol", Font.BOLD, 17));
		lblCustomerReview.setBounds(245, 11, 217, 25);
		frame.getContentPane().add(lblCustomerReview);

		JScrollPane scrollPane = new JScrollPane((Component) null);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBounds(60, 47, 576, 303);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		try {
			String query="select a.id, c.name, avg(rating) as rating from customer_reviews as c, customer as a where a.name=c.name group by name ";
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

		textField = new JTextField();
		textField.setBounds(353, 372, 224, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblCustomerNumber = new JLabel("Customer number");
		lblCustomerNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCustomerNumber.setForeground(Color.WHITE);
		lblCustomerNumber.setBounds(171, 375, 127, 17);
		frame.getContentPane().add(lblCustomerNumber);

		JButton btnBan = new JButton("Ban");
		btnBan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String str=textField.getText();
				int id = Integer.parseInt(str);
				
				String Query="UPDATE customer SET status = 'banned' WHERE id = '"+id+"'";
				try {
					int rs=c.s.executeUpdate(Query);
					JOptionPane.showMessageDialog(null,"customer banned");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnBan.setBounds(363, 403, 89, 23);
		frame.getContentPane().add(btnBan);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(customer_review.class.getResource("/GUI/pictures/171786-dark-pink-fluid-gradient-geometric-abstract-background.jpg")));
		lblNewLabel.setBounds(-13, -11, 914, 441);
		frame.getContentPane().add(lblNewLabel);
	}
}
