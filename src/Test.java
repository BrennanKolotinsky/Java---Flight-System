import java.util.ArrayList;

public class Test {
	
	// let's build the project out of our flights class
	public static void main(String[] args) {
		
		// let's create our flight objects
		Flight aFlight1 = new Flight(1, "YUL", "YYZ");
		Flight aFlight2 = new Flight(1, "YUL", "YYC");
		Flight aFlight3 = new Flight(1, "YUL", "YVR");
		Flight aFlight4 = new Flight(2, "YUL", "YYZ");
		Flight aFlight5 = new Flight(2, "YUL", "YYC");
		Flight aFlight6 = new Flight(2, "YUL", "YVR");
				
		// now let's create a flights object and put them all together -- there is likely an easier way to do this with a loop or by using a super, but it works so I'll just stick with it for now.
		ArrayList<Flight> FlightsToAdd = new ArrayList<Flight>();
		FlightsToAdd.add(aFlight1);
		FlightsToAdd.add(aFlight2);
		FlightsToAdd.add(aFlight3);
		FlightsToAdd.add(aFlight4);
		FlightsToAdd.add(aFlight5);
		FlightsToAdd.add(aFlight6);
		
		// pass in our array list of flights and construct a flights class
		Flights flights1 = new Flights(FlightsToAdd);
		flights1.printAllFlights();
		
		
	}
}
