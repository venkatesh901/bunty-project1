package courseScheduling;

import java.util.ArrayList;

public class Course {

	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	@Override
	public String toString() {
		return "Course [coursecode=" + coursecode + ", name=" + name + ", credit_hours=" + credit_hours + ", prereq="
				+ prereq + ", fall=" + fall + ", summer=" + summer + ", spring=" + spring + ", capacity=" + capacity
				+ ", teachers=" + teachers + "]";
	}
	private String coursecode;
	private String name;
	
	private int credit_hours;
	
	private String prereq;

	private String fall;
	private String summer;
	private String spring;
	
	private int capacity;
	
	private ArrayList<String> teachers;

	
	public Course(String coursecode, String name, int credit_hours, String prereq, String fall,
			String summer, String spring, int capacity, ArrayList<String> teachers) {
		super();
		this.coursecode = coursecode;
		this.name = name;
		this.credit_hours = credit_hours;
		this.prereq = prereq;
		this.fall = fall;
		this.summer = summer;
		this.spring = spring;
		this.capacity = capacity;
		this.teachers = teachers;
	}


	public ArrayList<String> getTeachers() {
		return teachers;
	}


	public void setTeachers(ArrayList<String> teachers) {
		this.teachers = teachers;
	}

	public String getCoursecode() {
		return coursecode;
	}
	public void setCoursecode(String coursecode) {
		this.coursecode = coursecode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCredit_hours() {
		return credit_hours;
	}
	public void setCredit_hours(int credit_hours) {
		this.credit_hours = credit_hours;
	}
	public String getPrereq() {
		return prereq;
	}
	public void setPrereq(String prereq) {
		this.prereq = prereq;
	}
	public String getFall() {
		return fall;
	}
	public void setFall(String fall) {
		this.fall = fall;
	}
	public String getSummer() {
		return summer;
	}
	public void setSummer(String summer) {
		this.summer = summer;
	}
	public String getSpring() {
		return spring;
	}
	public void setSpring(String spring) {
		this.spring = spring;
	}
		

	
		
}
