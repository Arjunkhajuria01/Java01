import java.util.Scanner;
import java.util.Random;
public class Rock_Paper_Scissors {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("Shake your Fist : ");
        String b = sc.nextLine();
        if (b == "rock"){
            System.out.println("You chose rock");
        }
        else if(b == "paper"){
            System.out.println("you chose paper");
        }
        else if(b == "scissors"){
            System.out.println("You chose scissors");
        }

        Random rd = new Random();
// generating some random integers;

        int a  = rd.nextInt(3);
        System.out.println(a);

        if (a ==0 ){
            System.out.println("Computer chose rock");
        }
        else if(a==1){
            System.out.println("Computer chose paper");
        }
        else{
            System.out.println("Computer chose scissors");
        }

        // result
        System.out.println("RESULT:");
        //rock

        if (b.equalsIgnoreCase("rock") && a==0){
            System.out.println("tie");
        }

        else if(b.equalsIgnoreCase("rock") && a ==1){
            System.out.println("YOU LOOSE");
        }
        else if(b.equalsIgnoreCase("rock") && a==2){
            System.out.println("YOU WON");
        }
//paper
        if (b.equalsIgnoreCase("paper") && a==0){
            System.out.println("YOU WON");
        }
        else if(b.equalsIgnoreCase("paper") && a ==1){
            System.out.println("Tie");
        }
        else if(b.equalsIgnoreCase("paper") && a==2){
            System.out.println("YOU LOOSE");
        }

//scissors
        if (b.equalsIgnoreCase("scissors") && a==0){
            System.out.println("YOU LOOSE");
        }
        else if(b.equalsIgnoreCase("scissors") && a ==1){
            System.out.println("YOU WON");
        }
        else if(b.equalsIgnoreCase("scissors") && a==2){
            System.out.println("Tie");
        }

    }
}
