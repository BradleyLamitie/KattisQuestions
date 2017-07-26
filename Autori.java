//
// Bradley Lamitie
// Solved 7/26/2017
// Problem: Autori
// Problem ID: autori
// Problem Link: https://open.kattis.com/problems/autori
// Difficulty: 1.2/10
// CPU Time Limit: 1 second
// Memory Limit: 1024 MB
// Current score: 14.4
//

package kattisQuestions;

// Import the Scanner
import java.util.Scanner;
public class Autori {
	
	// Instantiate the Scanner
	private static Scanner reader;

	public static void main(String[] args){
		
		// Set the scanner to take in input
		reader = new Scanner(System.in);  
		String hyphenation = reader.next();
		System.out.print(hyphenation.charAt(0));
		for(int i = 0; i<hyphenation.length();i++){
			char letter = hyphenation.charAt(i);
			if(letter == '-'){
				System.out.print(hyphenation.charAt(i+1));
			}
		}
		
	}
}
