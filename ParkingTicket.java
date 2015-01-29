package parkingTicketSimulator;

//import parkingTicketSimulator.ParkingTicketSimulator.ParkedCar;
//import project_2.Project_2.ParkingMeter;

public class ParkingTicket {
	ParkedCar parkedCar;
	ParkingMeter parkingMeter;
	PoliceOfficer policeOfficer;
	
	// Constructor
	public ParkingTicket (ParkedCar ParkedCar, ParkingMeter ParkingMeter, PoliceOfficer PoliceOfficer) {
		this.parkedCar = ParkedCar;
		this.parkingMeter = ParkingMeter;
		this.policeOfficer = PoliceOfficer;
	}
	
	public String reportMaker() {
		return this.parkedCar.getMaker();
	}
	
	public String reportModel() {
		return this.parkedCar.getModel();
	}
	
	public String reportColor() {
		return this.parkedCar.getColor();
	}
	
	public String reportLicenseNumber() {
		return this.parkedCar.getLisenceNumber();
	}
	
	public double reportFine () {
		double parkedFine = 0;
		
		// The violated time is the difference between the parked time and the time purchased.
		double violatedTime = parkedCar.getParkedTime() - parkingMeter.getPurchasedTime();
		double hrs = violatedTime/60;	// Convert to hours
		double min = violatedTime % 60;	// Convert to minutes
		
		if (hrs <= 1) {	// For parking inappropriately equal or under 1 hour 
			parkedFine = 25;
		}
		// Otherwise, the fine equals to $25 for the 1st hour plus $10 for each additional hours
		else {	
				int roundDwnHrs = (int)hrs;	// Round down the hours
				
				if (min == 0) {
					roundDwnHrs -= 1;	// minus 1 if there is no minute (whole hours)
				}
				parkedFine = 25 + roundDwnHrs*10;
		}
		
		return parkedFine;
	}
	
	public String reportOfficerName() {
		return this.policeOfficer.getName();
	}
	
	public int reportOfficerBadgeNum () {
		return this.policeOfficer.getBadgeNumber();
	}
}
