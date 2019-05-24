package src;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class Algorithm2 {
	
	Circle[] circles;
	int amountOfCircles;
	
	public Algorithm2(Circle[] c) {
		
		circles = c;
		amountOfCircles = circles.length;
		
	}
	
	public void run() throws FileNotFoundException, UnsupportedEncodingException {
		
		PrintWriter writer = new PrintWriter("uitvoercirkels.txt", "UTF-8");
		
		long startTime = System.nanoTime();
		
		ArrayList<Event> events = new ArrayList<Event>();
		ArrayList<Circle> activeCircles = new ArrayList<Circle>();
		C2CRelation r = new C2CRelation();
		int track = 0;

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
					
					ArrayList<Coordinate> temp = r.calculateIntersections(events.get(i).c, activeCircles.get(u));

					if (temp.size() != 0) {

						for (int p = 0; p < temp.size(); p++) {
							
							writer.println(temp.get(p).x + " " + temp.get(p).y);
							track++;
						}
					}
				}
				
				activeCircles.add(events.get(i).c);
				
			} else if (events.get(i).type == EventType.ENDCIRCLE) {
				
				activeCircles.remove(events.get(i).c);
				
			}
		}
		
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		long durationInMs = TimeUnit.MILLISECONDS.convert(totalTime, TimeUnit.NANOSECONDS);
		
		writer.println();
		writer.println(durationInMs);

		
		writer.close();
		
		System.out.println("Amount of intersections: " + track);
	}
}
