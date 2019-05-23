package src;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class Algorithm1 {
	
	Circle[] circles;
	int amountOfCircles;
	
	public Algorithm1(Circle[] c) {
		
		circles = new Circle[c.length];
		System.arraycopy(c, 0, circles, 0, c.length);
		amountOfCircles = circles.length;
		
	}
	
	public void run() throws FileNotFoundException, UnsupportedEncodingException {
		
		Circle c1;
		Circle c2;
		
		ArrayList<Coordinate> intersections = new ArrayList<Coordinate>();
		
		for (int i = 0; i < (amountOfCircles - 1); i++) {
			
			c1 = circles[i];
			
			for (int l = i + 1; l < amountOfCircles; l++) {
				
				c2 = circles[l];
				
				C2CRelation relation = new C2CRelation(c1, c2);
				
				if (relation.amountOfIntersections == 0) {

					continue;
					
				} else if (relation.amountOfIntersections == 1) {
					
					intersections.add(relation.intersections.get(0));
					continue;

					
				} else if (relation.amountOfIntersections == 2) {
					
					intersections.addAll(relation.intersections);
					continue;

				}
			}
		}

		PrintWriter writer = new PrintWriter("uitvoercirkels.txt", "UTF-8");
		
		for (int i = 0; i < intersections.size(); i++) {

		writer.println(intersections.get(i).x + " " + intersections.get(i).y);
		System.out.println(intersections.get(i).x + " " + intersections.get(i).y);

		}
		writer.close();
	}
}
