package courseScheduling;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class AddProfessor extends JFrame {
	
	private JTextField daysAvailabletxt;
	private JTextField springtxt;
	private JTextField summertxt;
	private JTextField falltxt;
	ArrayList<Faculty> flist=ImportData.faculty;
	private JTextField lastnametxt;
	private JTextField firstnametxt;

	public AddProfessor() {
		
			this.setSize(new Dimension(500,500));
			getContentPane().setLayout(null);
			
			JLabel lblLastName = new JLabel("Last Name :");
			lblLastName.setFont(new Font("Verdana", Font.PLAIN, 12));
			lblLastName.setBounds(97, 100, 82, 17);
			getContentPane().add(lblLastName);
			
			JLabel lblDaysAvailable = new JLabel("Days Available :");
			lblDaysAvailable.setFont(new Font("Verdana", Font.PLAIN, 12));
			lblDaysAvailable.setBounds(97, 140, 118, 17);
			getContentPane().add(lblDaysAvailable);
			
			daysAvailabletxt = new JTextField();
			daysAvailabletxt.setColumns(10);
			daysAvailabletxt.setBounds(225, 137, 141, 20);
			getContentPane().add(daysAvailabletxt);
			
			JLabel lblMaxLoadSpring = new JLabel("Max Load Spring:");
			lblMaxLoadSpring.setFont(new Font("Verdana", Font.PLAIN, 12));
			lblMaxLoadSpring.setBounds(97, 186, 118, 17);
			getContentPane().add(lblMaxLoadSpring);
			
			springtxt = new JTextField();
			springtxt.setColumns(10);
			springtxt.setBounds(225, 183, 141, 20);
			getContentPane().add(springtxt);
			
			JLabel lblMaxLoadSummer = new JLabel("Max Load Summer:");
			lblMaxLoadSummer.setFont(new Font("Verdana", Font.PLAIN, 12));
			lblMaxLoadSummer.setBounds(97, 229, 138, 17);
			getContentPane().add(lblMaxLoadSummer);
			
			summertxt = new JTextField();
			summertxt.setColumns(10);
			summertxt.setBounds(225, 228, 141, 20);
			getContentPane().add(summertxt);
			lastnametxt = new JTextField();
			lastnametxt.setBounds(225, 97, 141, 20);
			getContentPane().add(lastnametxt);
			lastnametxt.setColumns(10);
			
			JLabel lblFirstName = new JLabel("First Name :");
			lblFirstName.setFont(new Font("Verdana", Font.PLAIN, 12));
			lblFirstName.setBounds(97, 60, 82, 17);
			getContentPane().add(lblFirstName);
			
			firstnametxt = new JTextField();
			firstnametxt.setColumns(10);
			firstnametxt.setBounds(225, 57, 141, 20);
			getContentPane().add(firstnametxt);
			
			
			JButton btnEdit = new JButton("Save");
			btnEdit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
					
								String n=lastnametxt.getText();
							String daysavail=daysAvailabletxt.getText();
							int maxspring=Integer.parseInt(springtxt.getText());
							int maxsummer=Integer.parseInt(summertxt.getText());
							int maxfall=Integer.parseInt(falltxt.getText());
							
							Faculty p=new Faculty(firstnametxt.getText(),lastnametxt.getText(),daysavail,maxspring,maxsummer,maxfall);
							flist.add(p);
						
							ImportData.faculty=flist;
						
							JOptionPane.showMessageDialog(new Login(), "Faculty Added");

					
				
				}
			});
			btnEdit.setFont(new Font("Verdana", Font.PLAIN, 12));
			btnEdit.setBounds(271, 319, 95, 23);
			getContentPane().add(btnEdit);
			
			JLabel MaxLoadFalllbl = new JLabel("Max Load Fall :");
			MaxLoadFalllbl.setFont(new Font("Verdana", Font.PLAIN, 12));
			MaxLoadFalllbl.setBounds(97, 268, 138, 17);
			getContentPane().add(MaxLoadFalllbl);
			
			falltxt = new JTextField();
			falltxt.setColumns(10);
			falltxt.setBounds(225, 267, 141, 20);
			getContentPane().add(falltxt);
			
			JLabel lblAddEditProfessor = new JLabel("Add Professor");
			lblAddEditProfessor.setFont(new Font("Verdana", Font.PLAIN, 18));
			lblAddEditProfessor.setBounds(131, 11, 235, 28);
			getContentPane().add(lblAddEditProfessor);
			
			JButton btnBack = new JButton("back");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
					ProfessorManagement dm=new ProfessorManagement();
					setVisible(false);
					dm.setVisible(true);
			
				
				}
			});
			btnBack.setBounds(401, 18, 73, 23);
			getContentPane().add(btnBack);
			
			
		}
	}
