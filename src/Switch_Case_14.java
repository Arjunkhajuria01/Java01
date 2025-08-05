import java.util.Scanner;
public class Switch_Case_14 {
    public static void main(String[] args) {

        //  SWITCH CASE CONTROL INSTRUCTIONS ARE USED WHEN WE HAVE TO MAKE A CHOICE
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your Age:");
//        int a = sc.nextInt();
//switch(a){
//    case 18:
//        System.out.println("you are going to become an adult");
//        break;   // break ka matlab hai switch ko tod do aur usse bahar aa jao
//                 // if we wont add break after every switch , then which ever switch will run , it would still print all other
//                 // conditions unnecessarily
//    case 23:
//        System.out.println("your are going to join a job");
//        break;
//    case 60:
//        System.out.println("You are going to retire");
//        break;
//    default:
//        System.out.println("Enjoy your life");




// now using strings
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter your Name:");
     String a = sc.nextLine();
     switch(a){
         case ("Arjun"):
             System.out.println("Your name is arjun");
             break;
         case("Vansh"):
             System.out.println("Your name is vansh");
             break;
         case("Arush"):
             System.out.println("Your name is Arush");
             break;
         case("Bhavan"):
             System.out.println("your name is Bhavan");
             break;
         default:
             System.out.println("JA NA BHOSIKE");



     }
























//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter your Age:");
//        int a = sc.nextInt();
//
//        if(a>60){
//            System.out.println("Your are experienced");
//            }
//        else if(a>=30 && a<60){
//            System.out.println("Yur are semi experienced");
//        }
//        else if(a<30 && a>20){
//            System.out.println("You are not experienced");
//        }
//        else {
//            System.out.println("Your are just a kid");
//        }











    }

}
