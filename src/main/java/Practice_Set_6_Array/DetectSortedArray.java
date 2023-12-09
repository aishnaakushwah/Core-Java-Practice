package Practice_Set_6_Array;

public class DetectSortedArray {
    public static void main(String[] args) {

        // Q7. Write a Java program to find whether an array is sorted or not.

        int[] arr = {7, 17, -67, 9, 4, 55};
        boolean isSorted = true;
        for (int i=0; i<arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The Array is sorted.");
        } else {
            System.out.println("The Array is not sorted.");
        }
    }
}
