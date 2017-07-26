//
// Bradley Lamitie
// Solved 7/26/2017
// Problem: Dice Cup
// Problem ID: dicecup
// Problem Link: https://open.kattis.com/problems/dicecup
// Difficulty: 1.2/10
// CPU Time Limit: 1 second
// Memory Limit: 1024 MB
// Current score: 10.8
//

package kattisQuestions;

// Import the Scanner
import java.util.Scanner;
import java.math.*;
public class DiceCup {
	
	// Instantiate the Scanner
	private static Scanner reader;

	public static void main(String[] args){
		
		// Set the scanner to take in input
		reader = new Scanner(System.in);  
		
		 int d1 = reader.nextInt();
		 int d2 = reader.nextInt();
		 
		 if(d1<=d2){
			 for(int i=d1+1;i<=d2+1;i++){
				 System.out.println(i);
			 }
		 }else{
			 for(int i=d2+1;i<=d1+1;i++){
				 System.out.println(i);
			 }
		 }
	}
}
