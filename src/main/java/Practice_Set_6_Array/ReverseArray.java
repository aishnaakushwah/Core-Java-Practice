package Practice_Set_6_Array;

public class ReverseArray {
    public static void main(String[] args) {

        // Q5. Write a Java program to reverse an array.

        int[] arr = {1,2,3,4,5,6};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;

        for (int i=0; i<n; i++){
            //Swap a[i] and a[l-1-i]
            temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp;
        }
        for (int element: arr){
            System.out.print(element + " ");
        }
    }
}
