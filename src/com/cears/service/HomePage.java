package com.cears.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 843, 652);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 238, 238));
		contentPane.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 105, 180));
		panel.setBounds(10, 27, 809, 102);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome To Vaccination Drive");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(164, 27, 502, 51);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(240, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage lp = new LoginPage();
				lp.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(320, 224, 204, 38);
		contentPane.add(btnNewButton);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setBorderPainted(false);
		btnSignUp.setBackground(new Color(245, 255, 250));
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrationPage rp = new RegistrationPage();
				rp.setVisible(true);
				setVisible(false);
			}
		});
		btnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSignUp.setBounds(320, 325, 204, 38);
		contentPane.add(btnSignUp);
	}

	private void setUndecoreted() {
		// TODO Auto-generated method stub
		
	}

}
