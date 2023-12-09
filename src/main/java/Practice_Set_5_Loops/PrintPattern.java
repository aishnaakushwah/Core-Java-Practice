package Practice_Set_5_Loops;

public class PrintPattern {
    public static void main(String[] args) {

        /* Q1. Write a program to print the following pattern : ****
                                                                ***
                                                                **
                                                                *                   */

        int n = 4;
        for(int i=n; i>0; i--){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
