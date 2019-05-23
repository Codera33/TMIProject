package src;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Main {
	
	public static void main(String args[]) throws IOException {

		/*
		PrintWriter writer = new PrintWriter("uitvoercirkels2.txt", "UTF-8");
		writer.println(2);
		writer.println(5000);
		
		for (int i = 0; i < 5000; i++) {
			
			writer.println(Math.random() + " " + Math.random() + " " + Math.random() * 0.3);

		}
		writer.close();
		*/
		
		Filedata fd = Preprocessor.preprocess("uitvoercirkels2.txt");
		
		if (fd.chosenAlgorithm == 1) {
			
			Algorithm1 alg = new Algorithm1(fd.circles);
			alg.run();
			
		} else if (fd.chosenAlgorithm == 2) {

			Algorithm1 alg1 = new Algorithm1(fd.circles);
			alg1.run();
			Algorithm2 alg = new Algorithm2(fd.circles);
			alg.run();

			
		} else if (fd.chosenAlgorithm == 3) {
			
		}
    }
}
