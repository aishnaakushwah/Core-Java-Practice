package Practice_Set_7_Methods;

/* Q2. Write a program using functions to print the following pattern:  *      and     ****
                                                                        **             ***
                                                                        ***            **
                                                                        ****           *                   */

public class PrintPattern {

    static void pattern(int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i=n; i>0; i--) {
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(4);
        System.out.println("\n");
        pattern2(4);
    }
}