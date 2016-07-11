package courseScheduling;

import java.util.ArrayList;

public class Degree {

	@Override
	public String toString() {
		return "Degree [code=" + code + ", school=" + school + ", degreename=" + degreename + ", forecast=" + forecast
				+ ", degreedata=" + degreedata + "]";
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getDegreename() {
		return degreename;
	}
	public void setDegreename(String degreename) {
		this.degreename = degreename;
	}
	public int getForecast() {
		return forecast;
	}
	public void setForecast(int forecast) {
		this.forecast = forecast;
	}
	public ArrayList<DegreeData> getDegreedata() {
		return degreedata;
	}
	public void setDegreedata(ArrayList<DegreeData> degreedata) {
		this.degreedata = degreedata;
	}
	
	
	public void addDegreeData(DegreeData d)
	{
		degreedata.add(d);
	}
	public Degree(String code, String school, String degreename, int forecast) {
		super();
		this.code = code;
		this.school = school;
		this.degreename = degreename;
		this.forecast = forecast;
	}


	private String code;
	private String school;
	private String degreename;
	private int forecast;
	private ArrayList<DegreeData> degreedata=new ArrayList<DegreeData>();
	
	
}
