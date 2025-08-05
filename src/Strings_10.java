public class Strings_10 {
    public static void main(String[] args) {
        /*
        A String is a sequence of character

        String is basically a class
        so its initiated like this
        String name ;
        name = new String("ARJUN")
        but it can be used like a data type
        String name = "ARJUN

         */

        String name = "arjun";
        System.out.print("HI MY NAME IS :");
        System.out.println("ARJUN");


        /*
        Some format specifiers

         %d for int
         %f for float
         %c for char
         % for string

         */
        int a =6;
        float b = 6.989f;
        System.out.printf("the value of a is : %d and value of b is %.2f\n",a,b);

        System.out.format("HELLO my name is arjunn"); // same as soutprintf()

    }
}
