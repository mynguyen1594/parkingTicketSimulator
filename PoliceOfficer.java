package parkingTicketSimulator;

public class PoliceOfficer {
		private String name;
		private int badgeNumber;

		PoliceOfficer() {}

		public PoliceOfficer(String Name, int BadgeNum) {
			name = Name;
			badgeNumber = BadgeNum;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getBadgeNumber() {
			return badgeNumber;
		}

		public void setBadgeNumber(int badgeNumber) {
			this.badgeNumber = badgeNumber;
		}
		
		public boolean examineParkedCar(ParkedCar parkedCar, ParkingMeter parkingMeter) {
			boolean issueTicket = false;
			
			if (parkedCar.getParkedTime() > parkingMeter.getPurchasedTime()) {
				issueTicket = true;
			}
			else {
				issueTicket = false;
			}
			return issueTicket;
		}
		
		public void examineAndIssueTicket(ParkedCar parkedCar, ParkingMeter parkingMeter) {
			ParkingTicket parkingTicket = new ParkingTicket (parkedCar, parkingMeter, this);
			
			if (parkedCar.getParkedTime() > parkingMeter.getPurchasedTime()) {
				System.out.printf("\t\t PARKING TICKET \n");
				System.out.printf("**************************************************\n");
				System.out.printf("License Number: " + parkingTicket.reportLicenseNumber()
								+ "\t Color: " + parkingTicket.reportColor() + "\n");
				System.out.printf("Maker: " + parkingTicket.reportMaker()
								+ "\t Model: " + parkingTicket.reportModel() + "\n");
				System.out.printf("Fine Amount: $%1.2f \n", parkingTicket.reportFine());
				System.out.printf("Police Officer: " + parkingTicket.reportOfficerName()
								+ "\nBadge Number: " + parkingTicket.reportOfficerBadgeNum());
				
			}
			else {
				System.out.printf("*** Ticket is not issued *** \n");
			}
		}
}
