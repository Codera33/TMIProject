package src;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Preprocessor {
	
	static final public Filedata preprocess(String file) throws NumberFormatException, IOException {

		Filedata fd;
		
		File f = new File("invoercirkels.txt");
	    Scanner input = new Scanner(f); 
		
		int algorithmNumber = Integer.parseInt(input.next());
		int amountOfCircles = Integer.parseInt(input.next());

		fd = new Filedata(algorithmNumber, amountOfCircles);
		
		for (int i = 0; i < amountOfCircles; i++) {
			
			double x = Double.parseDouble(input.next());
			double y = Double.parseDouble(input.next());
			double radius = Double.parseDouble(input.next());
			
			Coordinate center = new Coordinate(x, y);
			
			fd.addCircle(radius, center);
			
		}
		
		input.close();
		
		return fd;
		
	}
	
}
