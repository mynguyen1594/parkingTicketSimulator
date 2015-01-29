package parkingTicketSimulator;

public class ParkingTicketSimulator {

	public static void main(String[] args) {
		ParkedCar parkedCar = new ParkedCar("Lamborghini", "Aventador LP 700-4", "Black", "nDebt", 121);
		ParkingMeter parkingMeter = new ParkingMeter(60);
		PoliceOfficer policeOfficer = new PoliceOfficer("Howard A. Pollman", 8441);
		
		policeOfficer.examineAndIssueTicket(parkedCar, parkingMeter);
		
	}

}
