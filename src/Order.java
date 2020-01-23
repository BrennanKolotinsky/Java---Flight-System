
public class Order {
	String destination;
	int orderNum;
	
	boolean assigned = false; // order isn't assigned yet
	String flightNum = "not scheduled";
	int dateOfDeparture; // once the order is assigned a date of departure, this will be updated
	String departureCity;
	
	static int totalOrders = 0;
	
	// I was going to make a separate class for each kind of order, but I'd rather just keep a running count and serve the orders with the smaller number first for each category
	static int ordersYYZ = 0;
	static int ordersYYC = 0;
	static int ordersYYE = 0;
	static int ordersYVR = 0;
	
	public Order(String orderDestination, int orderNumber) {
		totalOrders++; // increment the total orders
		orderNum = orderNumber;
		destination = orderDestination;
		
		// increment the orders for each location
		switch(orderDestination) {
			case "YYZ":
				ordersYYZ++;
				break;
			case "YYC":
				ordersYYC++;
				break;
			case "YYE":
				ordersYYE++;
				break;
			case "YVR":
				ordersYVR++;
				break;
		}
	}
	
	// if 1 is returned, the order was successfully signed, if 0 was returned the order wasn't assigned
	public boolean assignFlight(Flights trackedFlights, String dest) {
		// let's loop through all of the flights and try to assign to one of them -- this could be done better by creating a flight class for each destination!
		for (int i = 0; i < trackedFlights.getFlights().size(); i++) {
			// let's find a flight headed to our destination
			Flight aFlight = trackedFlights.getFlights().get(i);

			if (aFlight.getArrival().equals(dest)) {
				// let's see if the capacity is greater than zero and if so decrease it by one and add the order --> if there is no capacity let's keep searching
				if (aFlight.getCap() > 0) {
					aFlight.setCap(aFlight.getCap() - 1); // reduce our capacity by one
					setAssigned(true);
					setDate(aFlight.getDay()); // let's cast the date to a string that way we can set it to not scheduled
					setFlightNum(String.valueOf(aFlight.getDay()));
					setDepartureCity(aFlight.getDepart());
					return true;
				}
			}
		}
		
		// if an order couldn't be assigned to a flight, let's leave the flight number unassigned and return false
		return false;
	}
	
	public String getDestination() {
		return destination;
	}
	
	// a bunch of setters, to create order information
	public void setAssigned(boolean assign) {
		this.assigned = assign;
	}
	
	public boolean getAssigned() {
		return assigned;
	}
	
	public void setDate(int day) {
		this.dateOfDeparture = day;
	}
	
	public void setFlightNum(String flightNumber) {
		this.flightNum = flightNumber;
	}
	
	public void setDepartureCity(String city) {
		this.departureCity = city;
	}
	
	public String toString() {
		// display more information if the order has been assigned to a flight
		if (getAssigned() == true) {
			return "order: " + orderNum + ", flightNumber: " + flightNum + ", departure: " + departureCity + ", arrival: " + destination + ", day: " + dateOfDeparture;
		} else {
			return "order: " + orderNum + ", flightNumber: " + flightNum;
		}
	}
}
