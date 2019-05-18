package src;

public class circle {
	
	public double radius;
	
	public coordinate centerPoint;
	
	public coordinate leftestPoint;
	public coordinate rightestPoint;
	
	public coordinate highestPoint;
	public coordinate lowestPoint;
	
	public circle(coordinate center, double r) {
		
		radius = r;
		
		centerPoint = center;
		
		double leftestPointX = centerPoint.x - r;
		double leftestPointY = centerPoint.y;
		
		leftestPoint = new coordinate (leftestPointX, leftestPointY);

		double temp1 = centerPoint.x + r;
		double rightestPointX = Math.round(temp1 * 100.0) / 100.0;
		double rightestPointY = centerPoint.y;
		
		rightestPoint = new coordinate (rightestPointX, rightestPointY);
		
		double highestPointX = centerPoint.x;
		double temp2 = centerPoint.y + r;
		double highestPointY = Math.round(temp2 * 100.0) / 100.0;
		
		highestPoint = new coordinate (highestPointX, highestPointY);
		
		double lowestPointX = centerPoint.x;
		double lowestPointY = centerPoint.y - r;
		
		lowestPoint = new coordinate (lowestPointX, lowestPointY);	
	}
	
	
}
