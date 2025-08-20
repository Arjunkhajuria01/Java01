import java.util.Scanner;
public class Exercise_07 {
    static int table(int a){
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
    int b = 0;
   for (int i = 0 ; i <= 10 ; i++){
     b = a*i;
       System.out.println(b);
   }
   return b;
    }




    public static void main(String[] args) {
        //wirte a java program to do printmultiplication table of a number
      table(5);

    }
}
