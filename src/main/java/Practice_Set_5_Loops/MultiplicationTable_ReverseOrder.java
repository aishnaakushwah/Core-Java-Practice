package Practice_Set_5_Loops;

public class MultiplicationTable_ReverseOrder {
    public static void main(String[] args) {

        // Q4. Write a program to print a multiplication table of 10 in reverse order.

        int n=10;
        for (int i=10; i>=1; i--){
            System.out.printf("%d X %d = %d\n", n, i, n*i);
        }
    }
}
