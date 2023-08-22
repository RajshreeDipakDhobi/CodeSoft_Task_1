package my_java_project;

import java.util.Random;
import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.print("Hello java......");
        String again = "yes";
        Scanner sc = new Scanner(System.in);
        while(again.equals("yes"))
         {
        	Random random = new Random();
            int r_num = random.nextInt(100);
            int guess,i;
            int rounds = 5 ;
         {
            System.out.println("HELLO! Wel-Come");
            System.out.println("Please GUESS a number between '1 TO 100' ");
            System.out.println("You have Only 5 Atempt....BEST LUCK");
            System.out.println("Enter your guess number : ");

          for(i=0;i<rounds;i++)
           {
             guess = sc.nextInt();

        	if(guess == r_num)
        	{
                System.out.println("YOU WON THE GAME!!! CONGRATULATION***");
                System.out.println("Then number was : "+r_num);
        		System.out.println("");
                System.out.println("Your Score : "+((i)*10));
                System.out.println("Would you like to paly again!....Type 'yes'||'no' ");
                again = sc.next().toLowerCase();
                break;
        	}
        	else if(guess > r_num && i != rounds - 1)
        	{
        	
        		System.out.println("Guessed Number is Higher!... ");
        	}
        	else if(guess < r_num && i != rounds - 1)
        	{
        		
        		System.out.println("Guessed Number is Lower!... ");
        	}
        
        }
        	if(i == rounds)
        	{
        		System.out.println("");
        		System.out.println("'YOU LOSS!!!'  The right number is : "+r_num);
        		System.out.println("Would you like to paly again!....Type 'yes'||'no' ");
                again = sc.next().toLowerCase();
            }
        
        }

        }
	}

}
