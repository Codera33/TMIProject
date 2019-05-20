package src;

import java.util.ArrayList;

public class Algorithm1 {
	
	Circle[] circles;
	int amountOfCircles;
	
	public Algorithm1(Circle[] c) {
		
		circles = new Circle[c.length];
		System.arraycopy(c, 0, circles, 0, c.length);
		amountOfCircles = circles.length;
		
	}
	
	public void run() {
		
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
					
					
				} else if (relation.amountOfIntersections == 2) {

					intersections.add(relation.intersections.get(0));
					intersections.add(relation.intersections.get(1));
					
				}
			}
		}
	}
}
