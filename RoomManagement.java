package courseScheduling;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RoomManagement extends JFrame{


	public RoomManagement()
	{
		this.setSize(new Dimension(500,450));
		
		getContentPane().setLayout(null);
		
		JLabel lblCourseManagement = new JLabel("Room Management");
		lblCourseManagement.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblCourseManagement.setBounds(110, 11, 242, 27);
		getContentPane().add(lblCourseManagement);
		
		JButton btnAddCourse = new JButton("Add");
		btnAddCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				AddRoom ac=new AddRoom();
				setVisible(false);
				ac.setVisible(true);
			
			}
		});
		btnAddCourse.setBounds(173, 96, 108, 23);
		getContentPane().add(btnAddCourse);
		
		JButton btnEditdelete = new JButton("Edit/Delete ");
		btnEditdelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				EditRoom rr=new EditRoom();
				setVisible(false);
				rr.setVisible(true);
			
			}
		});
		btnEditdelete.setBounds(173, 159, 108, 23);
		getContentPane().add(btnEditdelete);

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
