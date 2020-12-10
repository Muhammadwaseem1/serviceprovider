package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JTextPane;

public class admin {

	 JFrame frame;
	private JTextPane txtpnAdmin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin window = new admin();
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
	public admin() {
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
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				welcome obj=new welcome();
				obj.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(admin.class.getResource("/GUI/pictures/back.png")));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(10, 11, 61, 39);
		frame.getContentPane().add(btnNewButton_1);

		txtpnAdmin = new JTextPane();
		txtpnAdmin.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		txtpnAdmin.setText("        Admin");
		txtpnAdmin.setBounds(214, 31, 153, 29);
		txtpnAdmin.setOpaque(false);

		frame.getContentPane().add(txtpnAdmin);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(admin.class.getResource("/GUI/pictures/admin-settings-male.png")));
		lblNewLabel.setBounds(189, 71, 187, 176);
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnNewButton.setBackground(Color.WHITE);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				adminlogin obj=new adminlogin();
				obj.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(214, 278, 162, 29);
		frame.getContentPane().add(btnNewButton);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setIcon(new ImageIcon(admin.class.getResource("/GUI/pictures/backgrpund.jpg")));
		lblNewLabel_1.setBounds(0, 0, 584, 361);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
