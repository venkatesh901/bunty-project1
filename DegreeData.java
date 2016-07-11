package courseScheduling;

import java.util.ArrayList;

public class DegreeData {

	@Override
	public String toString() {
		return "DegreeData [description=" + description + ", hours=" + hours + ", type=" + type + "]";
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public ArrayList<String> getCourses() {
		return courses;
	}
	public void setCourses(ArrayList<String> courses) {
		this.courses = courses;
	}
	
	
	public DegreeData( String description, int hours, String type, ArrayList<String> courses) {
		super();
		this.description = description;
		this.hours = hours;
		this.type = type;
		courses=new ArrayList<String>();
		this.courses = courses;
	}


	
	private String description;
	private int hours;
	private String type;
	private ArrayList<String>courses;
	
	
}
