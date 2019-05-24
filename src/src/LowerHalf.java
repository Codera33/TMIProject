package src;

public class LowerHalf {
	

	public double radius;
	
	public Coordinate centerPoint;
	public Coordinate leftestPoint;
	public Coordinate rightestPoint;
	public Coordinate lowestPoint;
	
	public LowerHalf(Circle c) {
		
		radius = c.radius;
		centerPoint = c.centerPoint;
		leftestPoint = c.leftestPoint;
		rightestPoint = c.rightestPoint;
		lowestPoint = c.lowestPoint;
		
	}

}
