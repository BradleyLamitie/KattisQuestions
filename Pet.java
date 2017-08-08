//
// Bradley Lamitie
// Solved 8/8/2017
// Problem: Pet
// Problem ID: pet
// Problem Link: https://open.kattis.com/problems/pet
// Difficulty: 1.2/10
// CPU Time Limit: 1 second
// Memory Limit: 1024 MB
// Current score: 20.4
//

package kattisQuestions;

// Import the Scanner
import java.util.Scanner;
public class Pet {
	
	// Instantiate the Scanner
	private static Scanner reader;
	
	
	public static void main(String[] args){
		// Set the scanner to take in input
			reader = new Scanner(System.in);  
				
		int highestScore = 0;
		int winner = 0;
		for(int i=0; i<5; i++){
			int currentScore = 0;
			for(int j=0; j<4; j++){
				int temp = reader.nextInt();
				currentScore += temp;
			}
			if(highestScore < currentScore){
				highestScore = currentScore;
				winner = i+1;
			}
		}
		System.out.println(winner + " " + highestScore);
	}
}
