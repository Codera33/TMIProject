package src;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class preprocessor {
	
	static final public filedata preprocess(String file) throws NumberFormatException, IOException {

		filedata fd;
		
		File f = new File("TestCase.txt");
	    Scanner input = new Scanner(f); 
		
		int algorithmNumber = Integer.parseInt(input.next());
		int amountOfCircles = Integer.parseInt(input.next());

		fd = new filedata(algorithmNumber, amountOfCircles);
		
		for (int i = 0; i < amountOfCircles; i++) {
			
			double x = Double.parseDouble(input.next());
			double y = Double.parseDouble(input.next());
			double radius = Double.parseDouble(input.next());
			
			coordinate center = new coordinate(x, y);
			
			fd.addCircle(radius, center);
			
		}
		
		return fd;
		
	}
	
}
