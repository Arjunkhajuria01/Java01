public class Methods_22 {
    // A method is a function written inside a class

    // SYNTAX OF A METHOD / FUNCTION
    // datatype name () {
    /* mathod body */


    //     }

    // and example of a sum method
    static int mysum(int a , int b ){
        int c = a+b;
        return c;
    }
    public static void main(String[] args) {
// to call a method we have to create an object of it or can directly call it if the method is static

        int result = mysum(7,9);
        System.out.println(result);

    }
}
