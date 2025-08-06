package org.example;

public class Multidimensional_arrays {
    public static void main(String[] args) {
        int[] oneDimArray = {1,2,3};
        int[][] twoDimArray = {
                {1,2,3},
                {4},
                {5,6,7,8,9}
        }; // doesnt have to be the same size
        String[][] twoDimArray2 = new String[2][3]; //when initialize like this - each row will have 3 columns
        //but if you declare - you can create rows with diff number of columns

        System.out.println(twoDimArray2[0][1]);
        System.out.println(twoDimArray[2][3]);

        for (int i=0; i<twoDimArray.length;i++){
            for (int j=0; j<twoDimArray[i].length;j++){        //two dim array in java is array of arrays
                System.out.print(twoDimArray[i][j]+" ");
            }
            System.out.println();
        }





        //notes:
        //int x; <- declares
        //x = 5; <- initialize
        //int x = 5; <- declare + initialize in 1

        //int is a primitive data type
        //String is a reference data type (points to object)

        //int x;
        //Java assigns default value of 0;

        //String s;
        //s is null
        //Java has no assignment, so s points to no object, null

        //null is not ""
        //"" is actual string, just empty
        //null is no object at all

        //primitive variable:
        //actually stores the value. like a box

        //reference variable:
        //stores memory address of an object
        //points to where the object is stored in memory

    }
}
