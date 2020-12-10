package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Driver_Signup {

	JFrame frame;
	private JTextField nametxt;
	private JTextField emailtxt;
	private JTextField phonetxt;
	private JTextField passtxt;
	private JTextField pass2txt;
	private JTextField carnametxt;
	private JTextField fromtxt;
	private JTextField totxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Driver_Signup window = new Driver_Signup();
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
	public Driver_Signup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 699, 400);
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
		button_1.setIcon(new ImageIcon(Driver_Signup.class.getResource("/GUI/pictures/back.png")));
		button_1.setBounds(633, 11, 40, 38);
		frame.getContentPane().add(button_1);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setForeground(Color.WHITE);
		lblFrom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFrom.setBounds(24, 169, 83, 20);
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setForeground(Color.WHITE);
		lblTo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTo.setBounds(24, 200, 83, 20);
		frame.getContentPane().add(lblTo);
		
		totxt = new JTextField();
		totxt.setColumns(10);
		totxt.setBounds(145, 202, 115, 20);
		frame.getContentPane().add(totxt);
		
		fromtxt = new JTextField();
		fromtxt.setColumns(10);
		fromtxt.setBounds(145, 171, 115, 20);
		frame.getContentPane().add(fromtxt);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(Driver_Signup.class.getResource("/GUI/pictures/taxi_PNG73.png")));
		label_3.setBounds(299, 66, 362, 216);
		frame.getContentPane().add(label_3);
		
		carnametxt = new JTextField();
		carnametxt.setColumns(10);
		carnametxt.setBounds(145, 140, 115, 20);
		frame.getContentPane().add(carnametxt);
		
		JLabel lblCarName = new JLabel("Car name");
		lblCarName.setForeground(Color.WHITE);
		lblCarName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCarName.setBounds(24, 141, 83, 14);
		frame.getContentPane().add(lblCarName);
		
		JLabel label_1 = new JLabel("Confirm password");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(24, 262, 133, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("password");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(24, 231, 83, 20);
		frame.getContentPane().add(label_2);
		
		JLabel label_5 = new JLabel("Email");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setBounds(24, 85, 83, 14);
		frame.getContentPane().add(label_5);
		
		JLabel label_4 = new JLabel("phone number");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_4.setBounds(24, 110, 104, 14);
		frame.getContentPane().add(label_4);
		
		JLabel label_6 = new JLabel(" Name");
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_6.setBounds(24, 60, 83, 14);
		frame.getContentPane().add(label_6);
		
		JButton button = new JButton("Sign up");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=nametxt.getText();
				String email=emailtxt.getText();
				String phone=phonetxt.getText();
				String car_name=carnametxt.getText();
				String from=fromtxt.getText();
				String to=totxt.getText();
				String pass=passtxt.getText();
				String pass2=pass2txt.getText();
				if(pass.equals(pass2)) {
					  try {
					conn c = new conn();
                    String str = "INSERT INTO driver(name,email,phone_no,car_name,src,dst) values('"+name+"','"+email+"','"+phone+"','"+car_name+"','"+from+"','"+to+"')";
                  
						c.s.executeUpdate(str);
					
					String str1="insert into driverlogin(username,password) values('"+name+"','"+pass+"')";
					c.s.executeUpdate(str1);
					JOptionPane.showMessageDialog(null,"congragulation!");
                    } catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					
				}
				
				
				
			}
		});
		button.setBackground(Color.WHITE);
		button.setBounds(299, 327, 89, 23);
		frame.getContentPane().add(button);
		
		JLabel label_7 = new JLabel("Enter the details to sign up");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_7.setBounds(23, 22, 237, 27);
		frame.getContentPane().add(label_7);
		
		nametxt = new JTextField();
		nametxt.setColumns(10);
		nametxt.setBounds(145, 59, 115, 20);
		frame.getContentPane().add(nametxt);
		
		emailtxt = new JTextField();
		emailtxt.setColumns(10);
		emailtxt.setBounds(145, 84, 115, 20);
		frame.getContentPane().add(emailtxt);
		
		phonetxt = new JTextField();
		phonetxt.setColumns(10);
		phonetxt.setBounds(145, 109, 115, 20);
		frame.getContentPane().add(phonetxt);
		
		passtxt = new JTextField();
		passtxt.setColumns(10);
		passtxt.setBounds(145, 233, 115, 20);
		frame.getContentPane().add(passtxt);
		
		pass2txt = new JTextField();
		pass2txt.setColumns(10);
		pass2txt.setBounds(145, 264, 115, 20);
		frame.getContentPane().add(pass2txt);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Driver_Signup.class.getResource("/GUI/pictures/171786-dark-pink-fluid-gradient-geometric-abstract-background.jpg")));
		label.setBounds(0, 0, 694, 364);
		frame.getContentPane().add(label);
	}
}
