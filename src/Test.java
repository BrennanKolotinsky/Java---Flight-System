import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Test {
	
	// let's build the project out of our flights class
	public static void main(String[] args) {
		
		// PART 1:
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
		
		// PART 2:
		JSONParser parser = new JSONParser();
		JSONArray a = (JSONArray) parser.parse(new FileReader("/Users/brennan/eclipse-workspace/Java/FlightSystem/coding-assigment-orders.json"));
		
		
	}
}
