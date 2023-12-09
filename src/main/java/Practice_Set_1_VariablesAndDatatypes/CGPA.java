package Practice_Set_1_VariablesAndDatatypes;

public class CGPA {
    public static void main(String[] args) {

        // Q3. Write a program to calculate CGPA using marks of three subjects (out of 100)

       /* HOW TO CALCULATE CGPA
          First calculate the total percentage.
          Then, divide the percentage by 9.5 */

        float sub1 = 40.5f;
        float sub2 = 40f;
        float sub3 = 75.9f;
        float sum = sub1 + sub2 + sub3;
       // float percentage = (sum/300)*100;
        double CGPA = (sum/300)*100/9.5;
        System.out.println("CGPA of the student is : " + CGPA);
    }
}
