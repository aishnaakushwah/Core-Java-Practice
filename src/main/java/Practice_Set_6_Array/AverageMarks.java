package Practice_Set_6_Array;

public class AverageMarks {
    public static void main(String[] args) {

        // Q3. Calculate the average marks from an array containing marks of all students in physics using a for-each loop.

        float [] marks = {14.5f, 67.90f, 90.8f, 77.0f, 89.4f};
        float sum = 0;
        for (float element:marks){
            sum = sum + element;
        }
        System.out.println("The average marks is " + sum/ marks.length);
    }
}
