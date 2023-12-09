package Practice_Set_6_Array;

public class DetectMaximumElement {
    public static void main(String[] args) {

        // Q6. Write a Java program to find the maximum/minimum element in an array.

        int[] arr = {7, 17, -67, 9, 4, 55};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        //MAXIMUM
        for (int element: arr){
            if (element>max){
                max = element;
            }
        }
        System.out.println("The value of the maximum element is: " + max);

        //MINIMUM
        for (int element: arr){
            if (element<min){
                min = element;
            }
        }
        System.out.println("The value of the minimum element is: " + min);
    }
}
