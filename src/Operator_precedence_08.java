
//  PRECENDENCE AND ASSOCIATIVITY  IS THE "BODMAS" OF JAVA

public class Operator_precedence_08 {
    public static void main(String[] args){


        /*


        PRECEDENCE OF (*) , (/) AND (%)  IS EQUAL
        ASSOCIATIVITY OF (*) , (/) AND (%) IS FROM  (LEFT -> RIGHT)

        PRECEDENCE OF(+) , (-) IS EQUAL
        ASSOCIATIVITY OF (+) , (-) IS FORM  (LEFT -> RIGHT)

        PRECEDENCE OF(++) , (=) IS EQUAL
        ASSOCIATIVITY OF (++) , (=) IS FORM  (RIGHT -> LEFT)

        BASICALLY WHEN PRECEDENCE OF TWO OR MORE EXPRESSIONS IS SAME , IT IS EXECUTED
        ON FIRST COME FIRST SERV BASIS.  (NOT FOR ++ AND =)
        FOR EG :-

        a = b = 8;  first b os 8 then a is b that is 8

        Quick Quiz: How will you write the following expression in Java?
x-y/2
b*b-4*a*c/a*a


       */
        int a =7;
        int b = 0;
        int c = 9;
        System.out.println(a);
        System.out.println(b);
       int quad =  (b*b- 4*a*c)/(2*a);
        System.out.println(quad);



    }
}
