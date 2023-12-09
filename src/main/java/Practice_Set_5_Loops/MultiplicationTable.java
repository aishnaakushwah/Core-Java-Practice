package Practice_Set_5_Loops;

public class MultiplicationTable {
    public static void main(String[] args) {

        // Q3. Write a program to print the multiplication table of a given number n.

        int n=3;
        for (int i=1; i<=10; i++){
            System.out.printf("%d X %d = %d\n", n, i, n*i);
        }
    }
}
