//
// Bradley Lamitie
// Solved 7/26/2017
// Problem: Cold-puter Science
// Problem ID: cold
// Problem Link: https://open.kattis.com/problems/cold
// Difficulty: 1.2/10
// CPU Time Limit: 1 second
// Memory Limit: 1024 MB
// Current score: 12.0
//

package kattisQuestions;

// Import the Scanner
import java.util.Scanner;
public class ColdputerScience {
	
	// Instantiate the Scanner
	private static Scanner reader;

	public static void main(String[] args){
		
		// Set the scanner to take in input
		reader = new Scanner(System.in);  
		
		 int temps = reader.nextInt();
		 int negatives = 0;
		 
		 // For every temperature check if its less than 0. If it is increment counter
		 for(int i=0; i< temps;i++){
			 int temp = reader.nextInt();
			 if(temp < 0){
				 negatives++;
			 }
		 }
		 System.out.println(negatives);
	}
}
