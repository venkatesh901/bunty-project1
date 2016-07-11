package courseScheduling;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DegreeManagement extends JFrame {

	public DegreeManagement(){
		this.setSize(new Dimension(500,450));
		
	getContentPane().setLayout(null);
	
	JLabel lblCourseManagement = new JLabel("Degree Management");
	lblCourseManagement.setFont(new Font("Verdana", Font.PLAIN, 18));
	lblCourseManagement.setBounds(110, 11, 242, 27);
	getContentPane().add(lblCourseManagement);
	
	JButton btnAddCourse = new JButton("Add");
	btnAddCourse.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		
			AddDegree ac=new AddDegree();
			setVisible(false);
			ac.setVisible(true);
		
		}
	});
	btnAddCourse.setBounds(173, 96, 105, 23);
	getContentPane().add(btnAddCourse);

	JButton btnBack = new JButton("back");
	btnBack.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		
			AdminPanel ap=new AdminPanel();
			setVisible(false);
			ap.setVisible(true);
		
		}
	});
	btnBack.setBounds(385, 15, 67, 23);
	getContentPane().add(btnBack);
}
	
}