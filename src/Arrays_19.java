
//Arrays in java
public class Arrays_19 {
    // 3 ways to list an array in java :
    public static void main(String[] args) {
// 1) DECLARATION AND MEMORY ALLOCATION
        int [] marks = new int[5];
       // this is initializaiton
        marks[0] = 4;
        marks[1]  = 100;
        marks[2] = 30;
        marks[3]= 40;
        marks[4] = 50;
// 2) DECLARATION AND THEN MEMORY ALLOCATION
        int[]marks2;
        marks2 = new int[10];

// 3) DECLARATION MEMORY ALLOCATION AND INITIALIZATION TOGETHER
        int[]marks3 = {22,34,45,67,10,80};
        System.out.println(marks3[2]);

        System.out.println(marks[3]);
    }

}

