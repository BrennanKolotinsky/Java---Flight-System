// please note, Java AND C# are hardly my strongest languages. I have used them both on occasion (Java) a bit more
// after playing with the syntax for a couple weeks I'll be much better at it.
public class Flight extends Flights {
	static int totalFlights = 0; //start with zero flights
	int flightNum;
	int dayOfFlight;
	int capacityAvailable = 20;
	String departCode;
	String arrivalCode;
	
	// constructor to create singular flight
	public Flight(int day, String dep, String arrival) {
		super(); // create the flights class
		
		totalFlights++; // increase the static total flights -- every object can access this method
		flightNum = totalFlights; // set the flight num based on the number of flights
		dayOfFlight = day;
		departCode = dep;
		arrivalCode = arrival;
	}
	
	// getters and setters
	public void setDepart(String dep) {
		this.departCode = dep;
	}

	public String getDepart() {
		return departCode;
	}

	public void setArrival(String arri) {
		this.arrivalCode = arri;
	}

	public String getArrival() {
		return arrivalCode;
	}
	
	public void setDay(int day) {
		this.dayOfFlight = day;
	}

	public int getDay() {
		return dayOfFlight;
	}
	
	public void setCap(int newCap) {
		this.capacityAvailable = newCap;
	}

	public int getCap() {
		return capacityAvailable;
	}
	
	public String toString() {
		return "Flight: " + flightNum + ", departure: " + departCode + ", arrival: " + arrivalCode + ", day: " + dayOfFlight;
	}
}
