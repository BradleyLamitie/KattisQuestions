//
// Bradley Lamitie
// Solved 8/8/2017
// Problem: Sibice
// Problem ID: sibice
// Problem Link: https://open.kattis.com/problems/sibice
// Difficulty: 1.3/10
// CPU Time Limit: 1 second
// Memory Limit: 1024 MB
// Current score: 25.6
//

package kattisQuestions;

// Import the Scanner
import java.util.Scanner;
import java.math.*;
public class Sibice {
	
	// Instantiate the Scanner
	private static Scanner reader;
	
	
	public static void main(String[] args){
		// Set the scanner to take in input
			reader = new Scanner(System.in);  
				
		int matches = reader.nextInt();
		int width = reader.nextInt();
		int height = reader.nextInt();
		double longest =  Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
		for(int i=0; i<matches; i++){
			int matchLength = reader.nextInt();
			if(matchLength <= longest){
				System.out.println("DA");
			}else{
				System.out.println("NE");
			}
		}
	}
}
