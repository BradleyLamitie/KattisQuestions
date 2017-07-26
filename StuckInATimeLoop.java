//
// Bradley Lamitie
// Solved 7/26/2017
// Problem: Stuck In a Time Loop
// Problem ID: timeloop
// Problem Link: https://open.kattis.com/problems/timeloop
// Difficulty: 1.2/10
// CPU Time Limit: 1 second
// Memory Limit: 1024 MB
// Current score: 3.6
//

package kattisQuestions;

// Import the Scanner
import java.util.Scanner;

public class StuckInATimeLoop {
	
	// Instantiate the Scanner
	private static Scanner reader;

	public static void main(String[] args){
		
		// Set the scanner to take in input
		reader = new Scanner(System.in);  
		
		final int loop = reader.nextInt();
		
		// Repeat "Abracadabra" the amount of times specified by the user.
		for(int i=1;i<=loop;i++){
			System.out.println(i + " Abracadabra");
		}
	}
}