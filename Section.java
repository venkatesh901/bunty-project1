package courseScheduling;

import java.util.ArrayList;

public class Section {

	@Override
	public String toString() {
		return "\nSection [Course="+course.getName()+" room No.=" + room.getNumber()+" Building="+room.getBuilding() + ", students=" + students + ", Day=" + Day + ", teacher=" + teacher.getFirstname() + "]";
	}

	public String getDay() {
		return Day;
	}

	public void setDay(String day) {
		Day = day;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public Faculty getTeacher() {
		return teacher;
	}

	public void setTeacher(Faculty teacher) {
		this.teacher = teacher;
	}
	
	

	



	
	public Section(Room room, Course course, String day, Faculty teacher,ArrayList<Student> st) {
		super();
		this.room = room;
		this.course = course;
		Day = day;
	this.students=st;
		this.teacher = teacher;
	}
	




	Room room;
	Course course;
	ArrayList<Student> students=new ArrayList<Student>();
	String Day;
	Faculty teacher;
	
	
	
}
