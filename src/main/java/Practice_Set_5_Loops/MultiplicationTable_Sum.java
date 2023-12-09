package Practice_Set_5_Loops;

public class MultiplicationTable_Sum {
    public static void main(String[] args) {

        // Q6. Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.

        int sum=0;
        int n=8;
        for (int i=1; i<=10; i++){
            sum = sum + (n*i);
        }
        System.out.println("Sum of the numbers are: " + sum);
    }
}
