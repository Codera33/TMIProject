package src;

public class UpperHalf {
	

	public double radius;
	
	public Coordinate centerPoint;
	public Coordinate leftestPoint;
	public Coordinate rightestPoint;
	public Coordinate highestPoint;
	
	public UpperHalf(Circle c) {
		
		radius = c.radius;
		centerPoint = c.centerPoint;
		leftestPoint = c.leftestPoint;
		rightestPoint = c.rightestPoint;
		highestPoint = c.highestPoint;
		
	}

}
