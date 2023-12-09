package Practice_Set_7_Methods;

// Q6. Write a function to find the average of a set of numbers passed as arguments.

public class FindAverage_VarArg {

    static float avg(int... arr){
        float sum=0, average;
        for(int i=0; i<arr.length; i++){
            sum = sum+arr[i];
        }
        average = sum/arr.length;
        return average;
    }

    public static void main(String[] args) {
        System.out.println(avg(76, 88, 99, 56, 80, 45, 72));
    }
}
