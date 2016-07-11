package courseScheduling;

public class Room {

	
	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public String getBuilding() {
		return building;
	}


	public void setBuilding(String building) {
		this.building = building;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public Room(int number, String building, int capacity, boolean status) {
		super();
		this.number = number;
		this.building = building;
		this.capacity = capacity;
		this.status = status;
	}
	
	
	private int number;
	private String building;
	private int capacity;
	private boolean status;
	
	
	
	
	
}
