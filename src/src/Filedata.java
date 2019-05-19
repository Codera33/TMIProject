package src;

public class Filedata {	

    public int chosenAlgorithm;
    public int amountOfCircles;
    public Circle[] circles;
    private int freeIndex = 0;
    
    public Filedata(int CA, int AoC) {
    	
    	chosenAlgorithm = CA;
    	amountOfCircles = AoC;
    	circles = new Circle[amountOfCircles];
    	
    };
    
    public void addCircle (double radius, Coordinate center) {
    	
    	Circle c = new Circle(center, radius);
    	circles[freeIndex] = c;
    	freeIndex++;
    	
    }
}
