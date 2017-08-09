//
// Bradley Lamitie
// Solved 8/8/2017
// Problem: Planina
// Problem ID: planina
// Problem Link: https://open.kattis.com/problems/planina
// Difficulty: 1.3/10
// CPU Time Limit: 1 second
// Memory Limit: 1024 MB
// Current score: 26.9
//

package kattisQuestions;

// Import the Scanner
import java.util.Scanner;

public class Planina {
	
	// Instantiate the Scanner
	private static Scanner reader;
	
	
	public static void main(String[] args){
		// Set the scanner to take in input
			reader = new Scanner(System.in);  
		int iterations = reader.nextInt();
		int pointsStored = 0;
		
		// the amount of points needed to be stored is equal to :
		// (1+(2^iteration))^2
		pointsStored = (int) Math.pow(1 + Math.pow(2, iterations), 2);
		
		System.out.print(pointsStored);
	}
}
