//
// Bradley Lamitie
// Solved 7/26/2017
// Problem: Solving For Carrots
// Problem ID: carrots
// Problem Link: https://open.kattis.com/problems/carrots
// Difficulty: 1.2/10
// CPU Time Limit: 1 second
// Memory Limit: 1024 MB
// Current score: 4.8
//

package kattisQuestions;

// Import the Scanner
import java.util.Scanner;

public class SolvingForCarrots {
	
	// Instantiate the Scanner
	private static Scanner reader;

	public static void main(String[] args){
		
		// Set the scanner to take in input
		reader = new Scanner(System.in);  
		
		reader.next();
		final int carrots = reader.nextInt();
		
		// Outputs the second integer 
		System.out.println(carrots);
		
	}
}
