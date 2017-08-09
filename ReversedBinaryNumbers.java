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

public class ReversedBinaryNumbers {
	
	// Instantiate the Scanner
	private static Scanner reader;
	
	
	public static void main(String[] args){
		// Set the scanner to take in input
			reader = new Scanner(System.in);  
			
		int decimal = reader.nextInt();
		
		// Convert the integer into a binary string
		String binary = Integer.toBinaryString(decimal);
		String reverseBinary = "";
		
		// Reverse the binary string and store it
		for(int i = binary.length()-1;i >= 0; i--){
			reverseBinary += binary.substring(i, i+1);
		}
		
		// Output the integer gained by passing the binary string through a radix of 2
		System.out.print(Integer.parseInt(reverseBinary, 2));
	}
}
