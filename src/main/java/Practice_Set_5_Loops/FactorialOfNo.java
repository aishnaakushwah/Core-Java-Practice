package Practice_Set_5_Loops;

import java.util.Scanner;

public class FactorialOfNo {
    public static void main(String[] args) {

        // Q5. Write a program to find the factorial of a given number using for loops. (Eg -> 5! = 5*4*3*2*1)

        Scanner sc = new Scanner(System.in);
        int factorial=1;
        int i=1;

        System.out.print("Enter the number whose factorial you want: ");
        int n = sc.nextInt();

        //Using For Loop
        for (i=1 ; i<=n ; i++){
            factorial = factorial*i;
        }
        System.out.println("Factorial using for loop is: " + factorial);

        //Using While Loop
        while (i<=n){
            factorial = factorial*i;
            i++;
        }
        System.out.println("Factorial using while loop is: " + factorial);

    }
}
