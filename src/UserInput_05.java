import java.util.Scanner;
public class UserInput_05 {

    public static void main(String[] args) {
       System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
//        System.out.println("ENTER NUMBER 1");
//        //int a = sc.nextInt();
//        float a = sc.nextFloat();
//        System.out.println("ENTER NUMBER 2");
//        //int b = sc.nextInt();
//        float b = sc.nextFloat();
//        System.out.println("The sum of these numbers is");
//       float sum = a + b ;
//
//        System.out.println(sum);

//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);

        String str = sc.nextLine(); // sc.next() only reads data before first space
        // and sc.nextLine() reads whole data whether there are spaces or not
        System.out.println(str);

    }

}
