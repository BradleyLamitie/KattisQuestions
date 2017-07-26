//
// Bradley Lamitie
// Solved 7/26/2017
// Problem: Take Two Stones
// Problem ID: twostones
// Problem Link: https://open.kattis.com/problems/twostones
// Difficulty: 1.2/10
// CPU Time Limit: 1 second
// Memory Limit: 1024 MB
// Current score: 2.4
//

package kattisQuestions;

// Import the Scanner
import java.util.Scanner;

public class TakeTwoStones {
	
	// Instantiate the Scanner
	private static Scanner reader;

	public static void main(String[] args){
		
		// Set the scanner to take in input
		reader = new Scanner(System.in);  
		
		final int stones = reader.nextInt();
		
		// If the stones on the ground are even, bob will win. If they are odd, Alice wins.
		if(stones%2==0){
			System.out.println("Bob");
		}else{
			System.out.println("Alice");
		}
	}
}
