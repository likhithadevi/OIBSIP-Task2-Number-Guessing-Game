import java.util.Scanner;
import java.util.Random;

public class GuessingNumber {
     public static void generateRandomNumber() {
    	Random random=new Random();
    	 int randomNumber=random.nextInt(100)+1;
    	 guessNumber(randomNumber);
    	 
     }
     public static void  guessNumber(int randomNumber) {
    	 Scanner p =new Scanner(System.in);
    	 System.out.println("WELCOME TO NUMBER GUESSING GAME");
    	 System.out.println("Guess a number");
    	 int guessNumber=p.nextInt();
    	 System.out.println("");
    	 
    	 if(guessNumber<0|| guessNumber>100)
    	 {
    		 System.out.println("Please guess a number between 0 to 100");
    		 guessNumber=p.nextInt();
    		 System.out.println("");	 
         }
    	 int k=0;
    	 while(guessNumber!=randomNumber) {
    		 k++;
    		 System.out.println("Wrong Guess.Try again:");
    		 guessNumber=p.nextInt();
    	
    	 
    	 while(guessNumber<0||guessNumber>100) {
    		 System.out.println("Please guess a number between 0 to 100");
    		 guessNumber=p.nextInt();
    	 } 
    	 }
    	 System.out.println("Hooray!!Corrent answer");
    	 System.out.println("Total Wrong Tries"+k);
    	 	 
    } 
}

