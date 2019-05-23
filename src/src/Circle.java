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
		double rightestPointX = Math.round(temp1 * 1000000.0) / 1000000.0;
		double rightestPointY = centerPoint.y;
		
		rightestPoint = new Coordinate (rightestPointX, rightestPointY);
		
		double highestPointX = centerPoint.x;
		double temp2 = centerPoint.y + r;
		double highestPointY = Math.round(temp2 * 1000000.0) / 1000000.0;
		
		highestPoint = new Coordinate (highestPointX, highestPointY);
		
		double lowestPointX = centerPoint.x;
		double lowestPointY = centerPoint.y - r;
		
		lowestPoint = new Coordinate (lowestPointX, lowestPointY);	
	}
	
}
