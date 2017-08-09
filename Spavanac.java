//
// Bradley Lamitie
// Solved 8/8/2017
// Problem: Spavanac
// Problem ID: spavanac
// Problem Link: https://open.kattis.com/problems/spavanac
// Difficulty: 1.3/10
// CPU Time Limit: 1 second
// Memory Limit: 1024 MB
// Current score: 24.3
//

package kattisQuestions;

// Import the Scanner
import java.util.Scanner;
public class Spavanac {
	
	// Instantiate the Scanner
	private static Scanner reader;
	
	
	public static void main(String[] args){
		// Set the scanner to take in input
			reader = new Scanner(System.in);  
			
			int hours = reader.nextInt();
			int minutes = reader.nextInt();
			
			if(minutes - 45 < 0){
				hours -= 1;
				minutes +=60; 
			}
			
			minutes -= 45;

			if(hours < 0){
				hours = 23;
			}
			
			System.out.println(hours + " " + minutes);
		
	}
}
