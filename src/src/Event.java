package src;

public class Event implements Comparable<Event> {
	
	public double x;
	public Circle c;
	
	EventType type;
	
	public Event (double orig_x, Circle orig_c, EventType orig_type) {
		
		x = orig_x;
		c = orig_c;
		type = orig_type;
		
	}
	
	public int compareTo(Event compareE) {
		
		return Double.compare(x, compareE.x);
		
	}	

}
