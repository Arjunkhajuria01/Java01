// Multidimensional arrays
public class Multi_Dim_Array_21 {
    public static void main(String[] args) {
        //Multidimensional Arrays are aarays of arrray ;
        // Each element of of a MUlti_D array is an array itself
        int[]marks ; //1 d array
        int[][]marks2; //2d array
        marks2 = new int[2][3];  // this means 2 rows and three columns
        marks2[0][0] = 10;
        marks2[0][1] = 32;
        marks2[0][2] = 54;
        marks2[1][0] = 23;
        marks2[1][1] = 67;
        marks2[1][2] = 21;

        // Printing a 2-D Array using for loops
        for(int i= 0; i< marks2.length ; i++) {
            for (int j = 0; j <marks2[i].length; j++) {
                System.out.print(marks2[i][j]);
                System.out.print("  ");

            }
            System.out.println();
        }


    }
}
