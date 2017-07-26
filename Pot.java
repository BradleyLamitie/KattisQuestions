//
// Bradley Lamitie
// Solved 7/26/2017
// Problem: Pot
// Problem ID: pot
// Problem Link: https://open.kattis.com/problems/pot
// Difficulty: 1.2/10
// CPU Time Limit: 1 second
// Memory Limit: 1024 MB
// Current score: 7.2
//

package kattisQuestions;

// Import the Scanner
import java.util.Scanner;

public class Pot {
	
	// Instantiate the Scanner
	private static Scanner reader;

	public static void main(String[] args){
		
		// Set the scanner to take in input
		reader = new Scanner(System.in);  
		
		final int quantity = reader.nextInt();
		int X = 0;
		
		for(int i=0;i<quantity;i++){
			int P = reader.nextInt();
			int base = P / 10;
			int exponent = P % 10;
			X += Math.pow(base, exponent);

		}
		System.out.println(X);
	}
}
