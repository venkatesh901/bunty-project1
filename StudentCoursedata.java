package courseScheduling;

public class StudentCoursedata {

	@Override
	public String toString() {
		return "StudentCoursedata [code=" + code + ", name=" + name + ", semester=" + semester + ", grade=" + grade
				+ "]";
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	public StudentCoursedata(String code, String name, String semester, String grade) {
		super();
		this.code = code;
		this.name = name;
		this.semester = semester;
		this.grade = grade;
	}


	
	private String code;
	private String name;
	private String semester;
	private String grade;
	
	
}
