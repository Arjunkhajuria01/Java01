 //ARRAYS PRACTICE QUESTIONS

 import java.util.Scanner;


public class Exercise_06 {
    public static void main(String[] args) {
//        // Q1)
//        // Crete an Array of 5 floats and calculate their sum
//        float k = 0;
//        float num []  = {43.5f , 21.3f, 32.9f , 44.9f , 1.5f};
//        for(int i = 0 ; i< num.length; i++) {
//            System.out.println(num[i]);
//
//         k += num[i];
//
//        }
//        System.out.println("sum is = " + k);


//Q2) write a program to find out whether the given integer is present in the array or not .

        // step 1 ) creating an array
//        int a[] = {20,30,40,50,10,100,80,80,11,54,78,91};
//        // step 2) getting user input
//        Scanner sc = new Scanner(System.in);
//        System.out.println("ENTER THE VARIABLE TO CHECK");
//        int x  = sc.nextInt();
//        // step2) to find the given integer

//        for(int i= 0 ; i < a.length ; i++){
//            if (x == a[i]){
//                System.out.println("IDhAR HI HAI SALA");
//                break;
//
//                }
//            else {
//                System.out.println("nahi mila ");
//
//            }
//        }

// Q3) Calculate the average marks from an array containing marks of all students in physics using for each loop
         //first creating an array which has marks of all students , in physics ,
//        int x = 0;
//        int y = 0;
//        int marks[] = {99,20,43,52,89,90,73,62,40,100};
//        for (int elements : marks){
//            System.out.println(elements);
//            // avg formulae  = sum of all elements / number of elements
//            x += elements;
//        }
//        y = marks.length;
//   int average = x/y;
//        System.out.println(average);

        // Q4) Write a java program to add two matrices of size (2 x 3)

//int matrix1[][] = { {2 , 4 , 2},
//                    {1 ,2 , 1}  };
//
//int matrix2[][] = { {4 , 2 , 4},
//                     {2 ,1 , 2}  };
//
//for(int i = 0; i< matrix1.length ; i++){
//    for( int j = 0 ; j < matrix1[i].length ; j++){
//        System.out.print(matrix1[i][j]);
//        System.out.print(" ");
//    }
//    System.out.println();
//}
//
//        for(int i = 0; i< matrix2.length ; i++){
//            for( int j = 0 ; j < matrix2[i].length ; j++){
//                System.out.print(matrix2[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//        // we have to add these 2 matrices
//
//int matrix3[][] = { {matrix1[0][0]+matrix2[0][0] , matrix1[0][1]+ matrix2[0][1] , matrix1[0][2] + matrix2[0][2]},
//        {matrix1[1][0]+matrix2[1][0] , matrix1[1][1]+ matrix2[1][1] , matrix1[1][2] + matrix2[1][2]}
//        };
//        for(int i = 0; i< matrix3.length ; i++){
//            for( int j = 0 ; j < matrix3[i].length ; j++){
//                System.out.print(matrix3[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

// Q5) Write a java program to reverse an array ;

//int array[]= {1,2,3,4,5};
//for (int i = array.length - 1; i >=0 ; i--){
//    System.out.println(array[i]);
//
//}  // this is not reversing an array its just writing the values in reverse order
        // Reversing an array :-
        // first creating an array
        int []r = {10,20,30,40,50,60};

        // replacing the elements of the array
       int a = 0;
        for(a = 0 ; a < r.length/2; a++) {
            int temp  = r[a];

           r[a] = r[r.length -1 -a];
            r[r.length -1 -a] = temp;



        }
      for(int i = 0; i< r.length; i++ ){
            System.out.println(r[i]);
        }





    }
}
