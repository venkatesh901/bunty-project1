package courseScheduling;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.TextAttribute;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.SystemColor;

public class Login extends JFrame {
	private JTextField username;
	private JTextField password;
	 JPasswordField passwordField;
	 String strURL ;
	  	
	 //ArrayList<> members;
		
	
	public Login() {
		this.setSize(new Dimension(500,500));
		   getContentPane().setLayout(null);
	
			JLabel lblEgymSystem = new JLabel("Login Panel");
		lblEgymSystem.setForeground(Color.BLACK);
		lblEgymSystem.setFont(new Font("Verdana", Font.PLAIN, 19));
		lblEgymSystem.setBounds(153, 11, 180, 23);
		getContentPane().add(lblEgymSystem);
		
		strURL = "not a user?signup here";
		
		passwordField = new JPasswordField(10);
		passwordField.setFont(new Font("Verdana", Font.PLAIN, 12));
		  passwordField.setBounds(181, 167, 115, 23);
		username = new JTextField();
		username.setFont(new Font("Verdana", Font.PLAIN, 12));
		username.setBounds(181, 122, 115, 23);
		getContentPane().add(username);
		username.setColumns(10);
		getContentPane().add(passwordField);
		passwordField.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblUsername.setForeground(new Color(0, 0, 0));
		lblUsername.setBounds(105, 123, 100, 20);
		getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblPassword.setForeground(new Color(0, 0, 0));
		lblPassword.setBounds(105, 170, 100, 14);
		getContentPane().add(lblPassword);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				if(username.getText().equals("venkatesh") && passwordField.getText().equals("venkatesh1"))
				{
					AdminPanel ap=new AdminPanel();
					
					setVisible(false);
					ap.setVisible(true);
					
					
				}
				else{
					
					JOptionPane.showMessageDialog(new Login(), "Username or password incorrect.");
					
				}
			}
		});
		btnLogin.setForeground(SystemColor.desktop);
		btnLogin.setBackground(SystemColor.inactiveCaption);
		btnLogin.setBounds(181, 212, 115, 23);
		getContentPane().add(btnLogin);
		 
		
		   
		   
		   
		   setBounds(100, 100, 500, 500);  
        
	}
}

