package src;

public class algorithm1 {
	
	circle[] circles;
	
	public algorithm1(circle[] c) {
		
		circles = new circle[c.length];
		System.arraycopy(c, 0, circles, 0, c.length);
		
	}
	
}
