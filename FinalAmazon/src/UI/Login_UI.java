package UI;

import java.awt.*;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class Login_UI
{

	JFrame frame;
	private JTextField username;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_UI window = new Login_UI();
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
	public Login_UI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblUsername.setBounds(49, 71, 132, 16);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblNewLabel = new JLabel("Password:");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(49, 117, 96, 16);
		frame.getContentPane().add(lblNewLabel);
		
		username = new JTextField();
		username.setBounds(171, 69, 232, 26);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(169, 115, 234, 26);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uname = username.getText();
				String psd = passwordField.getText();
				
				if(uname.equals("name") && psd.equals("password"))
				{
					JOptionPane.showMessageDialog(frame, "you are successfully logged in");
					//create object
					
					Main_UI second = new Main_UI();
					second.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(frame,  "Invalid username or passowrd");
				}
			}
		});
		btnLogin.setBounds(171, 153, 117, 29);
		frame.getContentPane().add(btnLogin);
		
		JPanel panel = new JPanel();
		panel.setBounds(307, 158, 96, 92);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel show_image = new JLabel("/fireball.png");
		show_image.setBounds(0, 0, 96, 92);
		panel.add(show_image);
		
	}
}
