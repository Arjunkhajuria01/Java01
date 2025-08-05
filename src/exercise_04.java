import java.util.Scanner;
public class exercise_04 {
    public static void main(String[] args) {
        // some questions
        // question1
        // Write a program to find whether a student is pass or fail .
        // if it requires total 40 percent and at least 33 percent in each subject to pass , assume 3 subjects nd take
        // marks as an input from the user
//      Scanner sc = new Scanner(System.in)  ;
//        System.out.println("THE PASS OR FAIL CALCULATOR ");
//        System.out.println("ENTER YOUR MARKS");
//        System.out.printf("MATHS: ");
//        int sub1 = sc.nextInt();
//        System.out.printf("PHYSICS: ");
//        int sub2 = sc.nextInt();
//        System.out.printf("CHEMISTRY: ");
//        int sub3 = sc.nextInt();
//
//        int x = sub1+ sub2 +sub3 ;
//
//if(sub1>=33){
//    System.out.println("Your are pass in MATHS");
//}
//else{
//    System.out.println("YOU FAILED MATHS");
//}
//        if(sub2>=33){
//            System.out.println("Your are pass in PHYSICS");
//        }
//        else{
//            System.out.println("YOU FAILED PHYSICS");
//        }
//        if(sub3>=33){
//            System.out.println("Your are pass in CHEMISTRY");
//        }
//        else{
//            System.out.println("YOU FAILED CHEMISTRY");
//        }
//
//        if(x>=160){
//            System.out.println("YOUR ARE PASS OVERALL");
//        }
//        else{
//            System.out.println("YOU ARE FAIL OVERALL");
//        }
//
//
//        System.out.println("THANKS");
//
//
//
//
// Scanner sc = new Scanner(System.in) ;
//        System.out.println("THE INCOME TAX CALCULATOR");
//        System.out.println("ENTER YOUR INCOME IN LAKHS");
//        double x = sc.nextDouble();
//        System.out.println(x);
//        double y = x *100000;
//
//        if (y< 250000 ){
//            System.out.println("Congratulations no tax");
//
//        }
//        else if (y>=250000 && y<500000){
//            System.out.println("YOU HAVE TO PAY 5 % TAX");
//            double a = 0.05*y;
//            System.out.printf("YOUR TAX = %f", a);
//        }
//        else if (y>= 500000 && y<1000000){
//            System.out.println("YOU HAVE TO PAY 20% TAX");
//            double b = 0.2*y;
//            System.out.printf("YOUR TAX = %f ", b);
//        }
//        else if (y>= 1000000 ){
//            System.out.println("YOU HAVE TO PAY 30% TAX");
//            double c = 0.3*y;
//            System.out.printf("YOUR TAX = %f ", c);
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("LEAP YEAR CALCULATOR");
        System.out.println("ENTER THE YEAR: ");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("THIS IS A LEAP YEAR");
                } else {
                    System.out.println("THIS IS NOT A LEAP YEAR");
                }
            } else {
                System.out.println("THIS IS A LEAP YEAR");
            }
        } else {
            System.out.println("THIS IS NOT A LEAP YEAR");
        }

























    }
}
