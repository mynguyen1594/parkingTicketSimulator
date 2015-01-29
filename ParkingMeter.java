package parkingTicketSimulator;

public class ParkingMeter {
	private int purchasedTime;

	ParkingMeter() {}

	public ParkingMeter(int minutes) {
		purchasedTime = minutes;
	}

	public int getPurchasedTime() {
		return purchasedTime;
	}

	public void setPurchasedTime(int purchasedTime) {
		this.purchasedTime = purchasedTime;
	}
}
