package Practice_Set_7_Methods;

/* Q3. Write a program using recursion to print the following pattern:  *      and     ****
                                                                        **             ***
                                                                        ***            **
                                                                        ****           *                   */

public class RecursionPrintPattern {

    static void pattern(int n) {
        if (n>0) {
            pattern(n-1);
            for (int i=0; i<n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        if (n>0) {
            for (int i=n; i>0; i--) {
                System.out.print("*");
            }
            System.out.println();
            pattern2(n-1);
        }
    }

    public static void main(String[] args) {
        pattern(4);
        System.out.println("\n");
        pattern2(4);
    }
}
