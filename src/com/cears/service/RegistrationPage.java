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
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;

public class RegistrationPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationPage frame = new RegistrationPage();
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
	public RegistrationPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.scrollbar);
		panel.setBounds(10, 10, 680, 100);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registeration");
		lblNewLabel.setBackground(new Color(240, 248, 255));
		lblNewLabel.setBounds(242, 32, 206, 37);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(34, 212, 293, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNewRadioButton.setBounds(34, 672, 109, 33);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNewRadioButton_1.setBounds(224, 672, 103, 33);
		contentPane.add(rdbtnNewRadioButton_1);
		
		lblNewLabel_1 = new JLabel("First Name:");
		lblNewLabel_1.setVerifyInputWhenFocusTarget(false);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(107, 149, 126, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Middle Name:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(482, 149, 126, 33);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Last Name:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(107, 291, 126, 33);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Phone No:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(482, 291, 126, 33);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Email ID:");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_4.setBounds(107, 439, 126, 33);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel(" DOB:");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_5.setBounds(482, 428, 126, 33);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Gender:");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_6.setBounds(107, 591, 126, 33);
		contentPane.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_6_1 = new JLabel("Address:");
		lblNewLabel_1_6_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_6_1.setBounds(482, 591, 126, 33);
		contentPane.add(lblNewLabel_1_6_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(408, 212, 271, 33);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(34, 348, 293, 33);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(408, 348, 271, 33);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(34, 499, 293, 33);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(408, 499, 271, 33);
		contentPane.add(textField_5);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(408, 647, 271, 117);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(218, 112, 214));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(107, 856, 173, 43);
		contentPane.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBorderPainted(false);
		btnReset.setBackground(new Color(255, 192, 203));
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnReset.setBounds(361, 856, 168, 43);
		contentPane.add(btnReset);
		setUndecorated(true);
	}
}
