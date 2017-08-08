//
// Bradley Lamitie
// Solved 8/8/2017
// Problem: Trik
// Problem ID: trik
// Problem Link: https://open.kattis.com/problems/trik
// Difficulty: 1.3/10
// CPU Time Limit: 1 second
// Memory Limit: 1024 MB
// Current score: 21.7
//

package kattisQuestions;

// Import the Scanner
import java.util.Scanner;
public class Trik {
	
	// Instantiate the Scanner
	private static Scanner reader;
	
	
	public static void main(String[] args){
		// Set the scanner to take in input
			reader = new Scanner(System.in);  
			
			String sequence = reader.nextLine();
			
			int cup = 1;
			for(int i=0; i< sequence.length(); i++){
				if(sequence.substring(i, i+1).equals("A")){
					if(cup == 1){
						cup = 2;
					}else if (cup == 2){
						cup = 1;
					}
				}else if(sequence.substring(i, i+1).equals("B")){
					if(cup == 2){
						cup = 3;
					}else if (cup == 3){
						cup = 2;
					}
				}else{
					if(cup == 1){
						cup = 3;
					}else if (cup == 3){
						cup = 1;
					}
				}
			}
			System.out.print(cup);
	}
}
