package src;

public class Circle {
	
	public double radius;
	
	public Coordinate centerPoint;
	
	public Coordinate leftestPoint;
	public Coordinate rightestPoint;
	
	public Coordinate highestPoint;
	public Coordinate lowestPoint;
	
	public Circle(Coordinate center, double r) {
		
		radius = r;
		
		centerPoint = center;
		
		double leftestPointX = centerPoint.x - r;
		double leftestPointY = centerPoint.y;
		
		leftestPoint = new Coordinate (leftestPointX, leftestPointY);

		double temp1 = centerPoint.x + r;
		double rightestPointX = Math.round(temp1 * 100.0) / 100.0;
		double rightestPointY = centerPoint.y;
		
		rightestPoint = new Coordinate (rightestPointX, rightestPointY);
		
		double highestPointX = centerPoint.x;
		double temp2 = centerPoint.y + r;
		double highestPointY = Math.round(temp2 * 100.0) / 100.0;
		
		highestPoint = new Coordinate (highestPointX, highestPointY);
		
		double lowestPointX = centerPoint.x;
		double lowestPointY = centerPoint.y - r;
		
		lowestPoint = new Coordinate (lowestPointX, lowestPointY);	
	}
	
	public boolean intersectsWithCirlce (Circle c) {
		
		boolean intersects = false;
		
		double r1 = radius;
		double r2 = c.radius;
		
		double r = r1 + r2;
		
		double m1_x = centerPoint.x;
		double m2_x = c.centerPoint.x;
		
		double m1_y = centerPoint.y;
		double m2_y = c.centerPoint.y;
		
		double temp1 = m1_x - m2_x;
		double temp2 = m1_y - m2_y;
		double delta_x = Math.abs(Math.round(temp1 * 100.0) / 100.0);
		double delta_y = Math.abs(Math.round(temp2 * 100.0) / 100.0);
		
		double hypotenuse = Math.sqrt((delta_x * delta_x) + (delta_y * delta_y));
		
		if (!(hypotenuse > r)) {
			
			intersects = true;
			
		}
		
		System.out.println(intersects);
		
		return intersects;
		
		
	}
	
	
}
