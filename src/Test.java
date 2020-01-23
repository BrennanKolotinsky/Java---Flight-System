import java.util.ArrayList;

public class Test {
	ArrayList<Flight> Flights;
	
	// let's build the project out of our flights class
	public static void main(String[] args) {
		System.out.println("Here");
		
		// let's create our flight objects
		Flight aFlight1 = new Flight(1, "YUL", "YYZ");
		Flight aFlight2 = new Flight(1, "YUL", "YYC");
		Flight aFlight3 = new Flight(1, "YUL", "YVR");
		Flight aFlight4 = new Flight(2, "YUL", "YYZ");
		Flight aFlight5 = new Flight(2, "YUL", "YYC");
		Flight aFlight6 = new Flight(2, "YUL", "YVR");
		
		System.out.println(aFlight6.getDepart());
		
		// now let's create a flights object and put them all together
	}
}
