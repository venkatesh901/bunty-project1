package courseScheduling;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class AddDegree extends JFrame {
	private JTextField degreename;
	private JTextField degreecode;
	private JTextField forecast;
	private JTextField degreeschool;
	ArrayList<Degree> degrees=ImportData.degrees;
	public AddDegree() {
		this.setSize(new Dimension(600,450));
		
		getContentPane().setLayout(null);
		
		JLabel lblStudent = new JLabel("Name :");
		lblStudent.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblStudent.setBounds(169, 115, 226, 14);
		getContentPane().add(lblStudent);
		
		degreename = new JTextField();
		degreename.setFont(new Font("Verdana", Font.PLAIN, 12));
		degreename.setBounds(258, 115, 137, 20);
		getContentPane().add(degreename);
		degreename.setColumns(10);
		
		JLabel lblTotalMarks = new JLabel("Code :");
		lblTotalMarks.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblTotalMarks.setBounds(169, 146, 226, 14);
		getContentPane().add(lblTotalMarks);
		
		degreecode = new JTextField();
		degreecode.setFont(new Font("Verdana", Font.PLAIN, 12));
		degreecode.setBounds(258, 146, 137, 20);
		getContentPane().add(degreecode);
		degreecode.setColumns(10);
		
		JLabel lblGrade = new JLabel("Forecast :");
		lblGrade.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblGrade.setBounds(169, 225, 226, 14);
		getContentPane().add(lblGrade);
		
		forecast = new JTextField();
		forecast.setFont(new Font("Verdana", Font.PLAIN, 12));
		forecast.setBounds(258, 219, 137, 20);
		getContentPane().add(forecast);
		forecast.setColumns(10);
		degreeschool = new JTextField();
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				Degree d=new Degree(degreecode.getText(),degreeschool.getText(),degreename.getText(),Integer.parseInt(forecast.getText()));
				degrees.add(d);
				ImportData.degrees=degrees;
				JOptionPane.showMessageDialog(new Login(), "Degree Added.");

			}
		});
		btnSave.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnSave.setBounds(286, 282, 109, 23);
		getContentPane().add(btnSave);
		
		JLabel lblGradeManagement = new JLabel("Add Degree");
		lblGradeManagement.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblGradeManagement.setBounds(183, 26, 197, 29);
		getContentPane().add(lblGradeManagement);
		
		JLabel lblDepartment = new JLabel("School :");
		lblDepartment.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblDepartment.setBounds(169, 188, 226, 14);
		getContentPane().add(lblDepartment);
		
		degreeschool.setFont(new Font("Verdana", Font.PLAIN, 12));
		degreeschool.setColumns(10);
		degreeschool.setBounds(258, 188, 137, 20);
		getContentPane().add(degreeschool);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				DegreeManagement dm=new DegreeManagement();
				setVisible(false);
				dm.setVisible(true);

			}
		});
		btnBack.setBounds(485, 26, 69, 23);
		getContentPane().add(btnBack);
	}

}
