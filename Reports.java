package courseScheduling;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reports extends JFrame
{
	private JTable table;
	private JTable table_1;
	public Reports() {
	
		this.setSize(new Dimension(600,450));
		getContentPane().setLayout(null);
		
		JButton btnCourses = new JButton("Courses");
		btnCourses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				CourseReport cr=new CourseReport();
				cr.setVisible(true);
			}
		});
		btnCourses.setBounds(213, 95, 124, 23);
		getContentPane().add(btnCourses);
		
		JButton btnFaculty = new JButton("Faculty");
		btnFaculty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			
				FacultyReport fp=new FacultyReport();
				fp.setVisible(true);
			}
		});
		btnFaculty.setBounds(213, 154, 124, 23);
		getContentPane().add(btnFaculty);
		
		JButton btnRoom = new JButton("Room");
		btnRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			roomreport rp=new roomreport();
			rp.setVisible(true);
			
			}
		});
		btnRoom.setBounds(213, 211, 124, 23);
		getContentPane().add(btnRoom);
		
		JButton btnDegree = new JButton("Degree");
		btnDegree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			DegreeReport dp=new DegreeReport();
			dp.setVisible(true);
			
			}
		});
		btnDegree.setBounds(213, 270, 124, 23);
		getContentPane().add(btnDegree);
		
		JButton btnSections = new JButton("Sections");
		btnSections.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				SectionReport sp=new SectionReport();
				sp.setVisible(true);
				
			}
		});
		btnSections.setBounds(213, 326, 124, 23);
		getContentPane().add(btnSections);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			setVisible(false);
			AdminPanel ap=new AdminPanel();
			ap.setVisible(true);
			}
		});
		btnBack.setBounds(474, 11, 89, 23);
		getContentPane().add(btnBack);
		
		JLabel lblReports = new JLabel("Reports");
		lblReports.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblReports.setBounds(213, 15, 99, 30);
		getContentPane().add(lblReports);
		
	}
}
