//
// Bradley Lamitie
// Solved 8/23/2018
// Problem: Seven Wonders
// Problem ID: sevenwonders
// Problem Link: https://open.kattis.com/problems/stararrangements
// Difficulty: 1.4/10
// CPU Time Limit: 1 second
// Memory Limit: 1024 MB
// Current score: 34.6
//
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class SevenWonders {
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		String hand = reader.next();
		int T = 0;
		int C = 0; 
		int G = 0;
		int sum = 0;
		for(int i = 0; i< hand.length(); i++){
			if(hand.substring(i, i+1).equals("T")){
				T += 1;
			}else if(hand.substring(i, i+1).equals("C")){
				C += 1;
			}else if(hand.substring(i, i+1).equals("G")){
				G += 1;
			}
		}
		if(C <= G && C <= T){
			sum += C * 7;
		}else if(G <= C && G <= T){
			sum += G * 7;
		}else if(T <= G && T <= C){
			sum += T * 7;
		}
		sum += (Math.pow(C, 2) + Math.pow(G, 2) + Math.pow(T, 2));
		System.out.print(sum);
	}
}
