//
// Bradley Lamitie
// Solved 8/19/2018
// Problem: Batter Up
// Problem ID: batterup
// Problem Link: https://open.kattis.com/problems/batterup
// Difficulty: 1.2/10
// CPU Time Limit: 1 second
// Memory Limit: 1024 MB
// Current score: 30.6
//
import java.util.Scanner;
public class BatterUp {
	
	// Instantiate the Scanner
		private static Scanner reader;
	public static void main(String[] args){
		double batTotal = 0;
		double sluggingPercentage = 0.0;
		reader = new Scanner(System.in);
		double counter = reader.nextInt();
		double atBats = counter;
		for(int i = 0; i < counter; i++){
			double bat = reader.nextInt();
			if(bat >= 0){
				batTotal += bat;
			}else{
				atBats -= 1;
			}
		}
		sluggingPercentage = batTotal / atBats;
		System.out.println(sluggingPercentage);
	}
}
