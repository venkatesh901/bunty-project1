package courseScheduling;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class ImportData extends JFrame {
	
		static ArrayList<Course> courses=new ArrayList<Course>();
		static ArrayList<Student> students=new ArrayList<Student>();
		static ArrayList<Faculty> faculty=new ArrayList<Faculty>();
		static ArrayList<Degree> degrees=new ArrayList<Degree>();
		static ArrayList<Room> rooms=new ArrayList<Room>();
		public void ReadRoomData()
		{
			BufferedReader br = null;
			String line = "";
			String cvsSplitBy = ",";

			String id="";
			 String degree="";
			 String graduationterm="";
			 ArrayList<StudentCoursedata> scd;
			
			try {

				br = new BufferedReader(new FileReader("RoomData.csv"));
				while ((line = br.readLine()) != null) {

				        // use comma as separator
					String[] courseline = line.split(cvsSplitBy);

					 int number=0;
					 String building="";
					 int capacity=0;
					 boolean status=false;
					
					 number=Integer.parseInt(courseline[0]);
					 building=courseline[1];
					 capacity=Integer.parseInt(courseline[2]);
					 status=Boolean.parseBoolean(courseline[3]);
					 Room r=new Room(number,building,capacity,status);
					 rooms.add(r);
					 
				}

			} 
			catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (br != null) {
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			
			}
			

		}
		public void readCourseData()
		{

			
			BufferedReader br = null;
			String line = "";
			String cvsSplitBy = ",";

			try {

				br = new BufferedReader(new FileReader("TestDataCourses.csv"));
				while ((line = br.readLine()) != null) {

				line=	line.replace("\"", "");
				        // use comma as separator
					String[] courseline = line.split(cvsSplitBy);

					
					Course c;
					ArrayList<String> teachers=new ArrayList<String>();
					 String coursecode="";
					 String name="";
					 String description="";
					
					int credit_hours=0;
					
					 String prereq="";

					 String fall="";
					 String summer="";
					String spring="";

					int capacity=25;
					for(int i=0;i<courseline.length;i++){
					if(i==0)
					{
					coursecode=courseline[i];	
					}	
					if(i==1)
					{
					name=courseline[i];	
					}
					
					if(i==2)
					{
						credit_hours=Integer.parseInt(courseline[i]);	
					}
					if(i==3)
					{
					capacity=Integer.parseInt(courseline[i]);	
					}
					if(i==4)
					{
					fall=courseline[i];	
					}
					if(i==5)
					{
					spring=courseline[i];	
					}
					if(i==6)
					{
					summer=courseline[i];	
					}
					if(i==7)
					{
					prereq=courseline[i];	
					}
					if(i>=8)
					{
				
						teachers.add(courseline[i]);
					}
					
					
					}
					c=new 	Course(coursecode,  name, credit_hours, prereq,  fall,
							 summer, spring,  capacity,  teachers);
				courses.add(c)	;
				}

			} 
			catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (br != null) {
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			
			}}


		void ReadStudentsCourseData()
		{
			BufferedReader br = null;
			String line = "";
			String cvsSplitBy = ",";

			String id="";
			 String degree="";
			 String graduationterm="";
			 ArrayList<StudentCoursedata> scd;
			
			try {

				br = new BufferedReader(new FileReader("StudentCourseData.csv"));
				while ((line = br.readLine()) != null) {

				        // use comma as separator
					String[] courseline = line.split(cvsSplitBy);

					StudentCoursedata cd;

					
					for(int i=0;i<students.size();i++)
					{
						
						if(courseline[0].equals(students.get(i).getId()))
						{
						//	System.out.println(courseline[0]);
							
							cd=new StudentCoursedata(courseline[1],courseline[2],courseline[3],courseline[4]);
						//	System.out.println(cd.toString());
							students.get(i).AddCourseData(cd);
						}
					}
					
				}

			} 
			catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (br != null) {
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			
			}

		}
		void readStudentsDegree()
		{
			BufferedReader br = null;
			String line = "";
			String cvsSplitBy = ",";

			String id="";
			 String degree="";
			 String graduationterm="";
			 ArrayList<StudentCoursedata> scd;
			
			try {

				br = new BufferedReader(new FileReader("StudentDegreeData.csv"));
				while ((line = br.readLine()) != null) {

				        // use comma as separator
					String[] courseline = line.split(cvsSplitBy);

					 
					 id=courseline[0];
					degree=courseline[1];
					graduationterm=courseline[2];
				
					Student st=new Student(id,degree,graduationterm);
					students.add(st);
				}

			} 
			catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (br != null) {
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			
			}
			
		}
	
		public void ImportFaculty()
		{
			BufferedReader br = null;
			String line = "";
			String cvsSplitBy = ",";

			
			try {

				br = new BufferedReader(new FileReader("TestDataFaculty.csv"));
				while ((line = br.readLine()) != null) {

				        // use comma as separator
					String[] courseline = line.split(cvsSplitBy);

					 String firstname="";
					 String lastname="";
					String days="";
					 int maxloadfall=0;
					 int maxloadsummer=0;
					 int maxloadspring=0;
					
					 
					firstname=courseline[0];
					lastname=courseline[1];
					 days=courseline[2];
					 maxloadfall=Integer.parseInt(courseline[3]);
					  maxloadsummer=Integer.parseInt(courseline[4]);
					  maxloadspring=Integer.parseInt(courseline[5]);
					
					  Faculty f=new Faculty(firstname,lastname,days,maxloadfall,maxloadsummer,maxloadspring);
			
					  faculty.add(f);
				}

			} 
			catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (br != null) {
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			
			}
			

			
		}
		
		public void importDegreeData()
		{

			BufferedReader br = null;
			String line = "";
			String cvsSplitBy = ",";

			
			try {

				br = new BufferedReader(new FileReader("TestDataDegreePlanReq.csv"));
				while ((line = br.readLine()) != null) {

				        // use comma as separator
					String[] courseline = line.split(cvsSplitBy);


					 String description="";
				 int hours;
					 String type="";
					 ArrayList<String>courses=new ArrayList<String>();
					
					 
					 
					  description=courseline[1];
					  hours=Integer.parseInt(courseline[2]);
						 type=courseline[3];
						 
					
						 for(int i=4;i<courseline.length;i++)
						 {
							 courses.add(courseline[i]);
						 }
						 
						 DegreeData dd=new DegreeData(description,hours,type,courses);
				 for(int i=0;i<degrees.size();i++)
						 {
							 
							 if(courseline[0].equals(degrees.get(i).getCode()))
							 {
								 degrees.get(i).addDegreeData(dd);
							 }
						 }
			 
					}

			} 
			catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (br != null) {
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}

		public void importDegree()
		{

			BufferedReader br = null;
			String line = "";
			String cvsSplitBy = ",";

			
			try {

				br = new BufferedReader(new FileReader("TestDataDegrees.csv"));
				while ((line = br.readLine()) != null) {

				        // use comma as separator
					String[] courseline = line.split(cvsSplitBy);

				 String code="";
					 String school="";
				 String degreename="";
					 int forecast=0;
					
					  code=courseline[0];
					  school=courseline[1];
				  degreename=courseline[2];
					  forecast=Integer.parseInt(courseline[3]);
					 
					  Degree deg=new Degree(code,school,degreename,forecast);
					  degrees.add(deg);
				}

			} 
			catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (br != null) {
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	public ImportData() {
		this.setSize(new Dimension(600,450));
		
		getContentPane().setLayout(null);
		
		JLabel lblImportData = new JLabel("Import Data");
		lblImportData.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblImportData.setBounds(214, 22, 180, 20);
		getContentPane().add(lblImportData);
		
		JButton btnImport = new JButton("Import");
		btnImport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				readCourseData();
				readStudentsDegree();
				ReadStudentsCourseData();
				ImportFaculty();
			
				importDegree();
				importDegreeData();
				ReadRoomData();
				JOptionPane.showMessageDialog(new Login(), "Data Imported.");

			}
		});
		btnImport.setBounds(187, 224, 89, 23);
		getContentPane().add(btnImport);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(305, 224, 89, 23);
		getContentPane().add(btnCancel);
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				AdminPanel ap=new AdminPanel();
				setVisible(true);
				ap.setVisible(true);
			
			}
		});
		btnBack.setBounds(501, 25, 73, 23);
		getContentPane().add(btnBack);
	}
}
