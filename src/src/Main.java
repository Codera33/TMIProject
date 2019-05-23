package src;

import java.io.IOException;
import java.io.PrintWriter;

public class Main {
	
	public static void main(String args[]) throws IOException {

		/*
		PrintWriter writer = new PrintWriter("uitvoercirkels2.txt", "UTF-8");
		writer.println(2);
		writer.println(10000);
		
		for (int i = 0; i < 10000; i++) {
			
			writer.println(Math.random() + " " + Math.random() + " " + Math.random() * 0.1);

		}
		writer.close();
		*/
		
		Filedata fd = Preprocessor.preprocess("invoercirkels.txt");
		
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
