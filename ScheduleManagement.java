package courseScheduling;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;



public class ScheduleManagement extends JFrame{
 ArrayList<Course> courses=ImportData.courses;
	 ArrayList<Student> students=ImportData.students;
	 ArrayList<Faculty> faculty=ImportData.faculty;
	 ArrayList<Degree> degrees=ImportData.degrees;
 ArrayList<Room> rooms=ImportData.rooms;
static ArrayList <Section> sections=new ArrayList<Section>();
	public ScheduleManagement() {
	
		this.setSize(new Dimension(670,450));
		
		getContentPane().setLayout(null);
		
		JLabel lblCourseRegistration = new JLabel("Schedule Management");
		lblCourseRegistration.setFont(new Font("Verdana", Font.PLAIN, 19));
		lblCourseRegistration.setBounds(176, 11, 230, 28);
		getContentPane().add(lblCourseRegistration);
	
		JRadioButton rdbtnSpring = new JRadioButton("Spring");
		rdbtnSpring.setBounds(132, 138, 109, 23);
		getContentPane().add(rdbtnSpring);
		
		JRadioButton rdbtnSummer = new JRadioButton("Summer");
		rdbtnSummer.setBounds(263, 138, 109, 23);
		getContentPane().add(rdbtnSummer);
		
		JRadioButton rdbtnFall = new JRadioButton("Fall");
		rdbtnFall.setBounds(402, 138, 109, 23);
		getContentPane().add(rdbtnFall);
	
		JButton btnAdd = new JButton("Generate Schedule");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(new Login(), "Schedule Generated.");

			
				String semester="spring";
				if(rdbtnSpring.isSelected())
				{
					semester="spring";
				}
				
				if(rdbtnSummer.isSelected())
				{
					semester="summer";	
				}
	
				if(rdbtnFall.isSelected())
				{
					semester="fall";
				}
				
				
				ArrayList <Course> crs=new ArrayList<Course>();
				crs=GetSemesterCourses(semester);
			
				Section s;
				
				for(int i=0;i<crs.size();i++)
				{
					int sectioncount=0;
					Course c=crs.get(i);
					ArrayList <Student> studentscourse=new ArrayList<Student>();
					Faculty f=FacultyAvailablility( c, semester); 
					Room R=getRoom();
				
					for(int k=0;k<students.size();k++)
					{
						
						boolean ch=checkEligibility(students.get(k),c);
						if(ch==true)
						{
							students.get(k).setCount();
							if(students.get(k).getCount()<=2){
							studentscourse.add(students.get(k));
					
					
								sectioncount++;}
							if(sectioncount>=26) {
							if(f!=null)
							{								s=new Section(R,c,getDays(),f,studentscourse);
								sections.add(s);
							}
								break;
								
							}
							
							
					
						
						}
							
						
						
						
						
					}
					
				}
			
			
			}
		});
		btnAdd.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnAdd.setBounds(185, 266, 221, 23);
		getContentPane().add(btnAdd);
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			setVisible(false);
			AdminPanel ap=new AdminPanel();
			ap.setVisible(true);
			
			}
		});
		btnBack.setBounds(555, 18, 89, 23);
		getContentPane().add(btnBack);
		
	
		
		}
	
	Room getRoom()
	{
		int i=rooms.size();
	
		Random r = new Random();
		int n=r.nextInt(i)+0;
		
		return rooms.get(n);
	}
	
	String getDays()
	{

		String day="";
		Random r = new Random();

		int n=r.nextInt(6)+1;
		int m=r.nextInt(6)+1;
		
		if(n==m)
		{m=r.nextInt(6)+1;
			
		}
		
		if(n==1)
		{
			day=day+"Monday";
		}
		if(n==2)
		{
			day=day+"Tuesday";
		}if(n==3)
		{
			day=day+"Wednesday";
		}if(n==4)
		{
			day=day+"Thursday";
		}if(n==5)
		{
			day=day+"Friday";
		}if(n==6)
		{
			day=day+"Saturday";
		}
		
		return day;
	}
	Faculty FacultyAvailablility(Course c,String semester )
	{
	
		ArrayList<String> teachers=c.getTeachers();
for(int k=0;k<teachers.size();k++){
		for(int i=0;i<faculty.size();i++)
		{
			if(faculty.get(i).getFirstname().equalsIgnoreCase(teachers.get(k)))
			{
			
		
				
				if(faculty.get(i).getCount()<=faculty.get(i).getMaxloadspring() && semester.equalsIgnoreCase("spring") )
				{
					faculty.get(i).setCount();
					return faculty.get(i);
				}
				
				if(faculty.get(i).getCount()<=faculty.get(i).getMaxloadsummer() && semester.equalsIgnoreCase("summer") )
				{
					faculty.get(i).setCount();
					return faculty.get(i);
				}
				
				if(faculty.get(i).getCount()<=faculty.get(i).getMaxloadfall() && semester.equalsIgnoreCase("fall") )
				{
					faculty.get(i).setCount();
					return faculty.get(i);
				}
				
			}
		}
		
	}
return null ;
}
	
	boolean checkEligibility(Student s,Course c)
	{
	
		ArrayList<StudentCoursedata> cd=s.getScd();
		
		for(int i=0;i<cd.size();i++)
		{
			if(c.getCoursecode().equalsIgnoreCase(cd.get(i).getCode()))
			{
				if(cd.get(i).getGrade().equalsIgnoreCase("A") || cd.get(i).getGrade().equalsIgnoreCase("B") || cd.get(i).getGrade().equalsIgnoreCase("C") || cd.get(i).getGrade().equalsIgnoreCase("CIP") || cd.get(i).getGrade().equalsIgnoreCase("P*"))
				{
					return false;
				}
			}
			
			if(cd.get(i).getGrade().equalsIgnoreCase("F"))
			{
				return true;
			}
			
			
			
			
		}
		
		if(!c.getPrereq().equalsIgnoreCase("none")){
		
			String pre=c.getPrereq();
			for(int i=0;i<cd.size();i++)
		{

				if(pre.equalsIgnoreCase(cd.get(i).getCode()))
				{
					if(cd.get(i).getGrade().equalsIgnoreCase("A") || cd.get(i).getGrade().equalsIgnoreCase("B") || cd.get(i).getGrade().equalsIgnoreCase("C") || cd.get(i).getGrade().equalsIgnoreCase("CIP") || cd.get(i).getGrade().equalsIgnoreCase("P*"))
					{
						return true;
					}
				}
				
				if(cd.get(i).getGrade().equalsIgnoreCase("F"))
				{
					return false;
				}

				
		}
		
		
		}
		
		return true;
	}
	
	ArrayList<Course> GetSemesterCourses(String semester)
	{
		ArrayList<Course> coursessem=new ArrayList<Course>();
		for(int i=0;i<courses.size();i++)
		{
			if(courses.get(i).getSpring().equalsIgnoreCase("y") && semester.equalsIgnoreCase("spring"))
		{
	
				coursessem.add(courses.get(i));
		}
	
			if(courses.get(i).getSummer().equalsIgnoreCase("y") && semester.equalsIgnoreCase("summer"))
			{
		
					coursessem.add(courses.get(i));
			}
			
			
			if(courses.get(i).getFall().equalsIgnoreCase("y") && semester.equalsIgnoreCase("fall"))
			{
		
					coursessem.add(courses.get(i));
			}
			
		}
		
		
		return coursessem;
	}
}
