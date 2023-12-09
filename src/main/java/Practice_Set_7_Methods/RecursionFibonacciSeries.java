package Practice_Set_7_Methods;

// Q5. Write a function to print the nth term of the Fibonacci series using recursion.
// Fibonacci series -> 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……

public class RecursionFibonacciSeries {

    static int fib(int n){
        if(n==1 || n==2){
            return n-1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }

    public static void main(String[] args) {
        int result = fib(7);
        System.out.println(result);
    }
}
