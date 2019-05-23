package src;

import java.util.ArrayList;

public class C2CRelation {
	
	public Circle c1;
	public Circle c2;
	
	double r1;
	double r2;
	public double r;
	public double distanceMiddlePoints;
	public int amountOfIntersections;

	public C2CRelation() {
		
	}
	
	public ArrayList<Coordinate> calculateIntersections (Circle c1, Circle c2) {
		
		ArrayList<Coordinate> intersections = new ArrayList<Coordinate>();

		double r1 = c1.radius;
		double r2 = c2.radius;
		
		double temp_r = r1 + r2;
		
		double r = (Math.round(temp_r * 10000000000.0) / 10000000000.0);
		
		double m1_x = c1.centerPoint.x;
		double m2_x = c2.centerPoint.x;
		
		double m1_y = c1.centerPoint.y;
		double m2_y = c2.centerPoint.y;
		
		double temp1 = m1_x - m2_x;
		double temp2 = m1_y - m2_y;
		double delta_x = Math.abs(Math.round(temp1 * 10000000000.0) / 10000000000.0);
		double delta_y = Math.abs(Math.round(temp2 * 10000000000.0) / 10000000000.0);
		
		double distanceMiddlePoints = Math.sqrt((delta_x * delta_x) + (delta_y * delta_y));
		
		if ((distanceMiddlePoints > r) || (distanceMiddlePoints == 0)) {
			
			return intersections;
			
		}
		
		double temp_a = ((r1 * r1) - (r2 * r2) + (distanceMiddlePoints * distanceMiddlePoints)) / (2 * distanceMiddlePoints);
		double a = Math.abs(Math.round(temp_a * 10000000000.0) / 10000000000.0);
		
		double h = Math.sqrt((r1 * r1) - (a * a));
		
		if (((r1 * r1) - (a * a)) < 0) {
			
			return intersections;
			
		}
		
		double x2 = c1.centerPoint.x + a * (c2.centerPoint.x - c1.centerPoint.x) / distanceMiddlePoints;
		double y2 = c1.centerPoint.y + a * (c2.centerPoint.y - c1.centerPoint.y) / distanceMiddlePoints;
		
		double x3 = x2 + h * (c2.centerPoint.y - c1.centerPoint.y) / distanceMiddlePoints;
		double x4 = x2 - h * (c2.centerPoint.y - c1.centerPoint.y) / distanceMiddlePoints;
		
		double y3 = y2 - h * (c2.centerPoint.x - c1.centerPoint.x) / distanceMiddlePoints;
		double y4 = y2 + h * (c2.centerPoint.x - c1.centerPoint.x) / distanceMiddlePoints;
		
		Coordinate I1 = new Coordinate(x3, y3);
		Coordinate I2 = new Coordinate(x4, y4);
		
		intersections.add(I1);
		


		if (distanceMiddlePoints < r) {

			intersections.add(I2);
			
		}
		
		return intersections;
	}
}
