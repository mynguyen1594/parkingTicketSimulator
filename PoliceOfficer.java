package parkingTicketSimulator;

public class PoliceOfficer {
		String name;
		int badgeNumber;

		PoliceOfficer() {}

		PoliceOfficer(String Name, int BadgeNum) {
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
		
}
