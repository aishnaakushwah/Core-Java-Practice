package Practice_Set_1_VariablesAndDatatypes;

import java.util.Scanner;

public class DetectIntegerNo {
    public static void main(String[] args) {

        // Q6. Write a Java program to detect whether a number entered by the user is an integer or not.

        System.out.print("Enter the number: ");
        Scanner scanner= new Scanner(System.in);
        if(scanner.hasNextInt()){
            System.out.println("The number is an integer");
        }
        else{
            System.out.println("The number is not an integer");
        }
    }
}

