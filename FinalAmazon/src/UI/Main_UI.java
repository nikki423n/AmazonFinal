package UI;

import java.awt.*;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Main_UI extends JFrame 
{

	private JPanel contentPane;
	private JTextField maintextbox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_UI frame = new Main_UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main_UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JTextField MainTextBox = new JTextField();
		MainTextBox.setText("abc");
		//contentPane.add(MainTextBox, BorderLayout.CENTER);
		MainTextBox.setColumns(10);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JLabel lblNewLabel = new JLabel("FIREBALL");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		menuBar.add(lblNewLabel);
		
		JMenu mnNewMenu = new JMenu("All");
		menuBar.add(mnNewMenu);
		
		//games button
		JButton games = new JButton("Games");
		games.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
		//	MainTextBox.setText(games.main(null));
		
				
	
			}
		});
		mnNewMenu.add(games);
		
		//electronics button
		JButton electronics = new JButton("Electronics");
		electronics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		//	MainTextBox.setText(electronics.main(null));
			
				
			}
		});
		mnNewMenu.add(electronics);
		
		//clothes button
		JButton clothes = new JButton("Clothes");
		clothes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			//	MainTextBox.;
				
				
			}
		});
		mnNewMenu.add(clothes);
		
		JButton search = new JButton("Search");
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//double click the button after there is available
			
				
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		menuBar.add(scrollPane);
		
		JTextPane txtpnInsertSearch = new JTextPane();
		scrollPane.setViewportView(txtpnInsertSearch);
		txtpnInsertSearch.setText("insert search");
		menuBar.add(search);
		
		
		JButton cart = new JButton("cart");
		cart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		menuBar.add(cart);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
	
		
	}

}
