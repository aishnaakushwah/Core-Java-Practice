package Practice_Set_5_Loops;

public class EvenNoSum {
    public static void main(String[] args) {

        // Q2. Write a program to sum first n even numbers using a while loop.

        int sum=0;
        int n=5;
        for(int i=0; i<n; i++){
            sum = sum + (2*i);               //    Even nos - (2i)   ||    Odd nos - (2i+1)
        }
        System.out.println("Sum of even numbers is: " + sum);
    }
}
