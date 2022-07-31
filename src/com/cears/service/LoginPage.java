package com.cears.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 726, 526);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(95, 158, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(127, 255, 212));
		panel.setBounds(10, 10, 665, 97);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome To Login Page");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(54, 27, 541, 47);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 255, 255));
		panel_1.setBounds(86, 148, 535, 302);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel(" UserName : ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(82, 64, 167, 29);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel(" Password : ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(82, 143, 167, 29);
		panel_1.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBounds(226, 64, 279, 29);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(226, 143, 279, 29);
		panel_1.add(textField_1);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBorderPainted(false);
		btnCancel.setBackground(new Color(255, 192, 203));
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCancel.setBounds(323, 245, 135, 35);
		panel_1.add(btnCancel);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLogin.setBorderPainted(false);
		btnLogin.setBackground(new Color(255, 192, 203));
		btnLogin.setBounds(93, 245, 149, 35);
		panel_1.add(btnLogin);
	}
}
