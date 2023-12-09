package Practice_Set_7_Methods;

// Q1. Write a Java method to print the multiplication table of a number n.

public class MultiplicationTableOfN {

    static void multiplication(int n){
        for (int i=1; i<=10; i++){
            System.out.format("%d X %d = %d\n", n, i, n*i);
        }
    }

    public static void main(String[] args) {
        multiplication(7);
    }
}
