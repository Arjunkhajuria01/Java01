import java.util.Scanner;
public class Exercise_01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("THE PERCENTAGE CALCULATOR");

        System.out.println("ENTER YOUR MARKS ");

        System.out.println("MATHS");
        float num1 = sc.nextFloat();


        System.out.println("C++");
        float num2 = sc.nextFloat();

        System.out.println("RDBMS");
        float num3 = sc.nextFloat();


        System.out.println("COA");
        float num4 = sc.nextFloat();


        System.out.println("NPTEL");
        float num5 = sc.nextFloat();
        float sum = num1 + num2 + num3 + num4 + num5 ;

        System.out.println("total marks");
        float total = sc.nextFloat();



        float percentage = (sum/total)*100;
        System.out.println("THE PERCENTAGE IS :");
        System.out.println(percentage);



    }
}
