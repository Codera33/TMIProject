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
		
		double temp_distanceMiddlePoints = Math.sqrt((delta_x * delta_x) + (delta_y * delta_y));
		double distanceMiddlePoints = Math.round(temp_distanceMiddlePoints * 10000000000.0) / 10000000000.0;
		
		if ((distanceMiddlePoints > r) || (distanceMiddlePoints == 0)) {
			
			return intersections;
			
		}
		
		double temp_t = Math.round(((r1 * r1) - (r2 * r2)) * 10000000000.0) / 10000000000.0;
		double temp_u = Math.round((distanceMiddlePoints * distanceMiddlePoints) * 10000000000.0) / 10000000000.0;
		double temp_a = (temp_t + temp_u) / (2 * distanceMiddlePoints);
		double a = Math.abs(Math.round(temp_a * 10000000000.0) / 10000000000.0);
		
		double h = Math.sqrt((r1 * r1) - (a * a));
		
		if (((r1 * r1) - (a * a)) < 0) {
			
			return intersections;
			
		}
		
		double temp_c2xc1x = Math.round((c2.centerPoint.x - c1.centerPoint.x) * 10000000000.0) / 10000000000.0;
		double temp_c2yc1y = Math.round((c2.centerPoint.y - c1.centerPoint.y) * 10000000000.0) / 10000000000.0;
		
		double x2 = c1.centerPoint.x + a * temp_c2xc1x / distanceMiddlePoints;
		double y2 = c1.centerPoint.y + a * temp_c2yc1y / distanceMiddlePoints;
		
		double x3_temp = x2 + h * temp_c2yc1y / distanceMiddlePoints;
		double x4_temp = x2 - h * temp_c2yc1y / distanceMiddlePoints;
		double x3 = Math.round(x3_temp * 10000000000.0) / 10000000000.0;
		double x4 = Math.round(x4_temp * 10000000000.0) / 10000000000.0;
		
		double y3_temp = y2 - h * temp_c2xc1x/ distanceMiddlePoints;
		double y4_temp = y2 + h * temp_c2xc1x / distanceMiddlePoints;
		double y3 = Math.round(y3_temp * 10000000000.0) / 10000000000.0;
		double y4 = Math.round(y4_temp * 10000000000.0) / 10000000000.0;
		
		Coordinate I1 = new Coordinate(x3, y3);
		Coordinate I2 = new Coordinate(x4, y4);
		
		intersections.add(I1);

		if ((distanceMiddlePoints < r) && (!((I1.x == I2.x) && (I1.y == I2.y)))) {

			intersections.add(I2);
			
		}
		
		return intersections;
	}
}
