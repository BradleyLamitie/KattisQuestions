//
// Bradley Lamitie
// Solved 8/8/2017
// Problem: Speed Limit
// Problem ID: speedlimit
// Problem Link: https://open.kattis.com/problems/speedlimit
// Difficulty: 1.3/10
// CPU Time Limit: 1 second
// Memory Limit: 1024 MB
// Current score: 23
//

package kattisQuestions;

// Import the Scanner
import java.util.Scanner;
public class SpeedLimit {
	
	// Instantiate the Scanner
	private static Scanner reader;
	
	
	public static void main(String[] args){
		// Set the scanner to take in input
			reader = new Scanner(System.in);  
				
		while(reader.hasNext()){
			int variants = reader.nextInt();
			int miles = 0;
			int duration = 0;
			int lastDuration = 0;
			if(variants == -1){
				break;
			}
			for(int i=0; i< variants; i++){
				int speed = reader.nextInt();
				duration = reader.nextInt();
				miles += (duration - lastDuration) * speed;
				lastDuration = duration; 
			}
			System.out.println(miles + " miles");
		}
	}
}
