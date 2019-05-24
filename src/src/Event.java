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
		
		if(Double.compare(x, compareE.x) == 0) {
			if (type == EventType.STARTCIRCLE) {
				return -1;
			} else if (compareE.type == EventType.STARTCIRCLE) {
				return 1;
			}
			
		}
		
		return Double.compare(x, compareE.x);
		
	}	

}
