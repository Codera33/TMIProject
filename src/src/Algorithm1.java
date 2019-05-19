package src;

public class Algorithm1 {
	
	Circle[] circles;
	
	public Algorithm1(Circle[] c) {
		
		circles = new Circle[c.length];
		System.arraycopy(c, 0, circles, 0, c.length);
		
	}
	
	public void run() {
		
	}
	
}
