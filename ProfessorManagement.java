package courseScheduling;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProfessorManagement extends JFrame {
	public ProfessorManagement() {
		this.setSize(new Dimension(500,450));
		
		getContentPane().setLayout(null);
		
		JLabel lblProfessorManagment = new JLabel("Professor Managment");
		lblProfessorManagment.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblProfessorManagment.setBounds(118, 11, 243, 30);
		getContentPane().add(lblProfessorManagment);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddProfessor ac=new AddProfessor();
				setVisible(false);
				ac.setVisible(true);
			
			}
		});
		btnAdd.setBounds(164, 92, 114, 23);
		getContentPane().add(btnAdd);
		
		JButton btnEditdetele = new JButton("Edit/Delete");
		btnEditdetele.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				EditProfessor ac=new EditProfessor();
				setVisible(false);
				ac.setVisible(true);
			
			}
		});
		btnEditdetele.setBounds(164, 145, 114, 23);
		getContentPane().add(btnEditdetele);

	
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
