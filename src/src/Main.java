package src;

import java.io.IOException;

public class Main {
	
	public static void main(String args[]) throws IOException {
		
		Filedata fd = Preprocessor.preprocess("TestCase");
		
		if (fd.chosenAlgorithm == 1) {
			
			Algorithm1 alg1 = new Algorithm1(fd.circles);
			alg1.run();
			
		} else if (fd.chosenAlgorithm == 2) {
			
		} else if (fd.chosenAlgorithm == 3) {
			
		}
    }
}
