package Practice_Set_1_VariablesAndDatatypes;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {

        /* Q4. Write a Java program that asks the user to enter his/her name and
               greets them with “Hello <name>, have a good day” text. */

        Scanner sc = new Scanner(System.in);

        System.out.println("Write your name");
        String name = sc.next();

        System.out.println("Hello " + name + " have a good day");
    }
}
