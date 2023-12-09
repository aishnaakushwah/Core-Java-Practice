package Practice_Set_7_Methods;

// Q4. Write a recursive function to calculate the sum of first n natural numbers.

public class RecursionSum {

    static int sum(int n){
        if(n==1){
            return 1;
        }
        return n + sum(n-1);
    }

    public static void main(String[] args) {
        int c = sum(3);
        System.out.println(c);
    }
}
