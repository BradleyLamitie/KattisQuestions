//
// Bradley Lamitie
// Solved 7/26/2017
// Problem: Aaah!
// Problem ID: aaah
// Problem Link: https://open.kattis.com/problems/aaah
// Difficulty: 1.5/10
// CPU Time Limit: 1 second
// Memory Limit: 1024 MB
// Current score: 15.9
//

package kattisQuestions;

// Import the Scanner
import java.util.Scanner;


public class Aaah {
    public static void main(String[] args){
    Scanner scan;           
    scan = new Scanner(System.in);
//scan = new Scanner(System.in);
    
   String   word1 = scan.next();
   String word2 = scan.next();
   
   if(word1.length()>= word2.length()){
       System.out.println("go");
   }else{
       System.out.println("no");

   }
    
    }
}

