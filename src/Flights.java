import java.util.ArrayList;

public class Flights {
	
	//creating array lists to hold the Flight objects
	ArrayList<Flight> FlightsStored;
	static int totalFlights;

	// default way of creating the class -- that way our super still works in the Flight class
	public Flights() {
	}
	
	// creating the class by explicitly calling it and placing and the flights into it
	public Flights(ArrayList<Flight> FlightsToAdd) {
		FlightsStored = FlightsToAdd;
	}
	
	public void printAllFlights() {
		// loop over each flight object stored and output the data
		for (int i = 0; i < FlightsStored.size(); i++) {
			// let's get the appropriate object in our ArrayList based on the index, it is printing the appropriate information based on our toString method in our Flight class		
			System.out.println(FlightsStored.get(i));
		}
	}
	
	public ArrayList<Flight> getFlights() {
		return FlightsStored;
	}
	
	public String toString() {
		return "";
	}
}