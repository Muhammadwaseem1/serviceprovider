package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Driver_Avalibility {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Driver_Avalibility window = new Driver_Avalibility("ustad");
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
	public Driver_Avalibility(String name) {
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
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Driver_Home obj=new Driver_Home(name);
				obj.frame.setVisible(true);
				frame.dispose();
			}
		});
		button.setIcon(new ImageIcon(Driver_Avalibility.class.getResource("/GUI/pictures/back.png")));
		button.setBounds(10, 11, 45, 27);
		frame.getContentPane().add(button);
		
		JButton btnNewButton = new JButton("Availible");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				conn c = new conn();
				String query="UPDATE driver SET availability = 'available' WHERE name='"+name+"'";
				int rs1;
				
				
					rs1 = c.s.executeUpdate(query);
					JOptionPane.showMessageDialog(null,"you are available now");
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(118, 263, 132, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Not Availible");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				conn c = new conn();
				String query="UPDATE driver SET availability = 'not available' WHERE name='"+name+"'";
				int rs1;
				
				
					
						rs1 = c.s.executeUpdate(query);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					JOptionPane.showMessageDialog(null,"have rest sir see you soon");
			}
		});
		btnNewButton_1.setBounds(415, 263, 132, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Driver_Avalibility.class.getResource("/GUI/pictures/Webp.net-resizeimage51.png")));
		lblNewLabel.setBounds(403, 113, 163, 139);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Driver_Avalibility.class.getResource("/GUI/pictures/Webp.net-resizeimage41.png")));
		label.setBounds(112, 93, 163, 159);
		frame.getContentPane().add(label);
		
		JLabel lblRentACab = new JLabel("Rent A CAB");
		lblRentACab.setForeground(Color.WHITE);
		lblRentACab.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblRentACab.setBounds(272, 11, 154, 39);
		frame.getContentPane().add(lblRentACab);
		
		JLabel lblSetYourAvailibilty = new JLabel("Set your availibilty according to your convineant");
		lblSetYourAvailibilty.setForeground(Color.WHITE);
		lblSetYourAvailibilty.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSetYourAvailibilty.setBounds(154, 55, 428, 27);
		frame.getContentPane().add(lblSetYourAvailibilty);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Driver_Avalibility.class.getResource("/GUI/pictures/171786-dark-pink-fluid-gradient-geometric-abstract-background.jpg")));
		lblNewLabel_1.setBounds(0, 0, 684, 361);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
