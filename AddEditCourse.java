package courseScheduling;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class AddEditCourse extends JFrame {
	private JTextField coursecodetxt;
	private JTextField credithourstext;
	private JTextField prereqtext;
	private JTextField teacherstxt;
	private JTextField ospring;
	private JTextField osummer;
	private JTextField ofall;
	ArrayList<Course> courses=ImportData.courses;
	public AddEditCourse() {
		
		this.setSize(new Dimension(500,500));
		getContentPane().setLayout(null);
		JComboBox coursenamecombo = new JComboBox();
		
		JLabel lblAddCourse = new JLabel("Course Management");
		lblAddCourse.setFont(new Font("Verdana", Font.PLAIN, 19));
		lblAddCourse.setBounds(119, 26, 202, 23);
		getContentPane().add(lblAddCourse);
		
		JLabel lblCourseTitle = new JLabel("Course Title :");
		lblCourseTitle.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblCourseTitle.setBounds(109, 101, 89, 17);
		getContentPane().add(lblCourseTitle);
		
		JLabel lblCourseCode = new JLabel("Course Code :");
		lblCourseCode.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblCourseCode.setBounds(109, 141, 114, 17);
		getContentPane().add(lblCourseCode);
		
		coursecodetxt = new JTextField();
		coursecodetxt.setFont(new Font("Verdana", Font.PLAIN, 12));
		coursecodetxt.setColumns(10);
		coursecodetxt.setBounds(224, 139, 113, 20);
		getContentPane().add(coursecodetxt);
		
		JLabel lblCreditHours = new JLabel("Credit Hours :");
		lblCreditHours.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblCreditHours.setBounds(109, 187, 114, 17);
		getContentPane().add(lblCreditHours);
		
		credithourstext = new JTextField();
		credithourstext.setFont(new Font("Verdana", Font.PLAIN, 12));
		credithourstext.setColumns(10);
		credithourstext.setBounds(224, 185, 113, 20);
		getContentPane().add(credithourstext);
		
		JLabel lblPreRequisite = new JLabel("Pre Requisite :");
		lblPreRequisite.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblPreRequisite.setBounds(110, 230, 114, 17);
		getContentPane().add(lblPreRequisite);
		for(int i=0;i<courses.size();i++)
			coursenamecombo.addItem(courses.get(i).getName());
		prereqtext = new JTextField();
		prereqtext.setFont(new Font("Verdana", Font.PLAIN, 12));
		prereqtext.setColumns(10);
		prereqtext.setBounds(224, 228, 113, 20);
		getContentPane().add(prereqtext);
		
		JButton btnAdd = new JButton("Save");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			Course cc;
			String name,id,pre;
			int hrs;
			for(int i=0;i<courses.size();i++){
		
				if(courses.get(i).getName().equals(coursenamecombo.getSelectedItem()))
						{
					
					name=courses.get(i).getName();
					id=coursecodetxt.getText();
					pre=prereqtext.getText();
					hrs=Integer.parseInt(credithourstext.getText());
					String spring=ospring.getText();
					String fall=ofall.getText(),summer=osummer.getText();
					
					ArrayList<String> teacherslist=new ArrayList<String>();
					teacherslist.add(teacherstxt.getText());
					cc=new Course(id,name,hrs,pre,spring,summer,fall,25,teacherslist);
				
					courses.add(i,cc);
					ImportData.courses=courses;	
						}
				
			}
				
				FileWriter fileWriter = null;
			
			try {
				fileWriter = new FileWriter("TestDataCourses.csv");

				for (int i=0;i<courses.size();i++) {
					fileWriter.append(courses.get(i).getCoursecode());
					fileWriter.append(",");
					
					fileWriter.append(courses.get(i).getName());
					fileWriter.append(",");
					
					fileWriter.append(String.valueOf(courses.get(i).getCredit_hours()));
					fileWriter.append(",");
					
					fileWriter.append(String.valueOf(courses.get(i).getCapacity()));
					fileWriter.append(",");
					
					fileWriter.append(courses.get(i).getSpring());
					fileWriter.append(",");
					
					fileWriter.append(courses.get(i).getSummer());
					fileWriter.append(",");
					
					fileWriter.append(courses.get(i).getFall());
					fileWriter.append(",");
					
					fileWriter.append(courses.get(i).getPrereq());
					fileWriter.append(",");
					
					ArrayList<String> teach=courses.get(i).getTeachers();
					for(int k=0;k<teach.size();k++)
					fileWriter.append(teach.get(k)+",");
					
					fileWriter.append("\n");
					
					
					
				
				}

				
				
				
			} catch (Exception m) {
				System.out.println("Error in CsvFileWriter !!!");
				m.printStackTrace();
			} finally {
				
				try {
					fileWriter.flush();
					fileWriter.close();
				} catch (IOException k) {
					System.out.println("Error while flushing/closing fileWriter !!!");
	                k.printStackTrace();
				}
				
			}
		}
			
			
			
			
			
			
			
			
		});
		btnAdd.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnAdd.setBounds(158, 425, 70, 23);
		getContentPane().add(btnAdd);
		
		JButton btnNewButton = new JButton("back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				CourseManagement dm=new CourseManagement();
				setVisible(false);
				dm.setVisible(true);
	
				
			}
		});
		btnNewButton.setBounds(392, 26, 70, 23);
		getContentPane().add(btnNewButton);
		
		teacherstxt = new JTextField();
		teacherstxt.setFont(new Font("Verdana", Font.PLAIN, 12));
		teacherstxt.setColumns(10);
		teacherstxt.setBounds(224, 268, 113, 20);
		getContentPane().add(teacherstxt);
		
		JLabel lblTeachers = new JLabel("Teachers :");
		lblTeachers.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblTeachers.setBounds(110, 270, 114, 17);
		getContentPane().add(lblTeachers);
		
		ospring = new JTextField();
		ospring.setFont(new Font("Verdana", Font.PLAIN, 12));
		ospring.setColumns(10);
		ospring.setBounds(224, 308, 113, 20);
		getContentPane().add(ospring);
		
		JLabel Springav = new JLabel("Offered Spring:");
		Springav.setFont(new Font("Verdana", Font.PLAIN, 12));
		Springav.setBounds(110, 310, 114, 17);
		getContentPane().add(Springav);
		
		osummer = new JTextField();
		osummer.setFont(new Font("Verdana", Font.PLAIN, 12));
		osummer.setColumns(10);
		osummer.setBounds(223, 349, 113, 20);
		getContentPane().add(osummer);
		
		JLabel lblOfferedSummer = new JLabel("Offered Summer :");
		lblOfferedSummer.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblOfferedSummer.setBounds(109, 351, 114, 17);
		getContentPane().add(lblOfferedSummer);
		
		ofall = new JTextField();
		ofall.setFont(new Font("Verdana", Font.PLAIN, 12));
		ofall.setColumns(10);
		ofall.setBounds(224, 384, 113, 20);
		getContentPane().add(ofall);
		
		JLabel lblOfferedFall = new JLabel("Offered Fall :");
		lblOfferedFall.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblOfferedFall.setBounds(110, 386, 114, 17);
		getContentPane().add(lblOfferedFall);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
				for(int i=0;i<courses.size();i++){
					
					if(courses.get(i).getName().equals(coursenamecombo.getSelectedItem()))
							{
						
				courses.remove(i);
				ImportData.courses=courses;
							
							}
					
				}
					

				
			
			}
		});
		btnDelete.setBounds(248, 426, 89, 23);
		getContentPane().add(btnDelete);
		
		coursenamecombo.setBounds(224, 100, 113, 20);
		getContentPane().add(coursenamecombo);
	
	}
}
