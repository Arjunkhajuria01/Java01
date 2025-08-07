public class Arrays02_20 {
    public static void main(String[] args) {
        int [] marks = {30, 55 , 71, 62 , 80 };
//        System.out.println(marks[0]);
//
//        // .length command
//        System.out.println(marks.length);
//
//        // To create a floating point array
//
//        float [] marks2 = {30,20, 50 , 22 , 43, 90};
//
//        // String arrays
//        String [] students = {"harry", " arjun", " bhavan"};
//


        // DISPLAYING AN ARRAY (NAIVE APPROACH)
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);

        //DISPLAYING AN ARRAY USING FOR LOOP
        for (int i =0; i< marks.length; i++){
            System.out.println( (i) + " <- index  ,  value ->" + marks[i]);
        }

        // DISPLAYING AN ARRAY USING "FOR EACH LOOP"
        for ( int elements : marks){
            System.out.println(elements);
        }

    }
}
