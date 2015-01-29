package parkingTicketSimulator;

public class ParkedCar {
	private String maker;
	private String model;
	private String color;
	private String lisenceNumber;
	private int parkedTime;

	ParkedCar() {}

	ParkedCar (String Maker, String Model, String Color, String LisenceNum, int ParkedTime) {
		maker = Maker;
		model = Model;
		color = Color;
		lisenceNumber = LisenceNum;
		parkedTime = ParkedTime;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getLisenceNumber() {
		return lisenceNumber;
	}

	public void setLisenceNumber(String lisenceNumber) {
		this.lisenceNumber = lisenceNumber;
	}

	public int getParkedTime() {
		return parkedTime;
	}

	public void setParkedTime(int parkedTime) {
		this.parkedTime = parkedTime;
	}
}
