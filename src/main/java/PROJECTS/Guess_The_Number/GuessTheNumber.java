package PROJECTS.Guess_The_Number;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int secretNumber = r.nextInt(100);
        int turns=0;

        System.out.println("Guess a number between 1 to 100, You will have 10 turns!" );
        System.out.println("Best of luck!");

        int i=0;
        boolean win=false;

        while(win==false) {
            System.out.print("\nGuess The Number: ");
            int guess = sc.nextInt();
            turns++;

            if(guess==secretNumber) {
                win=true;
            }
            else if(i>8){
                System.out.println("You loose! the right answer was: " + secretNumber);
                return;
            }
            else if(guess<secretNumber){
                i++;
                System.out.println("Yor Guess is lower than the Secret Number! Turns left: " + (10-i));
            }
            else if(guess>secretNumber) {
                i++;
                System.out.println("Your Guess Is Higher Than THe Secret Number! Turns left: " + (10-i));
            }
        }

        System.out.println("Congratulations! You guessed the number!");
        System.out.println("\nYou used " + turns + " turns to guess the right number");
        System.out.println("Your score is " + ((11-turns)*10) + " out of 100");

    }
}