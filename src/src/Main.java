package src;

import java.io.IOException;
import java.io.PrintWriter;

public class Main {
	
	public static void main(String args[]) throws IOException {

		PrintWriter writer = new PrintWriter("uitvoercirkels2.txt", "UTF-8");
		int numberofpoints = 20000;
		writer.println(1);
		writer.println(numberofpoints);
		
		for (int i = 0; i < numberofpoints; i++) {
			
			writer.println(Math.random() + " " + Math.random() + " " + Math.random() * 0.2);

		}
		writer.close();
		
		Filedata fd = Preprocessor.preprocess("uitvoercirkels2.txt");
		
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
