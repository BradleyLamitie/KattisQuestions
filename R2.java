//
// Bradley Lamitie
// Solved 7/26/2017
// Problem: R2
// Problem ID: r2
// Problem Link: https://open.kattis.com/problems/r2
// Difficulty: 1.2/10
// CPU Time Limit: 1 second
// Memory Limit: 1024 MB
// Current score: 6.0
//

package kattisQuestions;

// Import the Scanner
import java.util.Scanner;

public class R2 {
	
	// Instantiate the Scanner
	private static Scanner reader;

	public static void main(String[] args){
		
		// Set the scanner to take in input
		reader = new Scanner(System.in);  
		
		final int R1 = reader.nextInt();
		final int S  = reader.nextInt();
		
		// If (R1 + R2)/2 = S then, R2 = 2S - R1. 
		
		System.out.println(2 * S - R1);
		
	}
}
