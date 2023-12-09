package Practice_Set_6_Array;

public class AddTwoMatrices {
    public static void main(String[] args) {

        // Q4. Create a Java program to add two matrices of size 2x3.

        int [][] mat1 = {{1,2,3},
                         {4,5,6}};
        int [][] mat2 = {{7,8,9},
                         {10,11,12}};
        int [][] result = {{0,0,0},
                           {0,0,0}};

        for (int i=0; i<mat1.length; i++){                     //row number of times
            for (int j=0; j<mat1[i].length; j++){              // column number of times
                System.out.format("Setting value for i=%d and j=%d\n", i, j);
                result[i][j] =mat1[i][j] + mat2[i][j];
            }
        }

        // Printing the elements of a 2-D array
        for (int i=0; i<mat1.length; i++){
            for (int j=0; j<mat1[i].length; j++){
                System.out.print(result[i][j] + " ");
                result[i][j] =mat1[i][j] + mat2[i][j];
            }
            System.out.println("");
        }
    }
}
