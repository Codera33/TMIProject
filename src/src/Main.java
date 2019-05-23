package src;

import java.io.IOException;

public class Main {
	
	public static void main(String args[]) throws IOException {
		
		Filedata fd = Preprocessor.preprocess("TestCase");
		
		if (fd.chosenAlgorithm == 1) {
			
			Algorithm1 alg = new Algorithm1(fd.circles);
			alg.run();
			
		} else if (fd.chosenAlgorithm == 2) {

			Algorithm2 alg = new Algorithm2(fd.circles);
			alg.run();

			
		} else if (fd.chosenAlgorithm == 3) {
			
		}
    }
}
