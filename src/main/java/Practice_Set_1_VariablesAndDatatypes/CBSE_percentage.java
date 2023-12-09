package Practice_Set_1_VariablesAndDatatypes;

import java.util.Scanner;

public class CBSE_percentage {
    public static void main(String[] args) {

        /* Q1. Write a program to calculate the percentage of a given student in the CBSE board exam.
               His marks from 5 subjects must be taken as input from the keyboard. (Marks are out of 100) */

        System.out.println("Calculate CBSE percentage");
        Scanner sc = new Scanner(System.in);

        System.out.println("Subject 1 marks");
        float subject1 = sc.nextFloat();
        System.out.println("Subject 2 marks");
        float subject2 = sc.nextFloat();
        System.out.println("Subject 3 marks");
        float subject3 = sc.nextFloat();
        System.out.println("Subject 4 marks");
        float subject4 = sc.nextFloat();
        System.out.println("Subject 5 marks");
        float subject5 = sc.nextFloat();

        float total = subject1 + subject2 + subject3 + subject4 + subject5;

        float percentage = (total/500)*100;
        System.out.println("Percentage of the student is : " + percentage);
    }
}
