
public class Order {
	String destination;
	int orderNum;
	static int totalOrders = 0;
	
	// I was going to make a separate class for each kind of order, but I'd rather just keep a running count and serve the orders with the smaller number first for each category
	static int ordersYYZ = 0;
	static int ordersYYC = 0;
	static int ordersYYE = 0;
	static int ordersYVR = 0;
	
	public Order(String orderDestination) {
		totalOrders++; // increment the orders
		orderNum = totalOrders;
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
	
	public String toString() {
		return "Order Number: " + orderNum + ", Destination: " + destination;
	}
}
