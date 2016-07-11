package courseScheduling;

public class Faculty {

	public int getCount() {
		return count;
	}
	public void setCount() {
		count++;
	}
	@Override
	public String toString() {
		return "Faculty [firstname=" + firstname + ", lastname=" + lastname + ", days=" + days + ", maxloadfall="
				+ maxloadfall + ", maxloadsummer=" + maxloadsummer + ", maxloadspring=" + maxloadspring + "]";
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDays() {
		return days;
	}
	public void setDays(String days) {
		this.days = days;
	}
	public int getMaxloadfall() {
		return maxloadfall;
	}
	public void setMaxloadfall(int maxloadfall) {
		this.maxloadfall = maxloadfall;
	}
	public int getMaxloadsummer() {
		return maxloadsummer;
	}
	public void setMaxloadsummer(int maxloadsummer) {
		this.maxloadsummer = maxloadsummer;
	}
	public int getMaxloadspring() {
		return maxloadspring;
	}
	public void setMaxloadspring(int maxloadspring) {
		this.maxloadspring = maxloadspring;
	}
	
	
	public Faculty(String firstname, String lastname, String days, int maxloadfall, int maxloadsummer,
			int maxloadspring) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.days = days;
		this.maxloadfall = maxloadfall;
		this.maxloadsummer = maxloadsummer;
		this.maxloadspring = maxloadspring;
	}


	
	private String firstname;
	private String lastname;
	private String days;
	private int maxloadfall;
	private int maxloadsummer;
	private int maxloadspring;
	int count=0;
	
}
