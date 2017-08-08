//
// Bradley Lamitie
// Solved 8/8/2017
// Problem: Tarifa
// Problem ID: tarifa
// Problem Link: https://open.kattis.com/problems/tarifa
// Difficulty: 1.2/10
// CPU Time Limit: 1 second
// Memory Limit: 1024 MB
// Current score: 19.2
//

package kattisQuestions;

// Import the Scanner
import java.util.Scanner;
public class Tarifa {
	
	// Instantiate the Scanner
	private static Scanner reader;

	public static void main(String[] args){
		
		// Set the scanner to take in input
		reader = new Scanner(System.in);  
		int minutes = reader.nextInt();
		int months = reader.nextInt();
		int minutesLeft = 0;
		for(int i=0; i< months; i++){
			int minutesUsed = minutes - reader.nextInt();
			minutesLeft += minutesUsed;
		}
		System.out.print(minutesLeft + minutes);
	}
}