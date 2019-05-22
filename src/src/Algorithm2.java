package src;

import java.util.ArrayList;
import java.util.Collections;

public class Algorithm2 {
	
	Circle[] circles;
	int amountOfCircles;
	
	public Algorithm2(Circle[] c) {
		
		circles = new Circle[c.length];
		System.arraycopy(c, 0, circles, 0, c.length);
		amountOfCircles = circles.length;
		
	}
	
	public void run() {
		
		ArrayList<Event> events = new ArrayList<Event>();
		ArrayList<Circle> activeCircles = new ArrayList<Circle>();
		ArrayList<Coordinate> intersections = new ArrayList<Coordinate>();

		for (int i = 0; i < circles.length; i++) {
			  
			Event e1 = new Event(circles[i].leftestPoint.x, circles[i], EventType.STARTCIRCLE);
			Event e2 = new Event(circles[i].rightestPoint.x, circles[i], EventType.ENDCIRCLE);

			events.add(e1);
			events.add(e2);
        } 
		
		Collections.sort(events);
		
		for (int i = 0; i < events.size(); i++) {
			
			if (events.get(i).type == EventType.STARTCIRCLE) {
				
				for (int u = 0; u < activeCircles.size(); u++) {
					
					C2CRelation r = new C2CRelation(events.get(i).c, activeCircles.get(u));
					intersections.addAll(r.intersections);
				}
				
				activeCircles.add(events.get(i).c);
				
			} else if (events.get(i).type == EventType.ENDCIRCLE) {
				
				activeCircles.remove(events.get(i).c);
				
			}
		}
	}
}
