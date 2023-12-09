package Practice_Set_1_VariablesAndDatatypes;

import java.util.Scanner;

public class KilometersToMiles {
    public static void main(String[] args) {

        // Q5. Write a Java program to convert Kilometers to miles.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Distance in Kilometers: ");
        float km = sc.nextFloat();

        float miles = (float) (0.6213711922 * km);

        System.out.println("Distance in miles will be: "+miles);
    }
}
