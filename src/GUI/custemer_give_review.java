
package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class custemer_give_review {

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
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public custemer_give_review(String name) {
		initialize(name);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String name) {
		frame = new JFrame();
		frame.setBounds(100, 100, 810, 471);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
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
		
		JLabel lblDriverName = new JLabel("Driver Name");
		lblDriverName.setForeground(Color.WHITE);
		lblDriverName.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDriverName.setBounds(55, 142, 127, 17);
		frame.getContentPane().add(lblDriverName);
		
		textField_2 = new JTextField();
		textField_2.setBounds(193, 139, 158, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		button.setIcon(new ImageIcon(custemer_give_review.class.getResource("/GUI/pictures/back.png")));
		button.setBounds(10, 11, 42, 27);
		frame.getContentPane().add(button);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				conn c = new conn();
				
				String name=textField_2.getText();
				String rating=textField.getText();
				String reviews=textField_1.getText();
				int rate=Integer.parseInt(rating);
				String query="insert into drivers_reviews values('"+name+"','"+rate+"','"+reviews+"')";
				try {
					c.s.executeUpdate(query);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnSubmit.setBounds(511, 323, 89, 23);
		frame.getContentPane().add(btnSubmit);

		textField_1 = new JTextField();
		textField_1.setBounds(55, 291, 413, 111);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblHowToImprove = new JLabel("how to improve our services");
		lblHowToImprove.setForeground(Color.WHITE);
		lblHowToImprove.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHowToImprove.setBounds(55, 233, 258, 47);
		frame.getContentPane().add(lblHowToImprove);

		textField = new JTextField();
		textField.setBounds(204, 183, 31, 36);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblRateUsOut = new JLabel("Rate us out of 5");
		lblRateUsOut.setForeground(Color.WHITE);
		lblRateUsOut.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRateUsOut.setBounds(55, 175, 129, 47);
		frame.getContentPane().add(lblRateUsOut);

		JLabel lblHowWasOur = new JLabel("How was our services?\r\n");
		lblHowWasOur.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHowWasOur.setForeground(Color.WHITE);
		lblHowWasOur.setBounds(55, 73, 258, 47);
		frame.getContentPane().add(lblHowWasOur);

		JLabel lblPleaseGiveReview = new JLabel("Please give Review of our Services.");
		lblPleaseGiveReview.setForeground(Color.WHITE);
		lblPleaseGiveReview.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblPleaseGiveReview.setBounds(55, 35, 422, 27);
		frame.getContentPane().add(lblPleaseGiveReview);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(custemer_give_review.class.getResource("/GUI/pictures/171786-dark-pink-fluid-gradient-geometric-abstract-background.jpg")));
		lblNewLabel.setBounds(0, 0, 813, 450);
		frame.getContentPane().add(lblNewLabel);
	}

}
