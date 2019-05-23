package src;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;

public class Algorithm3 {
	
	Circle[] circles;
	int amountOfCircles;
	
	public Algorithm3(Circle[] c) {
		
		circles = new Circle[c.length];
		System.arraycopy(c, 0, circles, 0, c.length);
		amountOfCircles = circles.length;
		
	}
}