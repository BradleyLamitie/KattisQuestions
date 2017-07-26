//
// Bradley Lamitie
// Solved 7/26/2017
// Problem: Bijele
// Problem ID: bijele
// Problem Link: https://open.kattis.com/problems/bijele
// Difficulty: 1.2/10
// CPU Time Limit: 1 second
// Memory Limit: 1024 MB
// Current score: 13.2
//

package kattisQuestions;

// Import the Scanner
import java.util.Scanner;
public class Bijele {
	
	// Instantiate the Scanner
	private static Scanner reader;

	public static void main(String[] args){
		
		// Set the scanner to take in input
		reader = new Scanner(System.in);  
		
		 int king = 1- reader.nextInt();
		 int queen = 1- reader.nextInt();
		 int rook = 2 - reader.nextInt();
		 int bishop = 2 - reader.nextInt();
		 int knight = 2 - reader.nextInt();
		 int pawn = 8 - reader.nextInt();

		 // For each piece, find the number of pieces missing or in surplus
		 System.out.print(king + " " + queen + " " + rook + " " + bishop + " " + knight + " " + pawn);
	}
}
