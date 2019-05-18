package src;

import java.io.IOException;

public class main {
	
	public static void main(String args[]) throws IOException {
		
		filedata fd = preprocessor.preprocess("TestCase");
		
		if (fd.chosenAlgorithm == 1) {
			
			algorithm1 alg1 = new algorithm1(fd.circles);
			
		}
		
    }
}
