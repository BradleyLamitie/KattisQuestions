//
// Bradley Lamitie
// Solved 8/21/2018
// Problem: Zamka
// Problem ID: zamka
// Problem Link: https://open.kattis.com/problems/zamka
// Difficulty: 1.3/10
// CPU Time Limit: 1 second
// Memory Limit: 1024 MB
// Current score: 6.0
//
import java.util.Scanner;
public class Zamka {
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int L = reader.nextInt();
		int D = reader.nextInt();
		int X = reader.nextInt();
		int test = 0;
		int min = 0;
		int max = 0;
		for(int i = L; i <= D; i++){
			int sum = 0;
			test = i;
			while(test != 0){
				sum += (test % 10);
				test /= 10;
			}
			if(sum == X){
				min = i;
				break;
			}
		}
		for(int i = D; i >= L; i--){
			int sum = 0;
			test = i;
			while(test != 0){
				sum += (test % 10);
				test /= 10;
			}
			if(sum == X){
				max = i;
				break;
			}
		}
		System.out.println(min);
		System.out.println(max);
	}
}
