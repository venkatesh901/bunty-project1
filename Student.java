package courseScheduling;

import java.util.ArrayList;

public class Student {

	public int getCount() {
		return count;
	}
	public void setCount() {
		count++;
	}
	@Override
	public String toString() {
		return "\nStudent [id=" + id + ", degree=" + degree + ", graduationterm=" + graduationterm + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getGraduationterm() {
		return graduationterm;
	}
	public void setGraduationterm(String graduationterm) {
		this.graduationterm = graduationterm;
	}
	public ArrayList<StudentCoursedata> getScd() {
		return scd;
	}
	public void setScd(ArrayList<StudentCoursedata> scd) {
		this.scd = scd;
	}
	
	
	public Student(String id, String degree, String graduationterm) {
		super();
		
		this.id = id;
		this.degree = degree;
		this.graduationterm = graduationterm;
	}


	void AddCourseData(StudentCoursedata sc)
	{
		scd.add(sc);
	}
	
	private String id;
	private String degree;
	private String graduationterm;
	private ArrayList<StudentCoursedata> scd=new ArrayList<StudentCoursedata>();
	
	private int count=0;
	
	
}
