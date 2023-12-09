package Practice_Set_6_Array;

public class CalculateSum {
    public static void main(String[] args) {

        // Q1. Create an array of 5 floats and calculate their sum.

        float [] marks = {14.5f, 67.90f, 90.8f, 77.0f, 89.4f};
        float sum = 0;
        for (float element:marks){
            sum = sum + element;
        }
        System.out.println("Sum of 5 floats is " + sum);
    }
}
