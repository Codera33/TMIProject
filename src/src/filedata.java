package src;

public class filedata {	

    public int chosenAlgorithm;
    public int amountOfCircles;
    public circle[] circles;
    private int freeIndex = 0;
    
    public filedata(int CA, int AoC) {
    	
    	chosenAlgorithm = CA;
    	amountOfCircles = AoC;
    	circles = new circle[amountOfCircles];
    	
    };
    
    public void addCircle (double radius, coordinate center) {
    	
    	circle c = new circle(center, radius);
    	circles[freeIndex] = c;
    	freeIndex++;
    	
    }
}
