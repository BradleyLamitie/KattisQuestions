//
// Bradley Lamitie
// Solved 8/19/2018
// Problem: Hissing Microphone
// Problem ID: hissingmicrophone
// Problem Link: https://open.kattis.com/problems/hissingmicrophone
// Difficulty: 1.2/10
// CPU Time Limit: 1 second
// Memory Limit: 1024 MB
// Current score: 29.4
//
import java.util.Scanner;
public class HissingMicrophone {
	
	// Instantiate the Scanner
		private static Scanner reader;
	public static void main(String[] args){
		Boolean veritas = false;
		reader = new Scanner(System.in);
		String word = reader.next();
		for(int i = 0; i < word.length() - 1; i++){
			String sub = word.substring(i, i+2);
			if(sub.equals("ss")){
				veritas = true;
			}
		}
		if(veritas){
			System.out.print("hiss");
		}else{
			System.out.print("no hiss"); 
		}
	}
}
