package src;

import java.io.IOException;
import java.io.PrintWriter;

public class Main {
	
	public static void main(String args[]) throws IOException {
		
		Filedata fd = Preprocessor.preprocess("invoercirkels.txt");
		
		if (fd.chosenAlgorithm == 1) {
			
			Algorithm1 alg = new Algorithm1(fd.circles);
			alg.run();
			
		} else if (fd.chosenAlgorithm == 2) {

			Algorithm2 alg = new Algorithm2(fd.circles);
			alg.run();

			
		} else if (fd.chosenAlgorithm == 3) {
			
			Algorithm3 alg = new Algorithm3(fd.circles);
			alg.run();
			
		}
    }
}
