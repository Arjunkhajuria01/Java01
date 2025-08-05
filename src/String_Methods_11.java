public class String_Methods_11 {
    public static void main(String[] args) {
        String name = "HARRY";
        // STRINGS ARE IMMUTABLE , AND CANNOT BE CHANGED , but below  we are reffering to the new point

        System.out.println(name.length());
//name.length() returns the length of the string

        System.out.println(name.toLowerCase());
        // .toLowerCase converts to lowercse

        System.out.println(name.toUpperCase());
        // .toUpperCase converts to uppercase

        String nontrimmedstring = "   Harry     ";
        System.out.println(nontrimmedstring.trim());
        // .trim removes the spaces at the from=nt and at the end of the string

        System.out.println(name.substring(2));
        System.out.println(name.substring(2,4));  //4 is not included
        //.substring can give you the part of the string depending on the input you give

        System.out.println(name.replace("R","P"));
        System.out.println(name.replace("RRY","PPY"));
        //.replace(r, p)  : - replaces r with p

        System.out.println(name.startsWith("HAR"));
        //.startswith tells if its true or false

        System.out.println(name.endsWith("RRY"));
        // similar to .start with

        System.out.println(name.charAt(2));
        //returns the character at the given index

        System.out.println(name.indexOf("R"));
        //returns the index of the first character of the provided string

        System.out.println(name.lastIndexOf("R"));
        // you can also use index : int  to start from particular point

        System.out.println(name.equals("HARRIS"));
        // checks whether the given value is equal to that in the original string

        System.out.println(name.equalsIgnoreCase("harry"));
        // ignores the case senstivity for the method equals








    }
}
