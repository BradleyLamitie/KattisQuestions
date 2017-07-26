//
// Bradley Lamitie
// Solved 7/26/2017
// Problem: Oddities
// Problem ID: oddities
// Problem Link: https://open.kattis.com/problems/oddities
// Difficulty: 1.2/10
// CPU Time Limit: 1 second
// Memory Limit: 1024 MB
// Current score: 8.4
//

package kattisQuestions;

// Import the Scanner
import java.util.Scanner;

public class Oddities {
	
	// Instantiate the Scanner
	private static Scanner reader;

	public static void main(String[] args){
		
		// Set the scanner to take in input
		reader = new Scanner(System.in);  
		
		final int numbers = reader.nextInt();
		
		for(int i=0; i<numbers; i++){
			int temp = reader.nextInt();
			if(temp % 2 == 0){
				System.out.println(temp + " is even");
			} else {
				System.out.println(temp + " is odd");

			}
		}
		
	}
}
