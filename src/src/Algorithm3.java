package src;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Algorithm3 {
	
	Circle[] circles;
	int amountOfCircles;
	
	public Algorithm3(Circle[] c) {
		
		circles = c;
		amountOfCircles = circles.length;
		
	}
	
	public void run() throws FileNotFoundException, UnsupportedEncodingException {
		
		PrintWriter writer = new PrintWriter("uitvoercirkels.txt", "UTF-8");
		
		/*
		
		long startTime = System.nanoTime();
		
		C2CRelation r = new C2CRelation();
		int track = 0;
		
		Comparator<Event> eventComparator = new Comparator<Event>() {
            public int compare(Event e1, Event e2) {
                return Double.compare(e1.x, e2.x);
            }
		};
		
        PriorityQueue<Event> eventQueue = new PriorityQueue<>(eventComparator);

		for (int i = 0; i < circles.length; i++) {
			  
			Event e1 = new Event(circles[i].leftestPoint.x, circles[i], EventType.STARTCIRCLE);
			Event e2 = new Event(circles[i].rightestPoint.x, circles[i], EventType.ENDCIRCLE);

			eventQueue.add(e1);
			eventQueue.add(e2);
        }
		
		BST tree = new BST();

		
		while (!eventQueue.isEmpty()) {
			
			Event e = eventQueue.poll();
			
			if (e.type == EventType.STARTCIRCLE) {
				
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
		
		*/
		
		writer.println();
		writer.close();
	}
}