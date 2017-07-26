//
// Bradley Lamitie
// Solved 7/26/2017
// Problem: Faktor
// Problem ID: faktor
// Problem Link: https://open.kattis.com/problems/faktor
// Difficulty: 1.2/10
// CPU Time Limit: 1 second
// Memory Limit: 1024 MB
// Current score: 9.6
//

package kattisQuestions;

// Import the Scanner
import java.util.Scanner;

public class Faktor {
	
	// Instantiate the Scanner
	private static Scanner reader;

	public static void main(String[] args){
		
		// Set the scanner to take in input
		reader = new Scanner(System.in);  
		
		 int A = reader.nextInt();
		 int I = reader.nextInt();
		 I -=1;
		// by subtracting 1 from the impact factor needed and then 
		// multiplying by the articles published and then adding one, 
		// we get the bare minimum of scientists needed to be bribed. 
		System.out.println(A * I + 1);
	}
}
