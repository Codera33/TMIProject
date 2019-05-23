package src;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Algorithm1 {
	
	Circle[] circles;
	int amountOfCircles;
	
	public Algorithm1(Circle[] c) {
		
		circles = new Circle[c.length];
		System.arraycopy(c, 0, circles, 0, c.length);
		amountOfCircles = circles.length;
		
	}
	
	public void run() throws FileNotFoundException, UnsupportedEncodingException {
		
		PrintWriter writer = new PrintWriter("uitvoercirkels.txt", "UTF-8");
		
		long startTime = System.nanoTime();

		Circle c1;
		Circle c2;
		
		C2CRelation r = new C2CRelation();
		int track = 0;
		
		for (int i = 0; i < (amountOfCircles - 1); i++) {
			
			c1 = circles[i];
			
			for (int l = i + 1; l < amountOfCircles; l++) {
				
				c2 = circles[l];
				
				ArrayList<Coordinate> temp = r.calculateIntersections(c1, c2);
				if (temp.size() != 0) {

					for (int u = 0; u < temp.size(); u++) {
				
						writer.println(temp.get(u).x + " " + temp.get(u).y);
						track++;
					}
				}
			}
		}
		
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		long durationInMs = TimeUnit.MILLISECONDS.convert(totalTime, TimeUnit.NANOSECONDS);
		
		writer.println();
		writer.println(durationInMs);

		
		writer.close();
		System.out.println("Alg1 Amount of intersections: " + track);
	}
}
