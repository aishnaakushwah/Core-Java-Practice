package Practice_Set_6_Array;

public class DetectIntegerNo {
    public static void main(String[] args) {

        // Q2. Write a program to find out whether a given integer is present in an array or not.

        float [] marks = {14.5f, 67.90f, 90.8f, 77.0f, 89.4f};
        float num = 14.5f;
        boolean isInArray = false;
        for (float element:marks){
            if (num == element){
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println("The value is present in an array.");
        }
        else{
            System.out.println("The value is not present in an array.");
        }
    }
}
