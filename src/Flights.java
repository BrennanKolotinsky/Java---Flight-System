import java.util.ArrayList;

public class Flights {
	
	//creating array lists to hold the Flight objects
	ArrayList<Flight> Flights;
	static int totalFlights;

	// default way of creating the class
	public Flights() {
	}
	
	// creating the class by explicitly calling it and placing and the flights into it
	public Flights(ArrayList<Flight> FlightsToAdd) {
		Flights = FlightsToAdd;
	}
	
	public String toString() {
		return "";
	}
	
	
//	public void addFlight(int day, String dep, String arrival) {
		//Flight aSimpleFlight = new Flight(day, dep, arrival);
//		Flights.add(aFlight);	
//	}
}