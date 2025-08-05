public class Resulting_Datatype_09 {
    public static void main(String[] args){

        /*
        RESULTING DATA TYPES

       Byte + short = int
       Short + int = int
       long + float = float
       int +float = float
       character + int = int
       character + short = int
       long + double = double
       float + double = double

         */
//byte x = 5;
//int y = 6;
//short z = 8;


       /*
       INCREMENT AND DECREMENT OPERATORS

        */
int i = 56;
// int b = i++  (This means first b is assigned i then i is incremented)
        int j = 70;
        // int b = ++j (this means first j is incremented then b is assigned j )
        System.out.println(i++);  //56
        System.out.println(i);    //57
        System.out.println(++i);  //58
        System.out.println(i);    //58

        /* similar is for decrement operators
        i-- and --i
         */

        /*
        even the character can be incremented or decremented

         */

        char ch = 'b';
        System.out.println(++ch);


    }
}
